package maxime.grec.cms.control

import maxime.grec.cms.Model

class CommentControllerImpl(val model: Model, val view: CommentController.View):
    CommentController {
    override fun createComment(articleId: Int, username: String, text: String) {
        if (text != "") {
            val comment = model.createComment(articleId, username, text)
            if (comment && text != "") {
                view.success()
            } else {
                view.error()
            }
        } else {
            view.error()
        }
    }

    override fun deleteComment(idCom: Int) {
        val deleteStatus = model.deleteComment(idCom)
        if (deleteStatus) {
            view.success()
        } else {
            view.error()
        }

    }

}