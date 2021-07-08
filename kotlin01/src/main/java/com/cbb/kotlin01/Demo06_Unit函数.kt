package com.cbb.kotlin01


/**
 * Unit 函数
 * 不是所有函数都有返回值，Kotlin中没有返回值的函数叫Unit函数。
 * 也就是说他们的返回值类型是Unit。
 * 在kotlin之前，函数不返回任何东西用void描述，意思是没有返回类型，不会带来什么，忽略它
 * 也就是说如果函数不返回任何东西，就是忽略类型。
 * 但是 void这种解决方案无法解释现代语言的一个重要特征，泛型。
 */
fun main() {
    println(Test())//输出  kotlin.Unit
}

fun Test(){
}