package com.cbb.kotlin03

/**
 * substring
 */

const val NAME = "Jimmy's friend"
const val NAMES = "JACK,JACK,JSONS ROES"

fun main() {


    /**
     * substring
     * 切割
     */
    //找出Jimmy
    val index = NAME.indexOf('\'')
    var str = NAME.substring(0 until index)
    println(str)

    /**
     * split
     * 函数返回的是list集合数据，list集合又支持解构语法特性，它允许你在一个表达式里面给多个变量赋值
     * 解构常用来简化变量的赋值。
     */
    val strArr = NAMES.split(",")//数组
    val (arr1,arr2,arr3) = NAMES.split(",")//多个变量赋值
    println(strArr)
    println("$arr1 $arr2 $arr3")

    /**
     * replace 字符串替换
     */
    val str1 = "The china is love haha name is work"
    val str2 = str1.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" -> "7"
            "i" -> "6"
            "o" -> "5"
            "u" -> "4"
            else -> it.value
        }
    }
    println(str1)
    println(str2)

    /**
     * 字符串比较
     *  ==  用于检查两个字符串中的字符是否匹配，
     *  === 用于检测两个变量是否指向内存堆上同一对象，而在java中 == 做引用比较，结构比较用equals
     */
    val str3 = "Json"
    val str4 = "Json"
    println(str3 == str4)
    println(str3 === str4)

    /**
     * 字符串遍历
     */
    "akhaksdaksdhad".forEach {
        println(it)
    }

}