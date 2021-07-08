package com.cbb.kotlin03

import java.io.File

/**
 * run
 * 光看作用域行为，run和apply差不多，但与apply不同，
 * run函数不返回接收者，
 * run返回的是lambda结果，也就是true或者false。
 */
fun main() {
    val file1 = File("D://i have a dream_copy.txt")
    val result = file1.run {
        readText().contains("great")
    }
    println(result)
    val result2 = "hjahjajshdadad".run(::isLong)
    println(result2)

    "womahskasjdenxiena"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)

}
fun isLong(name:String) = name.length >= 10
fun showMessage(isLong:Boolean):String{
    return if (isLong){
        "Name is too long"
    }else{
        "no long is good"
    }
}