package ad.resume

data class Post(
    var id: Int = 0,
    var ownerId: Int = 101,
    var fromId: Int = 101,
    var text: String = "Let's test it!",
    var friendsOnly: Boolean = false,
    var canPin: Boolean = true,
    var canDelete: Boolean = true,
    var canEdit: Boolean = true,
    var isFactory: Boolean = true,
    var likes: like = like()
)