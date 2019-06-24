package com.skytech.grading.config.util;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @Classname ShiroUtil
 * @Description TODO
 * @Date 2019/5/6 16:57
 * @Created by huangdasheng
 */
/*
*
* */
public class ShiroUtil {

    private final static String hashAlgorithmName = "MD5";

    private final static Integer hashIterations = 1024;
    public static String secretPassword(String password){
        Object obj = new SimpleHash(hashAlgorithmName, password, null, hashIterations);
        return obj.toString();
    }

}
