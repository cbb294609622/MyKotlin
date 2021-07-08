package com.cbb.kotlin01

/**
 * when 表达式
 * 允许编写条件式，在某个条件满足时，执行对应的代码。
 * 只要代码包含else if 分支，都建议使用when表达式
 */
fun main() {
    val shool  = "1小学"
    val level:Any = when(shool){
        "学前班" -> "幼儿"
        "小学" -> "少儿"
        else ->{
            "未知"
        }
    }
    println(level)
}