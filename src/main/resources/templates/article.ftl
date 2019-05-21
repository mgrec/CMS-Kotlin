<#include "base.ftl">
<#macro page_head>
    <title>Article</title>
</#macro>

<#macro page_body>
    <h1>${title}</h1>
    <p>${text}</p>
</#macro>

<#macro page_comment>
    <form action="/comment/add" method="post">
        <input type="hidden" name="article_id" value="${id}">
        <input type="text" name="username">
        <textarea name="text" rows="5" cols="50"></textarea>
        <button type="submit">Poster !</button>
    </form>
</#macro>

<#macro page_list_comment>
    <div>
        <#list comment as single>
            <div>
                <ul>
                    <li>${single.username}</li>
                    <li>${single.date}</li>
                    <li>${single.text}</li>
                </ul>
            </div>
        </#list>
    </div>

</#macro>


<@display_page/>