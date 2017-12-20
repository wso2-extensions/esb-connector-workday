# Working with Human Resources in Workday

[[  Overview ]](#overview)  [[ Operation details ]](#operation-details)  [[  Sample configuration  ]](#sample-configuration)

### Overview 
The following operations allow you to work with the human resources web service. Click an operation name to see details on how to use it.

For a sample proxy service that illustrates how to work with the human resources web service, see [[Sample configuration]](#sample-configuration).

| Operation        | Description |
| ------------- |:-------------|
| [getAcademicAppointmentTrackAdditionalData](#retrieving-academic-appointment-track-details)    | Retrieves additional details related to academic appointment tracks |
| [getAcademicRanks](#retrieving-academic-rank-details)    | Retrieves details related to academic ranks |
| [getAcademicUnitHierarchies](#retrieving-academic-unit-hierarchy-details)    | Retrieves details related to academic unit hierarchies |
| [getAcademicUnits](#retrieving-academic-unit-details)    | Retrieves details related to academic units |
| [getCompanyInsiderTypes](#retrieving-company-insider-type-details)    | Retrieves details related to company insider types |
| [getDifficultyToFill](#retrieving-the-difficulty-level-of-filling-a-job-profile)    | Retrieves details related to the difficulty level of filling a job profile |
| [getDisabilities](#retrieving-disability-details)    | Retrieves details related to disabilities |
| [getEthnicities](#retrieving-ethnicity-details)    | Retrieves details related to ethnicities |
| [getFrequencies](#retrieving-frequency-details)    | Retrieves details related to frequencies |
| [getGenderIdentities](#retrieving-gender-identity-details)    | Retrieves details related to gender identities |
| [getJobCategories](#retrieving-job-category-details)    | Retrieves details related to job categories |
| [getWorkers](#retrieving-worker-details)    | Retrieves details related to workers |

### Operation details
This section provides more details on the operations.

#### Retrieving academic appointment track details
The getAcademicAppointmentTrackAdditionalData operation retrieves additional details related to academic appointment tracks, based on the criteria that you specify.

**getAcademicAppointmentTrackAdditionalData**
```xml
<workday.getAcademicAppointmentTrackAdditionalData>
    <workdayGetAcademicAppointmentTrackAdditionalDataRecords>{$ctx:workdayGetAcademicAppointmentTrackAdditionalDataRecords}</workdayGetAcademicAppointmentTrackAdditionalDataRecords>
</workday.getAcademicAppointmentTrackAdditionalData>
```

**Properties**
* workdayGetAcademicAppointmentTrackAdditionalDataRecords: One or more criteria based on which you want retrieve additional details. For example, if you want to retrieve additional details related to one or more specific academic appointment tracks, you can specify the relevant academic appointment track IDs.

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

#### Retrieving academic rank details
The getAcademicRanks operation retrieves details related to academic ranks, based on the criteria that you specify.

**getAcademicRanks**
```xml
<workday.getAcademicRanks>
    <workdayGetAcademicRanksRecords>{$ctx:workdayGetAcademicRanksRecords}</workdayGetAcademicRanksRecords>
</workday.getAcademicRanks>
```

**Properties**
* workdayGetAcademicRanksRecords: One or more criteria based on what you want returned within the academic rank details response. For example, if you want to retrieve details based on the academic rank ID, you can specify "academicRankId" as the criteria.

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

#### Retrieving academic unit hierarchy details
The getAcademicUnitHierarchies operation retrieves details related to academic unit hierarchies, based on the criteria that you specify.

**getAcademicUnitHierarchies**
```xml
<workday.getAcademicUnitHierarchies>
    <workdayGetAcademicUnitHierarchiesRecords>{$ctx:workdayGetAcademicUnitHierarchiesRecords}</workdayGetAcademicUnitHierarchiesRecords>
</workday.getAcademicUnitHierarchies>
```

**Properties**
* workdayGetAcademicUnitHierarchiesRecords: One or more criteria based on what you want returned within the academic unit hierarchy details response. For example, if you want to retrieve details related to a particular academic unit hierarchy, you can specify that particular academic unit hierarchy ID.

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

#### Retrieving academic unit details
The getAcademicUnits operation retrieves details related to academic units, based on the criteria that you specify.

**getAcademicUnits**
```xml
<workday.getAcademicUnits>
    <workdayGetAcademicUnitsRecords>{$ctx:workdayGetAcademicUnitsRecords}</workdayGetAcademicUnitsRecords>
</workday.getAcademicUnits>
```

**Properties**
* workdayGetAcademicUnitsRecords: One or more criteria based on what you want returned within the academic unit details response. For example, if you want to retrieve details related to a particular academic unit, you can specify the particular academic unit ID.

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

#### Retrieving company insider type details
The getCompanyInsiderTypes operation retrieves details related to company insider types, based on the criteria that you specify.

**getCompanyInsiderTypes**
```xml
<workday.getCompanyInsiderTypes>
    <workdayGetCompanyInsiderTypesRecords>{$ctx:workdayGetCompanyInsiderTypesRecords}
    </workdayGetCompanyInsiderTypesRecords>
</workday.getCompanyInsiderTypes>
```

**Properties**
* workdayGetCompanyInsiderTypesRecords: One or more criteria based on what you want returned within the company insider type details response.

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

#### Retrieving the difficulty level of filling a job profile
The getDifficultyToFill operation retrieves details related to the difficulty level of filling a job profile.

**getDifficultyToFill**
```xml
<workday.getDifficultyToFill>
    <workdayGetDifficultyToFillRecords>{$ctx:workdayGetDifficultyToFillRecords}</workdayGetDifficultyToFillRecords>
</workday.getDifficultyToFill>
```

**Properties**
* workdayGetDifficultyToFillRecords: One or more criteria that you want returned within the response with regard to the difficulty level of filling a job profile. 

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

#### Retrieving disability details
The getDisabilities operation retrieves details related to the disabilities that are defined, based on the criteria that you specify.

**getDifficultyToFill**
```xml
<workday.getDisabilities>
    <workdayGetDisabilitiesRecords>{$ctx:workdayGetDisabilitiesRecords}</workdayGetDisabilitiesRecords>
</workday.getDisabilities>
```

**Properties**
* workdayGetDisabilitiesRecords: One or more criteria based on what you want returned within the disability details response. For example, if you want to retrieve details related to a particular disability that is defined, you can specify "disabilityId" as one of the criteria.

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

#### Retrieving ethnicity details
The getEthnicities operation retrieves details related to ethnicities, based on the criteria that you specify.

**getEthnicities**
```xml
<workday.getEthnicities>
    <workdayGetEthnicitiesRecords>{$ctx:workdayGetEthnicitiesRecords}</workdayGetEthnicitiesRecords>
</workday.getEthnicities>
```

**Properties**
* workdayGetEthnicitiesRecords: One or more criteria based on what you want returned within the ethnicity details response. For example, if you want to retrieve details related to a particular ethnicity, you can specify "ethnicityId" as one of the criteria.

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

#### Retrieving frequency details
The getFrequencies operation retrieves details related to frequencies, based on the criteria that you specify.

**getFrequencies**
```xml
<workday.getFrequencies>
    <workdayGetFrequenciesRecords>{$ctx:workdayGetFrequenciesRecords}</workdayGetFrequenciesRecords>
</workday.getFrequencies>
```

**Properties**
* workdayGetFrequenciesRecords: One or more criteria based on what you want returned within the frequency details response. For example, if you want to retrieve details related to a particular frequency, you can specify "frequencyId" as one of the criteria.

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

#### Retrieving gender identity details
The getGenderIdentities operation retrieves details related to gender identities, based on the criteria that you specify.

**getGenderIdentities**
```xml
<workday.getGenderIdentities>
    <workdayGetGenderIdentitiesRecords>{$ctx:workdayGetGenderIdentitiesRecords}</workdayGetGenderIdentitiesRecords>
</workday.getGenderIdentities>
```

**Properties**
* workdayGetGenderIdentitiesRecords: One or more criteria based on what you want returned within the gender identity details response. 

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

#### Retrieving job category details
The getJobCategories operation retrieves details related to job categories, based on the criteria that you specify.

**getJobCategories**
```xml
<workday.getJobCategories>
    <workdayGetJobCategoriesRecords>{$ctx:workdayGetJobCategoriesRecords}</workdayGetJobCategoriesRecords>
</workday.getJobCategories>
```

**Properties**
* workdayGetJobCategoriesRecords: One or more criteria based on what you want returned within the job category details response.

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

#### Retrieving worker details
The getWorkers operation retrieves details related to workers, based on the criteria that you specify.

**getWorkers**
```xml
<workday.getWorkers>
    <workdayGetWorkersRecords>{$ctx:workdayGetWorkersRecords}</workdayGetWorkersRecords>
</workday.getWorkers>
```

**Properties**
* workdayGetWorkersRecords: One or more criteria based on what you want returned within the worker details response. For example, if you want to retrieve details related to one or more workers, you can specify the employee IDs of those workers.

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
Following is a sample proxy service that illustrates how to connect to Workday with the init operation, and then use the getAcademicAppointmentTrackAdditionalData operation. The sample request for this proxy can be found in [getAcademicAppointmentTrackAdditionalData sample request](#retrieving-details-of-academic-appointment-tracks). You can use this sample as a template for using other operations in this category.

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
