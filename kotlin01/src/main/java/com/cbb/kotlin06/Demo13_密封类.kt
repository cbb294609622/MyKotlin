package com.cbb.kotlin06

/**
 * 密封类 sealed
 * 对于更复杂的ADT,你可以使用kotlin的密封类来实现更复杂的定义。
 * 密封类可以用来定义一个类似于枚举类的ADT，但你可以更灵活地控制某个子类型。
 *
 * 密封类可以有若干个子类，要继承密封类。这些子类必须和它定义在同一个文件里。
 */

sealed class LicenseStatus2 {

    object UnQualified : LicenseStatus2()

    object Learning : LicenseStatus2()

    class Qualified(val licenseID:String):LicenseStatus2()

}
class Driver2(var status:LicenseStatus2){
    fun checkLicense():String{
        return when(status){
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "在学"
            is LicenseStatus2.Qualified -> "有资格,驾驶证编号：${(this.status as LicenseStatus2.Qualified).licenseID}"
        }
    }
}

fun main() {
    println(Driver2(LicenseStatus2.Learning).checkLicense())
    println(Driver2(LicenseStatus2.Qualified("1918101819")).checkLicense())
}