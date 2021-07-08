package com.cbb.kotlin07

/**
 * 泛型函数
 * 泛型参数也可以用于函数。
 * 定义一个函数用于获取元素，当且仅当MagicBox可用时，才能获取元素。
 *
 */

class MagicBox1<T>(item:T){
    var available = false
    private var subject:T = item
    fun fetch():T?{
        return subject.takeIf { available }
    }

    //把元素进行修改 例如：放入男孩，取出来的时候  变成男人
    //return -> R
    fun <R> fetch(subjectModFunction:(T) -> R):R?{
        return subjectModFunction(subject).takeIf { available }
    }

}
class Boy1(val name:String,val age:Int)
class Man1(val name:String,val age:Int)
class Dog1(val weight:Int)

fun main() {
    val b1 = MagicBox1(Boy1("jack", 22))
    val b2 = MagicBox1(Dog1( 22))
    b1.available = true
    b1.fetch()?.run {
        println("you find $name")
    }
    val man1 = b1.fetch {
        Man1(it.name, it.age.plus(15))
    }
    if (man1 != null) {
        println("${man1.name} ${man1.age}")
    }
}