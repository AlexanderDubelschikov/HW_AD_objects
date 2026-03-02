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

data class File(
    var id: Int,
    var ownerId: Int,
    var title: String,
    var size: Int,
    var ext: String
)

data class Graffiti(
    var id: Int,
    var ownerId: Int,
    var url: String,
    var width: Int,
    var height: Int
)


data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment

data class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment

data class FileAttachment(
    override val type: String = "file",
    val file: File
) : Attachment

data class GraffitiAttachment(
    override val type: String = "graffiti",
    val graffiti: Graffiti
) : Attachment