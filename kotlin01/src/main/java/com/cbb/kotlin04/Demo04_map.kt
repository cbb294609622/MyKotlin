package com.cbb.kotlin04

import android.os.Build
import androidx.annotation.RequiresApi


/**
 * Map的创建
 * to 看上去像关键字，但事实上，它是个省略了点号和参数的特殊函数。
 * to 函数将它左边和右边的值化成一对Pair
 */
@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    /**
     * 创建Map
     */
    val map = mapOf("jack" to 20, "mary" to 30, "ben" to 22)
    mapOf(Pair("jack",20),Pair("mary",22))
    println(map["jack"])
    println(map.getValue("ben"))
    println(map.getOrElse("mar1y"){"Unknown"})
    println(map.getOrDefault("mary1",100))

    map.forEach{
        println("${it.key} ${it.value}")
    }
    map.forEach{ (key: String, values: Int) ->
        println("$key $values")
    }

    /**
     * 可变的map
     */
    println("---------------------------------")
    val mMap = mutableMapOf("jack" to 20, "mary" to 30, "ben" to 22)
    mMap += "oren" to 30
    mMap["blue"] = 25
    mMap.getOrPut("Rose"){18}//没有则添加
    println(mMap)

}