package com.cbb.kotlin03

/**
 * Kotlin更多地把运行时可能会出现的null问题，以编译时错误的方式，提前在编译期强迫我们重视起来。
 * 而不是等到运行时报错。防范于未然，提高我们程序的健壮性。
 *
 * 可空性：对于null值问题，kotlin反其道而行之，除非另有规定，变量不可为null值。这样一来，运行时崩溃从根源上解决。
 *
 *
 *  null安全
 *  kotlin区分可空类型和非可空类型，所以，你要一个可空类型变量运行，而它有可能不存在，
 *  对于这种潜在风险，编译器时刻警惕着。
 *  为了应对这种风险，kotlin不允许你在可空类型值上调用函数，除非你主动接手安全管理。
 *
 */
fun main() {
//    val str = "bu"
//    str  = null   //错误

    /**
     * 选项一 安全调用操作符
     * 这次kotlin不报错了，编译器看到有安全调用操作符，所以它知道如何检查null值。
     * 如果遇到null值，它就跳过函数调用，而不是返回null
     */
    var str:String? = "buff"
    str = null  //正确
    //当str为null时，会跳过函数。
    println(str?.capitalize())

    /**
     * 使用带let的安全调用
     * 安全调用允许在可空类型上调用函数，但是如果还想做点额外的事，
     * 比如创建新值，或判断不为null就调用其他函数，怎么办？
     * 可以使用带let函数的安全调用操作符。
     * 你可以在任何类型上调用let函数，他的主要作用是让你在指定的作用域内定义一个或多个变量。
     *
     */
    str = "bufftee"
    str?.let {
        if (it.isNotBlank()){
            it.capitalize()
        }else{
            "bufftee"
        }
    }
    println(str)

    /**
     * 选项二 使用非空断言操作符
     * （!!.）又称感叹号操作符，当变量值为null时，会抛出KotlinNullPointerException
     */
//    str = null
    println(str!!.capitalize())

    /**
     * 使用java语言判定null
     */
    if (str != null){
        str = str.capitalize()
    }else{
        println("为null")
    }
    println(str)
    /**
     * 使用空合并操作符
     * ?:操作符的意思是，如果左边的求值结果为null，就使用右边的结果值
     *
     * 空合并操作符也可以和let函数一起使用来代替if/else语句
     */
    str = null
    str = str?:"wahaha"
    println(str)

    str = null
    str = str?.let { it.capitalize() }?:"buf"
    println(str)
}