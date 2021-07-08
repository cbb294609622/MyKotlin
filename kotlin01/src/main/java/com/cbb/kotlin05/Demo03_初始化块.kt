package com.cbb.kotlin05

/**
 * 初始化块 init
 * 初始化块可以设置变量或值，以及执行有效性检查，
 * 如检查传给某个构造函数的值是否有效。
 * 初始化代码块会在构造类实例时执行。
 *
 *
 * 初始化顺序
 * 1.主构造函数里声明的属性
 * 2.类级别的属性赋值
 * 3.init初始化块里的属性赋值和函数调用
 * 4.次构造函数的属性赋值和函数调用
 *
 */

class Stu(
    _name: String,
    var age: Int
) {

    var name = _name
    var score = 10
    var hobby:String = ""

    //初始化代码块
    init {
        println("初始化块")
        hobby = "kill"
    }

    constructor(_name: String):this(_name,10){
        score = 20
    }

}

fun main() {

    //调用次构造函数
    var stu = Stu("jakc")
    /**
     *  赋值顺序
     *  1.首先是主构造函数中声明的属性 age = 10
     *  2.其次是类级别的属性赋值，name = jakc，score = 10，hobby = ""
     *  3.初始化块中的代码(init),hobby = "kill"
     *  4.次构造函数里的属性赋值，score = 20
     */
    println("${stu.name} ${stu.age}")

    //调用主构造函数
    var stu1 = Stu("jakc",22)
    /**
     *  赋值顺序
     *  1.首先是主构造函数中声明的属性 age = 10
     *  2.其次是类级别的属性赋值，name = jakc，score = 10，hobby = ""
     *  3.初始化块中的代码(init),hobby = "kill"
     *  4.次构造函数不执行
     */


    println("${stu1.name} ${stu1.age}")
}