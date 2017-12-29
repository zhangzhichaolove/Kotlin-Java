package com.chao.peak.java;

import com.chao.peak.HelloWord;
import com.chao.peak.model.UserModel;
import com.chao.peak.model.UserModel2;
import com.chao.peak.model.UserModel3;
import string.StringKt;

/**
 * Created by Chao on 2017-12-28.
 */
public class JavaMain {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        System.out.println(new UserModel(1, "张三", 10));
        System.out.println(new UserModel2(null, "李四", 12));
        System.out.println(new UserModel(1, "张三", 10));
        System.out.println(new UserModel(1, "张三", 10));
        UserModel3 user = new UserModel3();
        user.setName("老王");
        System.out.println(user);
        System.out.println(HelloWord.name);
        System.out.println(StringKt.lastChar("数字"));
    }
}
