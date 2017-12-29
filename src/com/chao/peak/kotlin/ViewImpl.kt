package com.chao.peak.kotlin

/**
 * Created by Chao on 2017-12-29.
 */
class ViewImpl : View {
    constructor() : this("构造委托") {
    }

    /**
     * 调用父类构造
     */
    constructor(ctx: Any) : super(ctx) {
    }
}