package com.skytech.grading.business.dao;

import com.skytech.grading.business.domain.Rule;
import com.skytech.grading.business.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname RuleDao
 * @Description TODO
 * @Date 2019/6/25 14:26
 * @Created by huangdasheng
 */
@Repository
public interface RuleDao {
    List<Rule> getRuleByPage(int page, int limit,String postId) throws Exception;

    int getRuleCount(String type)throws Exception;
}
