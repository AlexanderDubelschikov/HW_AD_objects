package ad.resume

interface Attachment {
    val type: String
}

data class Photo(
    var id: Int,
    var albumId: Int,
    var ownerId: Int,
    var userId: Int,
    var text: String

)

data class Video(
    var id: Int,
    var ownerId: Int,
    var title: String,
    var description: String,
    var duration: Int
)

data class Audio(
    var id: Int,
    var ownerId: Int,
    var artist: String,
    var title: String,
    var duration: Int
)

data class PhotoAttachment(
    override val type: String = "Photo",
    val photo: Photo
) : Attachment

data class VideoAttachment(
    override val type: String = "Video",
    val video: Video
) : Attachment

data class AudioAttachment(
    override val type: String = "Audio",
    val audio: Audio
) : Attachment