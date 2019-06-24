package com.skytech.grading.business.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Organization
 * @Description TODO
 * @Date 2019/6/24 21:56
 * @Created by huangdasheng
 */
@Data
public class Organization implements Serializable {
    private String orgId;
    private String orgName;
}
