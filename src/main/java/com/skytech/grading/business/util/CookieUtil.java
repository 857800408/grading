package com.skytech.grading.business.util;

import com.skytech.grading.config.util.JWTUtil;
import com.sun.org.apache.regexp.internal.RE;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Classname CookieUtil
 * @Description TODO
 * @Date 2019/6/24 20:14
 * @Created by huangdasheng
 */
public class CookieUtil {
    private final static  String  ACCESS_TOKEN = "access_token";

    /*得到cookie*/
    public static String getCookie(HttpServletRequest request) throws Exception{
        String token = "";
        Cookie[] cookies = request.getCookies();
        if(cookies.length==0){
            throw new Exception();
        }else {
            for(Cookie cookie :cookies){
                if(ACCESS_TOKEN.equals(cookie.getName())){
                    token = cookie.getValue();
                }
            }
        }
        return token;
    }

    //得到用户名字
    public static String getUsername(HttpServletRequest request)throws Exception{
        String cookie = getCookie(request);
        return JWTUtil.getUsername(cookie);
    }
}
