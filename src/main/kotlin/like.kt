package ad.resume

data class Like(
    var count: Int = 0,
    var userLikes: Boolean = false,
    var canLike: Boolean = true,
    var canPublish: Boolean = true,
)