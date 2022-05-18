object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var unicPostId: Int = 1
    private var originalCommentID = 1

    fun add(post: Post): Post {
        posts += post.copy(id = unicPostId)
        unicPostId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }
    fun createComment(comment: Comment,postId:Int): Comment {
        for (post in posts) {
            if (post.id == postId) {
                originalCommentID++
                val newComment = comment.copy(id = originalCommentID)
                comments += newComment
                println("Комментарий добавлен")
                return comments.last()
            }
        }
        throw PostNotFoundException ("Пост не существует")
    }
}