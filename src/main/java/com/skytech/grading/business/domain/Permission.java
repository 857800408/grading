package com.skytech.grading.business.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permission implements Serializable {
    private String permissionId;
    private String permissionName;
    //中文名字
    private String permissionZNName;
}
