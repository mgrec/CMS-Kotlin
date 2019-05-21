package maxime.grec.cms

import maxime.grec.cms.model.Article

interface ArticleListPresenter {

    fun start()

    interface View {
        fun dispalyArticleList(list: List<Article>)
    }

}