package com.cbb.kotlin07

class MagicBox3<T : Human>(vararg item: T) {
    var available = false
    private var subject: Array<out T> = item
    fun fetch(index:Int): T? {
        return subject[index].takeIf { available }
    }

    //把元素进行修改 例如：放入男孩，取出来的时候  变成男人
    //return -> R
    fun <R> fetch(index:Int,subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject[index]).takeIf { available }
    }

    operator fun get(index:Int):T?=subject[index]?.takeIf { available }

}


open class Human3(val age: Int)
class Boy3(val name: String, age: Int) : Human(age)
class Man3(val name: String, age: Int) : Human(age)

fun main() {
    val b1 = MagicBox3(
        Boy3("jack", 22),
        Boy3("jack2", 212),
        Boy3("jack1", 222),
        Boy3("jacke", 2)
    )
    b1.available = true
    b1.fetch(1)?.run {
        println("you find $name $age")
    }
    b1.fetch(2){
        Man3(it.name,it.age.plus(15))
    }
}