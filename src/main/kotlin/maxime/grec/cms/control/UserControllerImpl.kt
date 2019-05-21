package maxime.grec.cms.control

import maxime.grec.cms.Model

class UserControllerImpl(val model: Model, val view: UserController.View):
    UserController {
    override fun login(email: String, password: String) {
        if (email != "") {
            val log = model.login(email, password)
            if (log) {
                view.success()
            } else {
                view.error()
            }
        } else {
            view.error()
        }
    }

}