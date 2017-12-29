package com.chao.peak

import com.chao.peak.model.UserModel
import com.chao.peak.model.UserModel2
import com.chao.peak.model.UserModel3
import java.lang.RuntimeException

/**
 * Created by Chao on 2017-12-28.
 */

fun main(args: Array<String>) {
    println("Hello Word!")
    println(UserModel(1, "张三", 10))
    println(UserModel2(null, "李四", 12))
    var user = UserModel3()
    user.name = "老王"
    println(user)
    println(HelloWord.max(5, 7))
    println(HelloWord.max2(12, 18))
    HelloWord.getMessage()
    println(Rectangle(5, 7).isSquare)
    println(Color.RED.rgb())
    println(HelloWord.getColor(Color.YELLOW))
}

object HelloWord {
    const val name = "字符串"
    var age: Int = 20
    val sex: Int? = null
    var message: String = ""

    fun getMessage() {
        if (2 > 5) {
            message = "x"
        } else {
            message = "y"
        }
        println("信息内容：${message}")
    }

    /**
     * 函数
     */
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    /**
     * 表达式函数体
     */
    fun max2(a: Int, b: Int): Int = if (a > b) a else b

    fun max3(a: Int, b: Int) = if (a > b) a else b

    fun getColor(color: Color) = when (color) {
        Color.RED -> "RED"
        Color.YELLOW -> "YELLOW"
        else ->throw RuntimeException("错误。")
    }
}

/**
 * 自定义访问器
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
//        get() {
//            return height == width
//        }
}

/**
 * 声明枚举类
 */
enum class Color(val r: Int, val g: Int, val b: Int) {

    RED(255, 0, 0), YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}
