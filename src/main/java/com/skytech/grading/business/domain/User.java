package com.skytech.grading.business.domain;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/4/28 19:55
 * @Created by huangdasheng
 */
//lombok
@Data  //不用手动添加set get方法
public class User implements Serializable {
    private String id;
    private String password;
    private String name;
    private Integer age;
    private String email;
    private List<Role> roleList;
    //入司时间
    private Date admissionTime;
    private String personalIntroduction;

}
