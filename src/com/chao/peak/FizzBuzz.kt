package com.chao.peak

import com.chao.peak.kotlin.OpenClassImpl
import com.chao.peak.kotlin.View
import com.chao.peak.kotlin.ViewImpl
import java.io.BufferedReader
import java.io.StringReader
import string.lastChar as last

/**
 * Created by Chao on 2017-12-28.
 */
fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    val list = arrayListOf("10", "20", "38")
    for ((index, element) in list.withIndex()) {
        println("$index:$element")
    }
    println(isLetter('/'))
    println(isNotDigit('*'))
    println(recognize('G'))
    val num = 10
    val numResult = if (num in 0..100)
        num
    else
        throw RuntimeException("ERROR")
    println(numResult)
    println(readNumber(BufferedReader(StringReader("296"))))
    println(list.javaClass)
    println(list.max())
    val text = "最后一个字符"
    println(text.last())//别名引用
    println(parameter(1, 2, 66, 88))
    val (key, value) = 1 to "哈哈"
    println("$key$value")
    val open = OpenClassImpl("...")
    open.show()
    println(ViewImpl())
    println(ViewImpl("构造传参"))
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

/**
 * 检查区间成员
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "0-9"
    in 'a'..'z' -> "a-z"
    in 'A'..'Z' -> "A-Z"
    else -> "I don't Know..."
}

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine();
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

/**
 * 可变参数
 */
fun <T> parameter(vararg values: T): String {
    val sb = StringBuffer()
    sb.append("(")
    for (value in values) {
        sb.append("${value.toString()},")
    }
    if (sb.endsWith(",")) {
        sb.replace(sb.length - 1, sb.length, "")
    }
    sb.append(")")
    return sb.toString()
}