data class Post(
    val id: Int = 0, //Идентификатор записи. Изменил на val
    val ownerId: Int = 0, //Идентификатор владельца стены, на которой размещена запись
    val fromId: Int = 0, //Идентификатор автора записи
    val createdBy: Int = 0, //Идентификатор администратора, который опубликовал запись
    val date: Long = System.currentTimeMillis() / 1000L, //Время публикации записи
    val text: String, //Текст записи
    val replyOwnerId: Int = 0, //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int = 0, //Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean = true, //Если запись была создана с опцией "только для друзей"
    val comments: Comments = Comments(), //Информация о комментариях к записи, объект с полями
    val likes: Likes = Likes(), //Информация о лайках к записи, объект с полями
    val reposts: Int = 0, //Информация о репостах записи (рассказать друзьям), объект с полями
    val views: Int = 0, //Информация о просмотрах записи. Объект с единственным полем
    val postType: String = "post", //Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
)

data class Comment(
    val id: Int = 0, //Идентификатор записи
    val fromId: Int = 0, //Идентификатор автора записи
    val date: Long = System.currentTimeMillis() / 1000L, //Время публикации записи
    val text: String = "Comment text", //Текст записи
    val replyToUser: Int = 1,
    val replyToComment: Int = 1,
)

data class Views(
    val count: Int
)

data class Comments(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = true,
    val canClose: Boolean = true,
    val canOpen: Boolean = true
)

data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = true,
    val canLike: Boolean = true,
    val canPublish: Boolean = true
)