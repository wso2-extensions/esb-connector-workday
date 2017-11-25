# Configuring Workday Operations

To use the Workday connector, add the <workday.init> element in your configuration before carrying out any other Workday operations. All Web services operations require authentication. The Workday platform support username token approach for authentication using the username, password credentials, which are sent in the SOAP header while maintaining the HTTPS proxy.

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
* workdayUserName: The username for the workday account.
* workdayPassword: The password for the workday account.
* workdayBlockingInvocation: Set to true to perform the blocking invocations to workday.
* workdayApiVersion: The API version of the Workday API.
* workdayApiUrl: The API URL of the Workday API.
* workdayTenantId: The tenant Id.

Now that you have connected to Workday, use the information in the following topics to perform various operations with the connector.

[Working with Academic Foundation in Workday](workingWithAcademicFoundationInWorkday.md)

[Working with Human Resources in Workday](workingWithHumanResourcesInWorkday.md)

[Working with Integration in Workday](workingWithIntegrationInWorkday.md)
