package maxime.grec.cms

import maxime.grec.cms.model.Article
import maxime.grec.cms.model.Comment
import kotlin.collections.ArrayList

class MysqlModel(val pool: ConnectionPool) : Model {

    override fun createComment(articleId: Int, username: String, text: String): Boolean {
        pool.useConnection { connection ->
            connection.prepareStatement("INSERT INTO commentaires (article_id, username, text) VALUES (?, ?, ?)").use { stmt ->
                stmt.setInt(1, articleId)
                stmt.setString(2, username)
                stmt.setString(3, text)
                stmt.executeUpdate()
                return true
            }
        }
        return false
    }

    override fun getArticleList(): List<Article> {
        val list = ArrayList<Article>()
        pool.useConnection { connection ->
            connection.prepareStatement("SELECT id, title, text FROM articles").use { stmt ->
                stmt.executeQuery().use { result ->
                    while (result.next()) {
                        list += Article(
                            result.getInt("id"),
                            result.getString("title"),
                            result.getString("text"),
                            null

                        )
                    }

                }
            }
        }
        return list
    }

    override fun getCommentById(id: Int): List<Comment> {
        val commentList = ArrayList<Comment>()

        pool.useConnection { connection ->
            connection.prepareStatement("SELECT * FROM Commentaires WHERE Commentaires.article_id = ?").use { stmt ->
                stmt.setInt(1, id)
                stmt.executeQuery().use { result ->
                        while (result.next()) {
                            commentList += Comment(
                                result.getInt("id"),
                                result.getInt("article_id"),
                                result.getString("username"),
                                result.getDate("date"),
                                result.getString("text")

                            )
                        }
                }
            }
        }
        return commentList
    }

    override fun getArticle(id: Int): Article? {

        val commentList = this.getCommentById(id)

        pool.useConnection { connection ->
            connection.prepareStatement("SELECT * FROM Articles WHERE Articles.id = ?").use { stmt ->
                stmt.setInt(1, id)

                stmt.executeQuery().use { result ->
                    if(result.next()) {

                        return Article(
                            result.getInt("id"),
                            result.getString("title"),
                            result.getString("text"),
                            commentList

                        )
                    }
                }
            }
        }
        return null
    }

    override fun login(email: String, password: String): Boolean {
        pool.useConnection { connection ->
            connection.prepareStatement("SELECT id FROM users WHERE email = ? AND password = ?").use { stmt ->
                stmt.setString(1, email)
                stmt.setString(2, password)

                stmt.executeQuery().use { result ->
                    if(result.next()) {

                        return true
                    }
                }
            }
        }
        return false
    }

    override fun deleteArticle(idArticle: Int): Boolean {
        pool.useConnection { connection ->
            connection.prepareStatement("DELETE FROM articles WHERE id = ?").use { stmt ->
                stmt.setInt(1, idArticle)
                stmt.executeUpdate()
                return true
            }
        }
        return false
    }

}