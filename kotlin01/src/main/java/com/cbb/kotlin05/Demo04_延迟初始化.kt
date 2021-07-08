package com.cbb.kotlin05

/**
 * 延迟初始化
 * 使用lateint关键字相当于做了一个约定：在用它之前负责初始化
 * 只要无法确定lateint变量是否完成初始化，可以执行isInitialized检查
 */

class Mode{
    lateinit var equipment:String   //延迟初始化
    fun ready(){
        equipment = "sharp knife"
    }
    fun battle(){
        //判定是否初始化
        if (::equipment.isInitialized) println(equipment)
    }
}

fun main() {
    val mode = Mode()
    mode.ready()
    mode.battle()
}