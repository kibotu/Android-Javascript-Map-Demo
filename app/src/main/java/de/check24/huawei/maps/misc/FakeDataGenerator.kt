@file:JvmName("FakeDataGenerator")

package de.check24.huawei.maps.misc

import java.text.MessageFormat.format
import kotlin.random.Random

fun createRandomImageUrl(): String {

    val landscape = Random.nextBoolean()
    val endpoint = false // randomBoolean()

    val width = random(300, 400)
    val height = random(200, 300)

    return format(
        if (endpoint)
            "https://lorempixel.com/{0}/{1}/"
        else
            "https://picsum.photos/{0}/{1}/",
        if (landscape) width else height, if (landscape) height else width
    )
}

fun random(start: Int, end: Int): Int = start + Random.nextInt(end - start + 1)