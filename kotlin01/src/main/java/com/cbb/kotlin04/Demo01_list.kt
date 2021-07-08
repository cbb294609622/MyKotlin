package com.cbb.kotlin04

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    /**
     * 不可变list集合 listof
     */
    val list: List<String> = listOf("json", "jake", "jackey")
//    println(list[3])//数组越界
    println(list.getOrElse(3){"Unknown"})
    println(list.getOrNull(3)?:"Unknown")

    /**
     * 可变的list集合 mutableListOf
     */
    val mList = mutableListOf("json", "woke", "week")
    mList.add("Jimery")
    println(mList)
    mList.remove("woke")
    println(mList)

    /**
     * 相互转换
     */
    val toMutableList = listOf("a", "b").toMutableList()
    val toList = mutableListOf("a", "b").toList()

    println("-------------------")
    /**
     * mutator函数
     * 1.能修改可变列表的函数有个统一的名字：mutator函数
     * 2.添加元素运算符与删除元素运算符
     * 3.基于lambda表达式指定的条件删除元素
     */
    mList +="work"  //add
    mList -="json"  //remove
    mList.removeIf {it.contains("work")}//指定删除包含的元素
    println(mList)

    /**
     * 遍历集合
     */
    println("-------------------")
    for (s in mList) {
        println(s)
    }
    mList.forEach{
        println(it)
    }

    mList.forEachIndexed{index,item ->
        println("$index  $item")
    }

    /**
     * 解构
     * _ 表示忽略 不使用
     */
    println("-------------------")
    val (a:String,_:String) = mList
    println("$a  ")
}