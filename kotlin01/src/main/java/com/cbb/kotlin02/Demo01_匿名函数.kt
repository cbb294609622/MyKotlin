package com.cbb.kotlin02

/**
 * 匿名函数
 *  定义时不需要取名字的函数，我们称之为匿名函数。
 *  匿名函数通常整体传递给其他函数，或者从其他函数返回。
 *
 *  匿名函数对kotlin来说很重要，有了它，我们能够根据需要制定特殊规则
 *  轻松定制标准库里的内置函数。
 *
 */
fun main() {
    val total = "Mississippi".count()

    val totalScount = "Mississippi".count({ letter ->
        letter == 's'
    })
    println(total)
    println(totalScount)
}