package maxime.grec.cms.control

import maxime.grec.cms.ArticlePresenter
import maxime.grec.cms.Model


class ArticlePresenterImpl(val model: Model, val view: ArticlePresenter.View): ArticlePresenter {

    override fun start(id: Int) {
        val article = model.getArticle(id)
        if (article != null) {
            view.displayArticle(article)
        } else {
            view.displayNotFound()
        }

    }

    override fun deleteArticle(idArticle: Int) {
        val deleteStatus = model.deleteArticle(idArticle)
        if (deleteStatus) {
            view.success()
        } else {
            view.error()
        }

    }

    override fun createArticle(title: String?, text: String?) {
        if (text != null && title != null) {
            val article = model.createArticle(title, text)
            if (article) {
                view.success()
            } else {
                view.error()
            }
        } else {
            view.error()
        }
    }
}