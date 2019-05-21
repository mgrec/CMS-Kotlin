package maxime.grec.cms.control

import java.util.*

interface CommentController {
    fun createComment(articleId: Int, username : String, text : String)

    interface View {
        fun success()
        fun error()
    }
}