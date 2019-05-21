package maxime.grec.cms.control

import io.ktor.application.call
import io.ktor.sessions.get
import io.ktor.sessions.sessions
import maxime.grec.cms.ArticlePresenter
import maxime.grec.cms.Model
import maxime.grec.cms.model.AuthSession


class ArticlePresenterImpl(val model: Model, val view: ArticlePresenter.View): ArticlePresenter {

    override fun start(id: Int) {
        val article = model.getArticle(id)
        if (article != null) {
            view.displayArticle(article)
        } else {
            view.displayNotFound()
        }

    }
}