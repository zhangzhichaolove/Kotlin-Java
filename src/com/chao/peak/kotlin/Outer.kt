package com.chao.peak.kotlin

/**
 * 类嵌套：
 * 内部持有外部引用
 * Created by Chao on 2017-12-29.
 */
class Outer {
    inner class Inner {
        fun getOuter(): Outer = this@Outer
    }
}