package maxime.grec.cms.control

import maxime.grec.cms.ArticleListPresenter
import maxime.grec.cms.Model

class ArticleListPresenterImpl(val model: Model, val view: ArticleListPresenter.View): ArticleListPresenter {

    override fun start() {
        val list = model.getArticleList()
        view.dispalyArticleList(list)
    }
}