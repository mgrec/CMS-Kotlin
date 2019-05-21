package maxime.grec.cms.tpl

import maxime.grec.cms.model.Article


data class IndexContext(
    val List: List<Article>,
    val Auth : Boolean
)