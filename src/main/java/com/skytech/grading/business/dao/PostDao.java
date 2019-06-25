package com.skytech.grading.business.dao;

import com.skytech.grading.business.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname PostDao
 * @Description TODO
 * @Date 2019/6/25 15:46
 * @Created by huangdasheng
 */
@Repository
public interface PostDao {
    List<Post> getAllPost();
}
