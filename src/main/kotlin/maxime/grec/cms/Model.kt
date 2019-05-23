package maxime.grec.cms

import maxime.grec.cms.model.Article
import maxime.grec.cms.model.Comment
import java.util.*

interface Model {

    fun getArticleList(): List<Article>
    fun getArticle(id: Int): Article?

    fun createComment(articleId: Int, username: String, text: String): Boolean

    fun deleteArticle(articleId: Int): Boolean

    fun deleteComment(commentId: Int): Boolean

    fun getCommentById(articleId: Int): List<Comment>

    fun login(email: String, password: String): Boolean

}