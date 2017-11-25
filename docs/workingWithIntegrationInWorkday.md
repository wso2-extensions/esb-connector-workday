# Working with Integration in Workday

[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview 
The following operations allow you to work with "integrations". Click an operation name to see details on how to use it.

For a sample proxy service that illustrates how to work with "integrations", see [[  Sample configuration  ]](#sample-configuration).

| Operation        | Description |
| ------------- |:-------------|
| [getIntegrationEvents](#get-integration-events)    | Get integration events details |
| [getIntegrationSystems](#get-integration-systems)    | Get integration systems details |
| [getSequenceGenerators](#get-sequence-generators)    | Get sequence generators details |
| [getSubscriptions](#get-subscriptions)    | Get subscriptions details |
| [incrementSequenceGenerator](#increment-sequence-generator)    | Increment sequence generator details |

### Operation details
This section provides details on the operations.

#### Get Integration Events
The getIntegrationEvents operation is used to get integration events details in Workday.

**getIntegrationEvents**
```xml
<workday.getIntegrationEvents>
    <workdayGetIntegrationEventsRecords>{$ctx:workdayGetIntegrationEventsRecords}</workdayGetIntegrationEventsRecords>
</workday.getIntegrationEvents>
```

**Properties**
* workdayGetIntegrationEventsRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getIntegrationEvents operation.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
        <workdayUserName>sample@tenant</workdayUserName>       
        <workdayPassword>samplepassword</workdayPassword>
        <workdayApiVersion>v29.0</workdayApiVersion>
        <workdayApiUrl>https://wd5-impl-services1.workday.com</workdayApiUrl>
        <workdayTenantId>tenant</workdayTenantId> 
    </soapenv:Body>
</soapenv:Envelope>
```

**Related Workday documentation**

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Integration_Events.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Integration_Events.html)

#### Get Integration Systems
The getIntegrationSystems operation is used to get integration systems details in Workday.

**getIntegrationSystems**
```xml
<workday.getIntegrationSystems>
    <workdayGetIntegrationSystemsRecords>{$ctx:workdayGetIntegrationSystemsRecords}</workdayGetIntegrationSystemsRecords>
</workday.getIntegrationSystems>
```

**Properties**
* workdayGetIntegrationSystemsRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getIntegrationSystems operation.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
        <workdayUserName>sample@tenant</workdayUserName>       
        <workdayPassword>samplepassword</workdayPassword>
        <workdayApiVersion>v29.0</workdayApiVersion>
        <workdayApiUrl>https://wd5-impl-services1.workday.com</workdayApiUrl>
        <workdayTenantId>tenant</workdayTenantId>    
    </soapenv:Body>
</soapenv:Envelope>
```

**Related Workday documentation**

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Integration_Systems.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Integration_Systems.html)

#### Get Sequence Generators
The getSequenceGenerators operation is used to get sequence generators details in Workday.

**getSequenceGenerators**
```xml
<workday.getSequenceGenerators>
    <workdayGetSequenceGeneratorsRecords>{$ctx:workdayGetSequenceGeneratorsRecords}</workdayGetSequenceGeneratorsRecords>
</workday.getSequenceGenerators>
```

**Properties**
* workdayGetSequenceGeneratorsRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getSequenceGenerators operation.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
        <workdayUserName>sample@tenant</workdayUserName>       
        <workdayPassword>samplepassword</workdayPassword>
        <workdayApiVersion>v29.0</workdayApiVersion>
        <workdayApiUrl>https://wd5-impl-services1.workday.com</workdayApiUrl>
        <workdayTenantId>tenant</workdayTenantId>      
    </soapenv:Body>
</soapenv:Envelope>
```

**Related Workday documentation**

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Sequence_Generators.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Sequence_Generators.html)

#### Get Subscriptions
The getSubscriptions operation is used to get subscriptions details in Workday. 

**getSubscriptions**
```xml
<workday.getSubscriptions>
    <workdayGetSubscriptionsRecords>{$ctx:workdayGetSubscriptionsRecords}</workdayGetSubscriptionsRecords>
</workday.getSubscriptions>
```

**Properties**
* workdayGetSubscriptionsRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getSubscriptions operation.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
        <workdayUserName>sample@tenant</workdayUserName>       
        <workdayPassword>samplepassword</workdayPassword>
        <workdayApiVersion>v29.0</workdayApiVersion>
        <workdayApiUrl>https://wd5-impl-services1.workday.com</workdayApiUrl>
        <workdayTenantId>tenant</workdayTenantId>      
    </soapenv:Body>
</soapenv:Envelope>
```

**Related Workday documentation**

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Subscriptions.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Get_Subscriptions.html)

#### Increment Sequence Generator
The incrementSequenceGenerator operation is used to get increment sequence generator details in Workday.

**incrementSequenceGenerator**
```xml
<workday.incrementSequenceGenerator>
    <workdayDescriptor>{$ctx:workdayDescriptor}</workdayDescriptor>
    <workdaySequenceGeneratorIdType>{$ctx:workdaySequenceGeneratorIdType}</workdaySequenceGeneratorIdType>
    <workdaySequenceGeneratorId>{$ctx:workdaySequenceGeneratorId}</workdaySequenceGeneratorId>
</workday.incrementSequenceGenerator>
```

**Properties**
* workdayDescriptor: The descriptor, whether true or false.
* workdaySequenceGeneratorIdType: The sequence generator ID type.
* workdaySequenceGeneratorId: The sequence generator ID.

**Sample request**

Following is a sample SOAP request that can be handled by the incrementSequenceGenerator operation.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Header/>
   <soapenv:Body>
        <workdayUserName>sample@tenant</workdayUserName>       
        <workdayPassword>samplepassword</workdayPassword>
        <workdayApiVersion>v29.0</workdayApiVersion>
        <workdayApiUrl>https://wd5-impl-services1.workday.com</workdayApiUrl>
        <workdayTenantId>tenant</workdayTenantId>
        <workdayDescriptor>false</workdayDescriptor>           
        <workdaySequenceGeneratorIdType>Sequence_Generator_ID</workdaySequenceGeneratorIdType>
        <workdaySequenceGeneratorId>POSITIVE_PAY_FILE_ID</workdaySequenceGeneratorId>
</soapenv:Body>
</soapenv:Envelope>
```

**Related Workday documentation**

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Increment_Sequence_Generator.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Integrations/v29.0/Increment_Sequence_Generator.html)

### Sample configuration
Following is a sample proxy service that illustrates how to connect to Workday with the init operation and use the getIntegrationEvents operation. The sample request for this proxy can be found in [getIntegrationEvents sample request](#get-integration-events). You can use this sample as a template for using other operations in this category.

**Sample Proxy**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<proxy xmlns="http://ws.apache.org/ns/synapse"
       name="getIntegrationEvents"
       startOnLoad="true"
       statistics="disable"
       trace="disable"
       transports="http,https">
   <target>
      <inSequence>
         <property expression="//workdayUserName/text()" name="workdayUserName"/>        
         <property expression="//workdayPassword/text()" name="workdayPassword"/>
         <property expression="//workdayApiVersion/text()" name="workdayApiVersion"/>
         <property expression="//workdayApiUrl/text()" name="workdayApiUrl"/>
         <property expression="//workdayTenantId/text()" name="workdayTenantId"/>
         <property expression="//workdayGetIntegrationEventsRecords/*" name="workdayGetIntegrationEventsRecords"/>
         <workday.init>
            <workdayUserName>{$ctx:workdayUserName}</workdayUserName>           
            <workdayPassword>{$ctx:workdayPassword}</workdayPassword>
            <workdayBlockingInvocation>false</workdayBlockingInvocation>
            <workdayApiVersion>{$ctx:workdayApiVersion}</workdayApiVersion>
            <workdayApiUrl>{$ctx:workdayApiUrl}</workdayApiUrl>
            <workdayTenantId>{$ctx:workdayTenantId}</workdayTenantId>
         </workday.init>
         <workday.getIntegrationEvents>
            <workdayGetIntegrationEventsRecords>{$ctx:workdayGetIntegrationEventsRecords}</workdayGetIntegrationEventsRecords>
         </workday.getIntegrationEvents>
         <respond/>
      </inSequence>
   </target>
   <description/>
</proxy>   
```