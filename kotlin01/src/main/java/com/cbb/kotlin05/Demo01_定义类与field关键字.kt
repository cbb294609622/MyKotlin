package com.cbb.kotlin05

/**
 * 针对你定义的每一个属性，Kotlin都会产生一个field、一个getter、以及一个setter，
 * field用来存储属性数据，你不能直接定义field，Kotlin会封装field，保护它里面的数据，
 * 只暴露给getter和setter使用。属性的getter方法决定你如何读取属性值，每个属性都有getter方法，
 * setter方法决定你如何给属性赋值，所以只有可变属性才会有setter方法，
 * 尽管Kotlin会自动提供默认的getter和setter方法，但在需要控制如何读写属性数据时，
 * 你也可以自定义他们。
 */

class Player {
    var name: String = "jack"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
}

fun main() {
    var p = Player()
    //实际调用的setName()
    p.name = "  work     "
    println(p.name)
}