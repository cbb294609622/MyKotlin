package com.cbb.kotlin06

/**
 * 解构声明
 * 解构声明的后台实现就是声明component1，component2等 若干个组件函数。
 * 让每个函数负责管理你想反悔的一个属性数据，
 * 如果你定义一个数据类，它会自动为所有定义在主构造函数的属性上添加对应的组件函数
 *
 */

class PlayScore(val ex:Int,val level:Int){
    operator  fun component1() = ex
    operator  fun component2() = level

}
data class PlayScore1(val ex:Int,val level:Int){

}


fun main() {
    val (x,y) = PlayScore(10, 20)
    println("$x $y")


    val (x1,y1) = PlayScore1(120, 220)
    println("$x1 $y1")
}