package com.cbb.kotlin06

/**
 * 代数数据类型
 * 可以用来表示一组子类型的闭集，枚举类就是一种简单的ADT。
 */

enum class LicenseStatus{
    UNQUALIFIED,
    LEARNING,
    QUALIFIED;

}
class Driver(var status:LicenseStatus){
    fun checkLicense():String{
        return when(status){
            LicenseStatus.UNQUALIFIED -> "没资格"
            LicenseStatus.LEARNING -> "在学"
            LicenseStatus.QUALIFIED -> "有资格"
        }
    }
}

fun main() {
    println(Driver(LicenseStatus.QUALIFIED).checkLicense())
}