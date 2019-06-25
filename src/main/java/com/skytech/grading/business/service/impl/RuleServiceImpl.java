package com.skytech.grading.business.service.impl;

import com.skytech.grading.business.dao.RuleDao;
import com.skytech.grading.business.domain.Rule;
import com.skytech.grading.business.service.RuleService;
import com.skytech.grading.business.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname RuleServiceImpl
 * @Description TODO
 * @Date 2019/6/25 14:25
 * @Created by huangdasheng
 */
@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private RuleDao ruleDao;
    /*查询分页 所有的规则*/
    @Override
    @Transactional
    public PageHelper getRuleByPage(PageHelper pageHelper) {
        try {
            /*查询总数*/
            int ruleCount = ruleDao.getRuleCount(pageHelper.getType());
            /*分页*/
            pageHelper.setTotalCount(ruleCount);
            pageHelper.setLimit(15);
            if(pageHelper.getPage()>pageHelper.getTotalCount()){
                pageHelper.setPage(pageHelper.getTotalCount());
            }

            if(pageHelper.getPage()<=0){
                pageHelper.setPage(1);
            }
            if(pageHelper.getPageIndex()<=0){
                pageHelper.setPageIndex(0);
            }
            List<Rule> ruleByPage = ruleDao.getRuleByPage(pageHelper.getPage(), pageHelper.getLimit(), pageHelper.getType());
            pageHelper.setList(ruleByPage);
        }catch (Exception e){

        }
        return pageHelper;
    }
}
