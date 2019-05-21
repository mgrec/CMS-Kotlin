package maxime.grec.cms

import maxime.grec.cms.model.Article
import maxime.grec.cms.model.AuthSession

interface ArticlePresenter {

    fun start(id: Int)

    interface View {
        fun displayArticle(article: Article?)
        fun displayNotFound()
    }
}