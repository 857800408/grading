package com.skytech.grading.business.service.impl;

import com.skytech.grading.business.dao.UserDao;
import com.skytech.grading.business.domain.User;
import com.skytech.grading.business.service.LoginService;
import com.skytech.grading.config.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @Classname LoginServiceImpl
 * @Description TODO
 * @Date 2019/4/30 17:01
 * @Created by huangdasheng
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public Object login(String id, String password) {
        try{
            HashMap<String, Object> hashMap = new HashMap<>();
            User userRole = userDao.getUserRole(id);
            //String secretpassword = ShiroUtil.secretPassword(password);
//            if(!userRole.getPassword().equals(password)){
//                hashMap.put("success",false);
//            }else {
//                hashMap.put("success","true");
//
//                //hashMap.put("token", JWTUtil.sign(id, password));
//                String sign = JWTUtil.sign(id, password);
//                System.out.println(sign);
//                hashMap.put("token", sign);
//            }
//            return hashMap;
             return userRole;
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

    }
}
