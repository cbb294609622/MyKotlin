package com.cbb.kotlin06

/**
 * object关键字
 * 使用object关键字，你可以定义一个只能生产一个实例的类-单例
 * 使用object关键字有三种方式
 *      1.对象声明
 *      2.对象表达式
 *      3.伴生对象
 */

object ApplicationConfig{
    init {
        println("ApplicationConfig loading....")
    }
    fun doSomething(){
        println("dosomething...")
    }
}

fun main() {
    //类名.实例名
    ApplicationConfig.doSomething()
    //统一实例
    println(ApplicationConfig)
    println(ApplicationConfig)
    println(ApplicationConfig)

}