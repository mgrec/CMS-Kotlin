<#macro page_head>
    <title>Base</title>
</#macro>

<#macro page_body>
</#macro>

<#macro page_comment>
</#macro>

<#macro page_list_comment>
</#macro>

<#macro page_login_form>
</#macro>

<#macro display_page>
    <!doctype html>
    <html>
    <head>
        <@page_head/>
        <link rel="stylesheet" href="/static/css/reset.css">
        <link rel="stylesheet" href="/static/css/bootstrap.min.css">
        <link rel="stylesheet" href="/static/css/style.css">
    </head>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">CMS Kotlin</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link" href="/all">Tout <span class="sr-only">(current)</span></a>
                <a class="nav-item nav-link" href="/today">Aujourd'hui</a>
                <a class="nav-item nav-link" href="/last-week">Semaine dernière</a>
            </div>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li style="padding-right: 10px"><a href="/admin">Administration</a></li>
            <#if auth >
                <li><a href="/logout">logout</a></li>
            </#if>
        </ul>
    </nav>
    <body>
    <div style="padding-top: 50px" class="container">
        <@page_body/>
    </div>
    <@page_comment/>

    <@page_list_comment/>
    <@page_login_form/>

    </body>
    </html>
</#macro>