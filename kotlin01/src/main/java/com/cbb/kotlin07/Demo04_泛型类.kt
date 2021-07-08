package com.cbb.kotlin07

/**
 * 定义泛型类
 * 泛型类的构造函数可以接收任何类型
 *
 * 泛型参数通常用字母T表示，当然也可以用其他字母。
 *
 * MagicBox类指定的泛型参数又放在一对<>里的字母T表示。
 * T是个代表item类型的占位符。
 * MagicBox类接收任何类型的item作为主构造函数值(item:T)
 * 并将item值赋给同样是T类型的subject私有属性。
 *
 */

class MagicBox<T>(item:T){
    private var subject:T = item
}
class Boy(val name:String,val age:Int)
class Dog(val weight:Int)

fun main() {
    val b1 = MagicBox(Boy("jack", 22))
    val b2 = MagicBox(Dog( 22))

}