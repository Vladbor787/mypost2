data class Post (
    val id: Int?,
    val ownerId: Int? = null,
    val fromId: Int? = null,
    val createdBy: Int? = null,
    val date: Int? = null,
    val text: String? = null,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean? = null,
    val comments: Comments? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String? = null,
    val postSource: PostSource? = null,
    val attachments: List<Attachment>? = null,
    val geo: Geo? = null,
    val signerId: Int? = null,
    val copyHistory: List<Post>? = null,
    val canPin: Boolean? = null,
    val canDelete: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPinned: Boolean? = null,
    val markedAsAds: Boolean? = null,
    val isFavorite: Boolean? = null,
    val donut: Donut? = null,
    val postponedId: Int? = null
){


}