package com.skytech.grading.business.service;

import com.skytech.grading.business.util.PageHelper;

/**
 * @Classname RuleService
 * @Description TODO
 * @Date 2019/6/25 14:24
 * @Created by huangdasheng
 */
public interface RuleService {
    public PageHelper getRuleByPage(PageHelper pageHelper);
}
