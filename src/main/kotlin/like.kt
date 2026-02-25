package ad.resume

data class like(
    var count: Int = 0,
    var userLikes: Boolean = false,
    var canLike: Boolean = true,
    var canPublish: Boolean = true,
)