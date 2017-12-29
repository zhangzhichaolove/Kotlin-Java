package com.chao.peak.model

/**
 * Created by Chao on 2017-12-28.
 */
data class UserModel2(val id: Int? = null, var name: String? = null, var age: Int? = null) {

    override fun toString(): String {
        return "UserModel(id=$id, name='$name', age=$age)"
    }
}