package org.wso2.carbon.connector.integration.test.workday;

/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axis2.AxisFault;
import org.apache.synapse.MessageContext;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.connector.integration.test.base.ConnectorIntegrationTestBase;

import java.util.HashMap;
import java.util.Map;

public class WorkdayConnectorIntegrationTest extends ConnectorIntegrationTestBase {

    private final String SOAP_HEADER_XPATH_EXP = "/soapenv:Envelope/soapenv:Header/*";
    private final String SOAP_BODY_XPATH_EXP = "/soapenv:Envelope/soapenv:Body/*";
    private Map<String, String> nameSpaceMap = new HashMap<String, String>();

    /**
     * Set up the environment.
     */
    @BeforeClass(alwaysRun = true)
    public void setEnvironment() throws Exception {
        String connectorName = System.getProperty("connector_name") + "-connector-" +
                System.getProperty("connector_version") + ".zip";
        init(connectorName);
        nameSpaceMap.put("bsvc", "urn:com.workday/bsvc");
        nameSpaceMap.put("env", "http://schemas.xmlsoap.org/soap/envelope");
        nameSpaceMap.put("wd", "urn:com.workday/bsvc");
        nameSpaceMap.put("SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/");
    }

    /**
     * Positive test case for getAcademicAppointmentTrackAdditionalData method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicAppointmentTrackAdditionalData} integration test with mandatory parameters.")
    public void testGetAcademicAppointmentTrackAdditionalDataWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicAppointmentTrackAdditionalDataMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getAcademicAppointmentTrackAdditionalData method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicAppointmentTrackAdditionalData} integration test with optional parameters.")
    public void testGetAcademicAppointmentTrackAdditionalDataWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicAppointmentTrackAdditionalDataOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getAcademicAppointmentTrackAdditionalData method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicAppointmentTrackAdditionalData} integration test with negative case.")
    public void testGetAcademicAppointmentTrackAdditionalDataWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicAppointmentTrackAdditionalDataNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getAcademicRanks method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicRanks} integration test with mandatory parameters.")
    public void testGetAcademicRanksWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicRanksMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getAcademicRanks method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicRanks} integration test with optional parameters.")
    public void testGetAcademicRanksWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicRanksOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getAcademicRanks method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicRanks} integration test with negative case.")
    public void testGetAcademicRanksWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicRanksNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getAcademicUnitHierarchies method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnitHierarchies} integration test with mandatory parameters.")
    public void testGetAcademicUnitHierarchiesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitHierarchiesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getAcademicUnitHierarchies method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnitHierarchies} integration test with optional parameters.")
    public void testGetAcademicUnitHierarchiesWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitHierarchiesOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getAcademicUnitHierarchies method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnitHierarchies} integration test with negative case.")
    public void testGetAcademicUnitHierarchiesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitHierarchiesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getAcademicUnits method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnits} integration test with mandatory parameters.")
    public void testGetAcademicUnitsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getAcademicUnits method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnits} integration test with optional parameters.")
    public void testGetAcademicUnitsWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitsOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getAcademicUnits method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getAcademicUnits} integration test with negative case.")
    public void testGetAcademicUnitsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetAcademicUnitsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getCompanyInsiderTypes method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getCompanyInsiderTypes} integration test with mandatory parameters.")
    public void testGetCompanyInsiderTypesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetCompanyInsiderTypesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getCompanyInsiderTypes method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getCompanyInsiderTypes} integration test with negative case.")
    public void testGetCompanyInsiderTypesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetCompanyInsiderTypesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getDifficultyToFill method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getDifficultyToFill} integration test with mandatory parameters.")
    public void testGetDifficultyToFillWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetDifficultyToFillMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getDifficultyToFill method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getDifficultyToFill} integration test with negative case.")
    public void testGetDifficultyToFillWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetDifficultyToFillNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getDisabilities method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getDisabilities} integration test with mandatory parameters.")
    public void testGetDisabilitiesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetDisabilitiesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getDisabilities method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getDisabilities} integration test with optional parameters.")
    public void testGetDisabilitiesWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetDisabilitiesOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getDisabilities method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getDisabilities} integration test with negative case.")
    public void testGetDisabilitiesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetDisabilitiesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getEthnicities method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getEthnicities} integration test with mandatory parameters.")
    public void testGetEthnicitiesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetEthnicitiesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getEthnicities method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getEthnicities} integration test with optional parameters.")
    public void testGetEthnicitiesWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetEthnicitiesOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getEthnicities method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getEthnicities} integration test with negative case.")
    public void testGetEthnicitiesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetEthnicitiesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getFrequencies method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getFrequencies} integration test with mandatory parameters.")
    public void testGetFrequenciesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetFrequenciesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getFrequencies method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getFrequencies} integration test with optional parameters.")
    public void testGetFrequenciesWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetFrequenciesOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getFrequencies method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getFrequencies} integration test with negative case.")
    public void testGetFrequenciesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetFrequenciesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getGenderIdentities method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getGenderIdentities} integration test with mandatory parameters.")
    public void testGetGenderIdentitiesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetGenderIdentitiesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getGenderIdentities method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getGenderIdentities} integration test with negative case.")
    public void testGetGenderIdentitiesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetGenderIdentitiesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getIntegrationEvents method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getIntegrationEvents} integration test with mandatory parameters.")
    public void testGetIntegrationEventsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetIntegrationEventsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getIntegrationEvents method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getIntegrationEvents} integration test with negative case.")
    public void testGetIntegrationEventsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetIntegrationEventsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getIntegrationSystems method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getIntegrationSystems} integration test with mandatory parameters.")
    public void testGetIntegrationSystemsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetIntegrationSystemsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getIntegrationSystems method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getIntegrationSystems} integration test with negative case.")
    public void testGetIntegrationSystemsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetIntegrationSystemsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getJobCategories method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getJobCategories} integration test with mandatory parameters.")
    public void testGetJobCategoriesWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetJobCategoriesMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getJobCategories method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getJobCategories} integration test with negative case.")
    public void testGetJobCategoriesWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetJobCategoriesNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getMaintainedAcademicPeriods method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getMaintainedAcademicPeriods} integration test with mandatory parameters.")
    public void testGetMaintainedAcademicPeriodsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetMaintainedAcademicPeriodsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getMaintainedAcademicPeriods method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getMaintainedAcademicPeriods} integration test with optional parameters.")
    public void testGetMaintainedAcademicPeriodsWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetMaintainedAcademicPeriodsOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /*
     * Negative test case for getMaintainedAcademicPeriods method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getMaintainedAcademicPeriods} integration test with negative case.")
    public void testGetMaintainedAcademicPeriodsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetMaintainedAcademicPeriodsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getSequenceGenerators method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSequenceGenerators} integration test with mandatory parameters.")
    public void testGetSequenceGeneratorsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSequenceGeneratorsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getSequenceGenerators method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSequenceGenerators} integration test with optional parameters.")
    public void testGetSequenceGeneratorsWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSequenceGeneratorsOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getSequenceGenerators method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSequenceGenerators} integration test with negative case.")
    public void testGetSequenceGeneratorsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSequenceGeneratorsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getSubscriptions method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSubscriptions} integration test with mandatory parameters.")
    public void testGetSubscriptionsWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSubscriptionsMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Positive test case for getSubscriptions method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSubscriptions} integration test with optional parameters.")
    public void testGetSubscriptionsWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSubscriptionsOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getSubscriptions method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getSubscriptions} integration test with negative case.")
    public void testGetSubscriptionsWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetSubscriptionsNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for incrementSequenceGenerator method with mandatory parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {incrementSequenceGenerator} integration test with mandatory parameters.")
    public void testIncrementSequenceGeneratorWithMandatoryParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiIncrementSequenceGeneratorMandatory.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for incrementSequenceGenerator method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {incrementSequenceGenerator} integration test with negative case.")
    public void testIncrementSequenceGeneratorWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiIncrementSequenceGeneratorNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }

    /**
     * Positive test case for getWorkers method with optional parameters.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getWorkers} integration test with optional parameters.")
    public void testGetWorkersWithOptionalParameters() throws Exception {
        SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetWorkersOptional.xml", null, "mediate",
                SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);

        OMElement eiResponseElement = AXIOMUtil.stringToOM(eiSoapResponse.getBody().toString());
        String xPathExp = "string(/env:Body/text())";
        String eiResponse = (String) xPathEvaluate(eiResponseElement, xPathExp, nameSpaceMap);
        Assert.assertNotNull(eiResponse);
    }

    /**
     * Negative test case for getWorkers method with Negative case.
     */
    @Test(groups = {"wso2.ei"}, description = "workday {getWorkers} integration test with negative case.")
    public void testGetWorkersWithNegativeCase() throws Exception {
        String eiFaultCodeElement = "";
        try {
            SOAPEnvelope eiSoapResponse = sendSOAPRequest(proxyUrl, "eiGetWorkersNegative.xml", null, "mediate",
                    SOAP_HEADER_XPATH_EXP, SOAP_BODY_XPATH_EXP);
        } catch (AxisFault af) {
            eiFaultCodeElement = af.getFaultCodeElement().getText();
        }
        Assert.assertEquals(eiFaultCodeElement,"SOAP-ENV:Client.validationError");
    }
}
