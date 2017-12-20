# Configuring Workday Operations

To use the Workday connector, add the <workday.init> element in your configuration before carrying out any other Workday operations. 

Workday supports basic authentication with username and password. Every request that your application sends to the Workday SOAP API must include the username and password in the SOAP header.

**init**
```xml
<workday.init>
    <workdayUserName>{$ctx:workdayUserName}</workdayUserName>
    <workdayPassword>{$ctx:workdayPassword}</workdayPassword>
    <workdayBlockingInvocation>true</workdayBlockingInvocation>
    <workdayApiVersion>{$ctx:workdayApiVersion}</workdayApiVersion>
    <workdayApiUrl>{$ctx:workdayApiUrl}</workdayApiUrl>
    <workdayTenantId>{$ctx:workdayTenantId}</workdayTenantId>
</workday.init>
```
**Properties** 
* workdayUserName: The username of the Workday account.
* workdayPassword: The password of the Workday account.
* workdayBlockingInvocation: This is a boolean type property. Set this to true if you want the connector to perform blocking invocations to Workday.
* workdayApiVersion: The API version of the Workday API.
* workdayApiUrl: The API URL of the Workday API.
* workdayTenantId: The Workday tenant Id.

Now that you have connected to Workday, use the information in the following topics to perform various operations with the connector:

[Working with Academic Foundation in Workday](workingWithAcademicFoundationInWorkday.md)

[Working with Human Resources in Workday](workingWithHumanResourcesInWorkday.md)

[Working with Integration in Workday](workingWithIntegrationInWorkday.md)
