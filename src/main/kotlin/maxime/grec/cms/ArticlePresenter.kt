package maxime.grec.cms

import maxime.grec.cms.model.Article

interface ArticlePresenter {

    fun deleteArticle(idArticle: Int)

    fun createArticle(title: String?, text: String?)

    fun start(id: Int)

    interface View {
        fun success()
        fun error()
        fun displayArticle(article: Article?)
        fun displayNotFound()
    }
}