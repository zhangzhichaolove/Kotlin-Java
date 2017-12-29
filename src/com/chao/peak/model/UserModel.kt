package com.chao.peak.model

/**
 * Created by Chao on 2017-12-28.
 */
data class UserModel(val id: Int, var name: String, var age: Int){

    override fun toString(): String {
        return "UserModel(id=$id, name='$name', age=$age)"
    }
}