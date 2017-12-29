package com.chao.peak

/**
 * Created by Chao on 2017-12-29.
 */
class StringKt{
    fun String.lastChar(): Char = if (length > 0) get(length - 1) else '-'
}