//Задача №1. Посты

fun main(args: Array<String>) {
    val firstPost = Post(
        0,
        10,
        10,
        10,
        60,
        "Проверка работы!",
        10,
        143,
        true,
        Comments(100, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
        Likes(300, userLikes = true, canLike = true, canPublish = true),
        1,
        500,
        "post"
    )

    val secondPost = Post(
        1,
        11,
        11,
        11,
        11,
        "Проверка 2!",
        11,
        123,
        true,
        Comments(100, canPost = true, groupsCanPost = true, canClose = true, canOpen = true),
        Likes(300, userLikes = true, canLike = true, canPublish = true),
        1,
        500,
        "reply"
    )

    WallService.add(firstPost) //Вызов функции add у объекта WallService для добавления firstPost в массив
    WallService.update(secondPost) //Вызов функции update у объекта WallService для обновления secondPost в массиве
    println(secondPost)
}
//gradle test jacocoTestReport