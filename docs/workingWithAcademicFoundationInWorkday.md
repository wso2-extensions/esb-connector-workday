# Working with Academic Foundation in Workday

[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview 
The following operation allows you to work with the academic foundation web service. Click the operation name to see details on how to use it.

For a sample proxy service that illustrates how to work with the academic foundation web service, see [Sample configuration](#sample-configuration).

| Operation        | Description |
| ------------- |:-------------|
| [getMaintainedAcademicPeriods](#retrieving-maintained-academic-periods)    | Retrieves maintained academic period details |

### Operation details
This section provides more details on the operation.

#### Retrieving maintained academic periods
The getMaintainedAcademicPeriods operation retrieves academic period details that are maintained in Workday.

**getMaintainedAcademicPeriods**
```xml
<workday.getMaintainedAcademicPeriods>
    <workdayGetMaintainedAcademicPeriodsRecords>{$ctx:workdayGetMaintainedAcademicPeriodsRecords}</workdayGetMaintainedAcademicPeriodsRecords>
</workday.getMaintainedAcademicPeriods>
```

**Properties**
* workdayGetMaintainedAcademicPeriodsRecords: One or more criteria based on what you want returned within the academic period details response. For example, if you want to retrieve academic period details by the academic period ID, you can specify "academicPeriodId" as one of the critera.

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
Following is a sample proxy service that illustrates how to connect to Workday with the init operation, and then use the getMaintainedAcademicPeriods operation. The sample request for this proxy can be found in [getMaintainedAcademicPeriods sample request](#request).

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
