package com.cbb.kotlin06

/**
 * 数据类
 * 数据类是专门设计用来存储数据的类
 * 数据类提供了toString的个性化实现，
 * == 符号默认情况下，比较对象就是比较他们的引用值，数据类提供了equals和hashcode的个性化实现
 */
data class C1(
    var x:Int,
    var y:Int
){
    val isInBounds = x >0 && y > 0
}

fun main() {
    println(C1(10,20))
    //== 比较的是内容 equals Any 默认实现===，比较的引用
    //=== 比较的是引用
    println(C1(10,20) == C1(10,20))
}