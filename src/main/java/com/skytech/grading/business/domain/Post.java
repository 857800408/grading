package com.skytech.grading.business.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Post
 * @Description TODO
 * @Date 2019/6/24 21:54
 * @Created by huangdasheng
 */
@Data
public class Post implements Serializable {
    private String postId;
    private String postName;
    private String postIntroduction;
}
