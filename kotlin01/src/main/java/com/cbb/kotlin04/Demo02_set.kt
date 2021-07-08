package com.cbb.kotlin04

fun main() {
    /**
     * Set创建于元素获取
     * 不允许重复
     */
    val set1 = setOf(1, 2, 3, 4)
    println(set1.elementAt(2))

    set1.forEachIndexed{index, value ->
        println("$index $value")
    }

    /**
     * 可变的set
     */
    println("-----------------------------")
    val mSet = mutableSetOf(1, 2, 3, 4)
    mSet.add(5)
    mSet += 6
    mSet.remove(5)
    mSet -= 6
    mSet.forEachIndexed{index, values ->
        println("$index $values")
    }

    /**
     * list转set 去重
     */
    println("-----------------------------")
    val dSet = listOf(1, 1, 1, 2, 3, 4, 5, 5).distinct()
    println(dSet)
}