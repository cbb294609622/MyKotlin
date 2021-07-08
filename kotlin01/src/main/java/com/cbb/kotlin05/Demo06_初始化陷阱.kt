package com.cbb.kotlin05

/**
 * 初始化陷阱1
 *      在使用初始化块时，顺序非常重要，你必须保证块中的所有属性已完成初始化
 *      前后顺序很重要。
 */
class Test1(){
    //位置要放对，建议初始化块 最好放到 变量的最后面
//    val blood = 100 //正确
//    init {
//        val bloodBouns = blood.times(4)
//    }
//    val blood = 100 //错误
}

/**
 * 初始化陷阱2
 *      这段代码编译没有问题，因为编译器看到name属性已经在init块里初始化了，
 *      但代码运行，就会抛出空指针，因为name属性还没有赋值，firstLetter函数就应用它了。
 */
class Test2(){
    val name:String
    private fun firstLetter() = name[0]

    init {
        //name[0] 当前还没有赋值  调换位置即可
        println(firstLetter())
        name = "jack"
    }
}

/**
 * 初始化陷阱3
 *      因为编译器看到所有属性都初始化了，所以代码编译没问题，但是运行结果却是null
 *      问题出在哪里？
 *          在用initPlayerName函数初始化playerName时，name属性还未完成初始化。
 */
class Test3(_name:String){
    //依旧是 在name未赋值时，使用了，需要调换一下 name和playerName的位置
//    val name:String = _name
//    val playerName:String = initPlayerName()  //正确

    val playerName:String = initPlayerName()    //错误
    val name:String = _name //错误
    private fun initPlayerName() = name

}


fun main() {
    val tes3 = Test2()
    println(Test3("jack").playerName)
}