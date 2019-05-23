package maxime.grec.cms.control

import java.util.*

interface CommentController {
    fun createComment(articleId: Int, username : String, text : String)

    fun deleteComment(idCom: Int)

    interface View {
        fun success()
        fun error()
    }
}