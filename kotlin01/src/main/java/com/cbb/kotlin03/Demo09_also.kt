package com.cbb.kotlin03

import java.io.File


/**
 * also 函數和let函数功能相似，和let一样，also也是把接收者作为值传给lambda，
 * 但是有一点不同，also返回接收者对象，而let返回lambda结果，因为这个差异，
 * also尤其适合针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，
 * 你就可以基于原始接收者对象执行额外的链式调用。
 */
fun main() {
    var fileContents:List<String>
    var file = File("D://i have a dream_copy.txt")
        .also {
            println(it.name)
        }.also {
            fileContents = it.readLines()
        }
    println(fileContents)

}