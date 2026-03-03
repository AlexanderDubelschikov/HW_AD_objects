package ad.resume

object WallService {

    private var id = 1
    private var postList = mutableListOf<Post>()
    private var comments = mutableListOf<Comment>()

    fun clear() {
        postList.clear()
        comments.clear()
        id = 1
    }

    fun add(post: Post): Post {
        val newPost = post.copy(id = id)
        postList.add(newPost)
        id++
        return newPost
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (i in postList.indices) {
            if (postList[i].id == postId) {
                comments.add(comment)
                return comment
            }
        }
        throw PostNotFoundException("Пост не найден!")
    }

    fun update(post: Post): Boolean {

        for (i in postList.indices) {
            if (postList[i].id == post.id) {
                postList[i] = post.copy()
                return true
            }
        }
        return false
    }
}