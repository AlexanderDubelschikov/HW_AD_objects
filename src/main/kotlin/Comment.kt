package ad.resume

data class Comment(
    var id: Int? = null,
    var fromId: Int? = null,
    var date: Int? = null,
    var text: String? = null,
    var replayToUser: Int? = null,
    var replayToComment: Int? = null
)
