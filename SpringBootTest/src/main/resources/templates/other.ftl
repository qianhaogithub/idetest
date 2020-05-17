<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>HelloWorld</title>
</head>
<body>
    <h2>Hello World!</h2>
    ${name} <br/>
    <#if address=="1">
        上海
    <#elseif address=="2">
        北京
    <#else >
        深圳
    </#if>

    <#list listResult as res>
        ${res}<br/>
    </#list>
</body>
</html>
