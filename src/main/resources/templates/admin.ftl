<#include "base.ftl">
<#macro page_head>
    <title>Article</title>
</#macro>

<#macro page_body>
    <h1>Ajouter un article</h1>
    <p>Vous pouvez ajouter une article !</p>
</#macro>

<#macro page_create_article>
    <div style="padding-left: 30px; margin-top: 50px; margin-left: 50px" class="col-md-4">
        <form action="/admin/article/add" method="post">
            <div class="form-group">
                <label for="exampleFormControlInput1">Titre de l'article</label>
                <input name="title" type="text" class="form-control" id="exampleFormControlInput1" placeholder="ex: toto">
            </div>
            <div class="form-group">
                <label for="exampleFormControlTextarea1">Corps de l'article</label>
                <textarea name="text" class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Poster !</button>
            </div>
        </form>
    </div>
</#macro>

<@display_page/>