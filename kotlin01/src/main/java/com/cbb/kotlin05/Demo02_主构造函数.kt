package com.cbb.kotlin05

/**
 * 主构造函数
 *  以下划线开头的属性 在构造函数中  只使用一次。
 */
class Play(
    _name: String,//以下划线开头 只使用一次
    var age: Int,//在构造函数中定义属性
    var isNormal: Boolean,//在构造函数中定义属性
    var Sex:Int = 0 //默认参数
) {
    var name = _name

    constructor(name: String) : this(name, age = 0, isNormal = false)
    constructor(name: String,age: Int) : this(name, age = 0, isNormal = false){
        this.name = name.toUpperCase()
    }
}

fun main() {
    val py = Play("王大崔", 22, true,1)
    println("${py.name} ${py.age} ${py.isNormal} ${py.Sex}")

    val p2 = Play("Reos")
    println("${p2.name} ${p2.age} ${p2.isNormal} ${p2.Sex}")

    val p3 = Play("Jack",20)
    println("${p3.name} ${p3.age} ${p3.isNormal} ${p3.Sex}")
}