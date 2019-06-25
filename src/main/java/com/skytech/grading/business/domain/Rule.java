package com.skytech.grading.business.domain;

import lombok.Data;

/**
 * @Classname Rule
 * @Description TODO
 * @Date 2019/6/25 14:27
 * @Created by huangdasheng
 */
@Data
public class Rule {
    /*规则编号*/
    private String ruleId;
    /*规则介绍*/
    private String ruleIntroduction;
    /*规则级别*/
    private String ruleLevel;
    /*规则岗位*/
    private String rulePost;
    /*规则类别*/
    private String ruleClass;
}
