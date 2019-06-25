package com.skytech.grading.business.controller;

import com.skytech.grading.business.service.RuleService;
import com.skytech.grading.business.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RuleController
 * @Description TODO
 * @Date 2019/6/25 14:19
 * @Created by huangdasheng
 */
/*规则的接口*/
@RestController(value = "/rule")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    /*查询所有规则*/
    @RequestMapping(value = "/getRuleByPage",method = RequestMethod.GET)
    public PageHelper getRuleByPage(PageHelper pageHelper){
        return ruleService.getRuleByPage(pageHelper);
    }
}
