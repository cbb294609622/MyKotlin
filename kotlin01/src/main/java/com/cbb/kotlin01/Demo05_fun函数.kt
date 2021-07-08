package com.cbb.kotlin01

/**
 * private fun doSomething(age:Int,flag:Boolean):String
 *
 * private 可见修饰符
 * fun 函数声明关键字
 * doSomething 函数名
 * age:Int,flag:Boolean 函数参数
 * String 返回类型
 *
 * 默认值参
 *  如果不打算传入值参，可以预先给参数指定默认值
 * 具名函数参数
 *  如果使用命名值参，就可以不用管值参的顺序
 *
 */

fun main() {
    println(doSomething(3, false))//根据参数顺序
    fix("tom")//缺省参数
    fix(age = 20,name = "waka")//具名函数参数 参数顺序不用管
}

private fun doSomething(age: Int, flag: Boolean): String {
    return "result"
}

fun fix(name: String, age: Int = 4) {
    println(name + age)
}