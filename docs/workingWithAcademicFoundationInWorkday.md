# Working with Academic Foundation in Workday

[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview 
The following operations allow you to work with "academic foundation". Click an operation name to see details on how to use it.

For a sample proxy service that illustrates how to work with "academic foundation", see [[  Sample configuration  ]](#sample-configuration).

| Operation        | Description |
| ------------- |:-------------|
| [getMaintainedAcademicPeriods](#get-maintained-academic-periods)    | Get maintained academic periods details |

### Operation details
This section provides details on the operations.

#### Get maintained academic periods
The getMaintainedAcademicPeriods operation is used to get maintained academic periods details in Workday.

**getMaintainedAcademicPeriods**
```xml
<workday.getMaintainedAcademicPeriods>
    <workdayGetMaintainedAcademicPeriodsRecords>{$ctx:workdayGetMaintainedAcademicPeriodsRecords}</workdayGetMaintainedAcademicPeriodsRecords>
</workday.getMaintainedAcademicPeriods>
```

**Properties**
* workdayGetMaintainedAcademicPeriodsRecords: One or more records that needs to be added for example "academicPeriodId".

**Sample request**

Following is a sample SOAP request that can be handled by the getMaintainedAcademicPeriods operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Academic_Foundation/v29.0/Get_Maintained_Academic_Periods.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Academic_Foundation/v29.0/Get_Maintained_Academic_Periods.html)

### Sample configuration
Following is a sample proxy service that illustrates how to connect to Workday with the init operation and use the getMaintainedAcademicPeriods operation. The sample request for this proxy can be found in [getMaintainedAcademicPeriods sample request](#request). You can use this sample as a template for using other operations in this category.

**Sample Proxy**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<proxy xmlns="http://ws.apache.org/ns/synapse"
       name="getMaintainedAcademicPeriods"
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
         <property expression="//workdayGetMaintainedAcademicPeriodsRecords/*" name="workdayGetMaintainedAcademicPeriodsRecords"/>
         <workday.init>
            <workdayUserName>{$ctx:workdayUserName}</workdayUserName>
            <workdayPassword>{$ctx:workdayPassword}</workdayPassword>
            <workdayBlockingInvocation>false</workdayBlockingInvocation>
            <workdayApiVersion>{$ctx:workdayApiVersion}</workdayApiVersion>
            <workdayApiUrl>{$ctx:workdayApiUrl}</workdayApiUrl>
            <workdayTenantId>{$ctx:workdayTenantId}</workdayTenantId>
         </workday.init>
         <workday.getMaintainedAcademicPeriods>
            <workdayGetMaintainedAcademicPeriodsRecords>{$ctx:workdayGetMaintainedAcademicPeriodsRecords}</workdayGetMaintainedAcademicPeriodsRecords>
         </workday.getMaintainedAcademicPeriods>
         <respond/>
      </inSequence>
   </target>
   <description/>
</proxy>   
```