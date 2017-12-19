# Working with Human Resources in Workday

[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview 
The following operations allow you to work with "human resources". Click an operation name to see details on how to use it.

For a sample proxy service that illustrates how to work with "human resources", see [[  Sample configuration  ]](#sample-configuration).

| Operation        | Description |
| ------------- |:-------------|
| [getAcademicAppointmentTrackAdditionalData](#get-academic-appointment-track-additional-data)    | Get academic appointment track additional data |
| [getAcademicRanks](#get-academic-ranks)    | Get academic ranks details |
| [getAcademicUnitHierarchies](#get-academic-unit-hierarchies)    | Get academic unit hierarchies details |
| [getAcademicUnits](#get-academic-units)    | Get academic units details |
| [getCompanyInsiderTypes](#get-company-insider-types)    | Get company insider types details |
| [getDifficultyToFill](#get-difficultyToFill)    | Get difficulty to fill details |
| [getDisabilities](#get-disabilities)    | Get disabilities details |
| [getEthnicities](#get-ethnicities)    | Get ethnicities details |
| [getFrequencies](#get-frequencies)    | Get frequencies details |
| [getGenderIdentities](#get-gender-identities)    | Get gender identities details |
| [getJobCategories](#get-job-categories)    | Get job categories details |
| [getWorkers](#get-workers)    | Get workers details |

### Operation details
This section provides details on the operations.

#### Get Academic Appointment Track Additional Data
The getAcademicAppointmentTrackAdditionalData operation is used to get academic appointment track additional data in Workday.

**getAcademicAppointmentTrackAdditionalData**
```xml
<workday.getAcademicAppointmentTrackAdditionalData>
    <workdayGetAcademicAppointmentTrackAdditionalDataRecords>{$ctx:workdayGetAcademicAppointmentTrackAdditionalDataRecords}</workdayGetAcademicAppointmentTrackAdditionalDataRecords>
</workday.getAcademicAppointmentTrackAdditionalData>
```

**Properties**
* workdayGetAcademicAppointmentTrackAdditionalDataRecords: One or more records that needs to be added for example "academicAppointmentTrackId".

**Sample request**

Following is a sample SOAP request that can be handled by the getAcademicAppointmentTrackAdditionalData operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Appointment_Track_Additional_Data.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Appointment_Track_Additional_Data.html)

#### Get Academic Ranks
The getAcademicRanks operation is used to get academic ranks details in Workday.

**getAcademicRanks**
```xml
<workday.getAcademicRanks>
    <workdayGetAcademicRanksRecords>{$ctx:workdayGetAcademicRanksRecords}</workdayGetAcademicRanksRecords>
</workday.getAcademicRanks>
```

**Properties**
* workdayGetAcademicRanksRecords: One or more records that needs to be added for example "academicRankId".

**Sample request**

Following is a sample SOAP request that can be handled by the getAcademicRanks operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Ranks.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Ranks.html)

#### Get Academic Unit Hierarchies
The getAcademicUnitHierarchies operation is used to get academic unit hierarchies details in Workday. 

**getAcademicUnitHierarchies**
```xml
<workday.getAcademicUnitHierarchies>
    <workdayGetAcademicUnitHierarchiesRecords>{$ctx:workdayGetAcademicUnitHierarchiesRecords}</workdayGetAcademicUnitHierarchiesRecords>
</workday.getAcademicUnitHierarchies>
```

**Properties**
* workdayGetAcademicUnitHierarchiesRecords: One or more records that needs to be added for example "academicUnitHierarchyId".

**Sample request**

Following is a sample SOAP request that can be handled by the getAcademicUnitHierarchies operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Unit_Hierarchies.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Unit_Hierarchies.html)

#### Get Academic Units

The getAcademicUnits operation is used to get academic units details in Workday.

**getAcademicUnits**
```xml
<workday.getAcademicUnits>
    <workdayGetAcademicUnitsRecords>{$ctx:workdayGetAcademicUnitsRecords}</workdayGetAcademicUnitsRecords>
</workday.getAcademicUnits>
```

**Properties**
* workdayGetAcademicUnitsRecords: One or more records that needs to be added for example "academicUnitId".

**Sample request**

Following is a sample SOAP request that can be handled by the getAcademicUnits operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Units.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Academic_Units.html)

#### Get Company Insider Types

The getCompanyInsiderTypes operation is used to get company insider types details in Workday.

**getCompanyInsiderTypes**
```xml
<workday.getCompanyInsiderTypes>
    <workdayGetCompanyInsiderTypesRecords>{$ctx:workdayGetCompanyInsiderTypesRecords}
    </workdayGetCompanyInsiderTypesRecords>
</workday.getCompanyInsiderTypes>
```

**Properties**
* workdayGetCompanyInsiderTypesRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getCompanyInsiderTypes operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Company_Insider_Types.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Company_Insider_Types.html)

#### Get Difficulty To Fill

The getDifficultyToFill operation is used to get difficulty to fill details in Workday.

**getDifficultyToFill**
```xml
<workday.getDifficultyToFill>
    <workdayGetDifficultyToFillRecords>{$ctx:workdayGetDifficultyToFillRecords}</workdayGetDifficultyToFillRecords>
</workday.getDifficultyToFill>
```

**Properties**
* workdayGetDifficultyToFillRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getDifficultyToFill operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Difficulty_to_Fill.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Difficulty_to_Fill.html)

#### Get Disabilities

The getDisabilities operation is used to get disabilities details in Workday.

**getDifficultyToFill**
```xml
<workday.getDisabilities>
    <workdayGetDisabilitiesRecords>{$ctx:workdayGetDisabilitiesRecords}</workdayGetDisabilitiesRecords>
</workday.getDisabilities>
```

**Properties**
* workdayGetDisabilitiesRecords: One or more records that needs to be added for example "disabilityId".

**Sample request**

Following is a sample SOAP request that can be handled by the getDisabilities operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Disabilities.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Disabilities.html)

#### Get Ethnicities

The getEthnicities operation is used to get ethnicities details in Workday.

**getEthnicities**
```xml
<workday.getEthnicities>
    <workdayGetEthnicitiesRecords>{$ctx:workdayGetEthnicitiesRecords}</workdayGetEthnicitiesRecords>
</workday.getEthnicities>
```

**Properties**
* workdayGetEthnicitiesRecords: One or more records that needs to be added for example "ethnicityId".

**Sample request**

Following is a sample SOAP request that can be handled by the getEthnicities operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Ethnicities.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Ethnicities.html)

#### Get Frequencies

The getFrequencies operation is used to get frequencies details in Workday.

**getFrequencies**
```xml
<workday.getFrequencies>
    <workdayGetFrequenciesRecords>{$ctx:workdayGetFrequenciesRecords}</workdayGetFrequenciesRecords>
</workday.getFrequencies>
```

**Properties**
* workdayGetFrequenciesRecords: One or more records that needs to be added for example "frequencyId".

**Sample request**

Following is a sample SOAP request that can be handled by the getFrequencies operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Frequencies.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Frequencies.html)

#### Get Gender Identities

The getGenderIdentities operation is used to get gender identities details in Workday.

**getGenderIdentities**
```xml
<workday.getGenderIdentities>
    <workdayGetGenderIdentitiesRecords>{$ctx:workdayGetGenderIdentitiesRecords}</workdayGetGenderIdentitiesRecords>
</workday.getGenderIdentities>
```

**Properties**
* workdayGetGenderIdentitiesRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getGenderIdentities operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Gender_Identities.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Gender_Identities.html)

#### Get Job Categories

The getJobCategories operation is used to get job categories details in Workday.

**getJobCategories**
```xml
<workday.getJobCategories>
    <workdayGetJobCategoriesRecords>{$ctx:workdayGetJobCategoriesRecords}</workdayGetJobCategoriesRecords>
</workday.getJobCategories>
```

**Properties**
* workdayGetJobCategoriesRecords: One or more records that needs to be added.

**Sample request**

Following is a sample SOAP request that can be handled by the getJobCategories operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Job_Categories.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Job_Categories.html)

#### Get Workers

The getWorkers operation is used to get workers details in Workday.

**getWorkers**
```xml
<workday.getWorkers>
    <workdayGetWorkersRecords>{$ctx:workdayGetWorkersRecords}</workdayGetWorkersRecords>
</workday.getWorkers>
```

**Properties**
* workdayGetWorkersRecords: One or more records that needs to be added for example "employeeId".

**Sample request**

Following is a sample SOAP request that can be handled by the getWorkers operation.

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

[https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Workers.html](https://community.workday.com/sites/default/files/file-hosting/productionapi/Human_Resources/v29.0/Get_Workers.html)

### Sample configuration
Following is a sample proxy service that illustrates how to connect to Workday with the init operation and use the getAcademicAppointmentTrackAdditionalData operation. The sample request for this proxy can be found in [getAcademicAppointmentTrackAdditionalData sample request](#get-academic-appointment-track-additional-data). You can use this sample as a template for using other operations in this category.

**Sample Proxy**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<proxy xmlns="http://ws.apache.org/ns/synapse"
       name="getAcademicAppointmentTrackAdditionalData"
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
         <property expression="//workdayGetAcademicAppointmentTrackAdditionalDataRecords/*" name="workdayGetAcademicAppointmentTrackAdditionalDataRecords"/>
         <workday.init>
            <workdayUserName>{$ctx:workdayUserName}</workdayUserName>           
            <workdayPassword>{$ctx:workdayPassword}</workdayPassword>
            <workdayBlockingInvocation>false</workdayBlockingInvocation>
            <workdayApiVersion>{$ctx:workdayApiVersion}</workdayApiVersion>
            <workdayApiUrl>{$ctx:workdayApiUrl}</workdayApiUrl>
            <workdayTenantId>{$ctx:workdayTenantId}</workdayTenantId>
         </workday.init>
         <workday.getAcademicAppointmentTrackAdditionalData>
             <workdayGetAcademicAppointmentTrackAdditionalDataRecords>{$ctx:workdayGetAcademicAppointmentTrackAdditionalDataRecords}</workdayGetAcademicAppointmentTrackAdditionalDataRecords>
         </workday.getAcademicAppointmentTrackAdditionalData>
         <respond/>
      </inSequence>
   </target>
   <description/>
</proxy>  
```