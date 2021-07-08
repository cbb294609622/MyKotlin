package com.cbb.kotlin07

class MagicBox2<T : Human>(item: T) {
    var available = false
    private var subject: T = item
    fun fetch(): T? {
        return subject.takeIf { available }
    }

    //把元素进行修改 例如：放入男孩，取出来的时候  变成男人
    //return -> R
    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }

}


open class Human(val age: Int)
class Boy2(val name: String, age: Int) : Human(age)
class Man2(val name: String, age: Int) : Human(age)

fun main() {
    val b1 = MagicBox2(Boy2("jack", 22))
    b1.available = true
    b1.fetch()?.run {
        println("you find $name")
    }
    val man2 = b1.fetch {
        Man2(it.name, it.age.plus(15))
    }
    if (man2 != null) {
        println("${man2.name} ${man2.age}")
    }
}