<#include "base.ftl">
<#macro page_head>
    <title>Admin</title>
</#macro>

<form method="post" action="/admin/auth">
    <input name="email" type="email">
    <input name="password" type="password">
    <button type="submit">Login</button>
</form>