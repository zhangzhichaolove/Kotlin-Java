package com.chao.peak.kotlin

/**
 * Created by Chao on 2017-12-29.
 */
open class View {
   public var value: String = "默认值"

    constructor() {
    }

    constructor(ctx: Any) {
        value = ctx.toString()
    }

    override fun toString(): String {
        return "View(value='$value')"
    }


}