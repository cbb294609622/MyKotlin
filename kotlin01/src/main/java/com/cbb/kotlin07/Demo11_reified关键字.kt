package com.cbb.kotlin07

/**
 * reified
 * 有时候，你可能想知道某个泛型参数具体是什么类型，
 * reified关键字能帮你检查泛型参数类型。
 * kotlin不允许对泛型参数T做类型检查，因为泛型参数类型会被类型擦除。
 * 也就是说，T的类型信息在运行时是不可知的。
 * java也有这样的规范。
 *
 */

class MagBoxs<T :Human>(){
    //随机产生一个对象，如果不是指定类型的对象，就通过backup函数生成一个指定的对象
//    fun <T> randomOrBackup(backup:()->T):T{
//        val items = listOf(){
//            Boys("jack",20)
//            Mans("Jnoh",22)
//        }
//        val random = items.shuffled().first()
//        return if (random is T){
//            random
//        }else{
//            backup()
//        }
//    }
    //保留反射的类型
    inline fun <reified T> randomOrBackup(backup:()->T):T{
        val items = listOf(){
            Boys("jack",20)
            Mans("Jnoh",22)
        }
        val random = items.shuffled().first()
        return if (random is T){
            random
        }else{
            backup()
        }
    }
}
open class Humans(val age:Int)
class Boys(val name:String,age: Int):Human(age){
    override fun toString(): String {
        return "Boys(name='$name',age='$age')"
    }
}
class Mans(val name:String,age: Int):Human(age){
    override fun toString(): String {
        return "Mans(name='$name',age='$age')"
    }
}

fun main() {
    val box:MagBoxs<Mans> = MagBoxs()
    val subject = box.randomOrBackup {
        Boys("jack", 20)
    }
    println(subject)
}