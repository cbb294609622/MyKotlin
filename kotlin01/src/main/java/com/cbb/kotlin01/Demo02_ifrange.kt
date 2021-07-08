package com.cbb.kotlin01

/**
 * if  range  表达式
 *
 * in A..B
 * in关键字用来检查某个值是否在指定范围之内。
 */
fun main() {
    val age = 44
    if (age in 0..3){
        println("婴幼儿")
    }else if (age in 3..12){
        println("少年")
    }else{
        println("青年")
    }

    if (age !in 1..3){

    }


}