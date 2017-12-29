package com.chao.peak.kotlin

/**
 * 重写父类构造
 * Created by Chao on 2017-12-29.
 */
class OpenClassImpl public constructor(var names: String = "构造默认值") : OpenClass(names) {

    init {
        name = "haha"
    }

    override fun show() {
        println("重写Show方法($name)")
    }
}