package ad.resume

object WallService {

    private var id = 1
    private var postList = mutableListOf<Post>()

    fun clear() {
        postList.clear()
        id = 1
    }

    fun add(post: Post): Post {
        val newPost = post.copy(id = id)
        postList.add(newPost)
        id++
        return newPost
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