package maxime.grec.cms.model

class Article(
    val id: Int,
    val title: String,
    val text: String?,
    val comment: List<Comment>?
)