package maxime.grec.cms.control

interface UserController {
    fun login(email: String, password: String)

    interface View {
        fun success()
        fun error()
    }
}