package com.cbb.kotlin05

/**
 * 延迟初始化
 * 使用lateint关键字相当于做了一个约定：在用它之前负责初始化
 * 只要无法确定lateint变量是否完成初始化，可以执行isInitialized检查
 */

class Test(_name:String){
    var name = _name

    //类似懒汉式
    val config by lazy { loadConfig() }
    //类似恶汉式
//    val config = loadConfig()
    private fun loadConfig():String{
        println("loading...")
        return "xxx"
    }
}

fun main() {
    val t = Test("jack")
    Thread.sleep(3000)
    println(t.config)
}