<#include "base.ftl">
<#macro page_head>
    <title>Article</title>
</#macro>

<#macro page_body>
    <h1>${article.title}</h1>
    <p>${article.text}</p>
</#macro>

<#macro page_comment>
    <div style="padding-left: 30px; margin-top: 50px" class="col-md-4">
        <form action="/comment/add" method="post">
            <input type="hidden" name="article_id" value="${article.id}">
            <div class="form-group">
                <label for="exampleFormControlInput1">Votre pseudo</label>
                <input name="username" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: toto">
            </div>
            <div class="form-group">
                <label for="exampleFormControlTextarea1">Dites-nous tout !</label>
                <textarea name="text" class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Poster !</button>
            </div>
        </form>
    </div>
</#macro>

<#macro page_list_comment>
    <div style="padding-left: 30px; margin-top: 50px" class="col-md-6">
        <#list article.comment as single>
            <div class="card" style="margin: 30px 0;">
                <div class="card-header">
                    ${single.username}
                </div>
                <div class="card-body">
                    <blockquote class="blockquote mb-0">
                        <p>${single.text}</p>
                        <footer class="blockquote-footer"><cite title="Source Title">${single.date}</cite></footer>
                    </blockquote>
                </div>
            </div>
        </#list>
    </div>

</#macro>


<@display_page/>