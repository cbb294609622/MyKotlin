package com.cbb.kotlin07

/**
 * out 协变
 * 如果泛型类只将泛型类作为函数的返回(输出)
 * 那么使用out 可以称之为生产类/接口，
 * 因为它主要是用来生产(product)指定的泛型对象。
 *
 *
 * in 逆变
 * 如果泛型类只将泛型类型作为函数的入参(输入),那么使用in
 * 可以称之为消费者类/接口。
 * 因为它主要是用来消费(consume)指定的泛型对象。
 *
 *
 * invariant 不变
 * 如果泛型类即将泛型类型作为函数参数，又将泛型类型作为函数的输出。
 * 那么既不用out也不用in
 *
 */
//out
interface Product<out T>{
    fun product():T
}
//in
interface Consumer<in T>{
    fun consumer(item:T)
}
//invariant
interface ProductionConsumer<T>{
    fun product():T
    fun consumer(item:T)
}

open class Food
open class FastFood:Food()
class Burger:FastFood()


//生产者   食品商店
class FoodStore:Product<Food>{
    override fun product(): Food {
        println("Product Food")
        return Food()
    }
}

//生产者   快餐商店
class FastFoodStore:Product<FastFood>{
    override fun product(): FastFood {
        println("Product FastFood")
        return FastFood()
    }
}

//生产者   汉堡商店
class BurgerStore:Product<Burger>{
    override fun product(): Burger {
        println("Product Burger")
        return Burger()
    }
}


//消费者
class EveryBody :Consumer<Food>{
    override fun consumer(item: Food) {
        println("Eat food.")
    }
}
class ModernPeople :Consumer<FastFood>{
    override fun consumer(item: FastFood) {
        println("Eat fastFood.")
    }
}
class American :Consumer<Burger>{
    override fun consumer(item: Burger) {
        println("Eat burger.")
    }

}


fun main() {
    //子类泛型对象可以赋值给父类泛型对象，用out
    val product1 :Product<Food> = FoodStore()
    val product2 :Product<Food> = FastFoodStore()
    val product3 :Product<Food> = BurgerStore()

    //父类泛型对象可以赋值给子类泛型对象，用in
    val consumer1 :Consumer<Burger> = EveryBody()
    consumer1.consumer(Burger())
    val consumer2 :Consumer<Burger> = ModernPeople()
    consumer2.consumer(Burger())
    val consumer3 :Consumer<Burger> = American()
    consumer3.consumer(Burger())

}