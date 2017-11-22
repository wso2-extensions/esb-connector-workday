/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.connector.workday;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.SynapseException;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.wso2.carbon.connector.core.AbstractConnector;
import org.wso2.carbon.connector.core.ConnectException;

/**
 *  This mediator would set username and password in to client option to create the user name token.
 *  User name password can be extracted from message context or even external sources such as databases.
 */
public class UTTokenBuilder extends AbstractConnector {
    private static final Log log = LogFactory.getLog(UTTokenBuilder.class);

    public void connect(MessageContext messageContext) {
        if (log.isDebugEnabled()) {
            log.debug("UT Token Builder mediator is invoked");
        }
        try {
            org.apache.axis2.context.MessageContext context = ((Axis2MessageContext) messageContext).getAxis2MessageContext();
            // retrieve user name from configured property value in message context.
            String userName = (String) messageContext.getProperty("workdayUserName");
            // retrieve user name from configured property value in message context.
            String password = (String) messageContext.getProperty("workdayPassword");

            if (StringUtils.isEmpty(userName)) {
                throw new ConnectException("Username can not be null");
            }
            if (StringUtils.isEmpty(password)) {
                throw new ConnectException("Password can not be null");
            }
            context.getOptions().setUserName(userName);
            context.getOptions().setPassword(password);
        } catch (Exception e) {
            log.error("Error while building UT Token", e);
            //throw new SynapseException("Error while building UT Token", e);
            handleException("Error while building UT Token", e, messageContext);
        }
    }
}