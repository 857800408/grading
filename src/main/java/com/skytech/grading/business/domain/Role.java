package com.skytech.grading.business.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class Role implements Serializable {
    private String roleId;
    private String roleName;
    private List<Permission> permissionList;

}
