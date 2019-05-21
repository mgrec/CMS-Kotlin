package maxime.grec.cms.tpl

import maxime.grec.cms.model.Article


data class ArticleContext(
    val Article: Article?,
    val Auth : Boolean
)