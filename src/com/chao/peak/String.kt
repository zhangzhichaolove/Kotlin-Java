package string

/**
 * Created by Chao on 2017-12-28.
 */
fun String.lastChar(): Char = if (length > 0) get(length - 1) else '-'