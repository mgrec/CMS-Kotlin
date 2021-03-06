<#include "base.ftl">
<#macro page_head>
    <title>List Article</title>
</#macro>

<#macro page_body>
    <#assign count = 0/>
    <#list list as article>
        <#if count % 3 == 0 >
            <#if count != 0>
                </div>
            </#if>
            <div style="padding: 10px" class="row">
        </#if>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                        Featured
                    </div>
                    <div class="card-body">
                        <h5 class="card-title">${article.title}</h5>
                        <#if article.text?length gt 100 >
                            <p class="card-text">${article.text?substring(0,100)} ...</p>
                        <#else>
                             <p class="card-text">${article.text}</p>
                        </#if>
                        <a href="/article/${article.id}" class="btn btn-primary">Lire plus</a>
                        <#if auth >
                            <a href="/admin/article/${article.id}/delete" class="btn btn-danger">Supprimer</a>
                        </#if>
                    </div>
                </div>
            </div>
        <#assign count++ />
    </#list>
</#macro>

<@display_page/>