package com.cbb.kotlin02

/**
 *  匿名函数的类型推导
 *  定义一个变量时，如果已把匿名函数作为变量赋值给它，
 *  就不需要显示指明变量类型了。
 */
fun main() {
    var str = {
        val s = "New Year"
        "Happy $s"
    }
    println(str())

    var str1:(String ,Int) ->String = {name,year ->
        val s = "New Year"
        "$name ,Happy $s ,$year"
    }
    println(str1("china",2029))

    //类型推导
    var str2 = {name:String,year:Int ->
        val s = "New Year"
        "$name ,Happy $s ,$year"
    }
    println(str1("china",2029))
}