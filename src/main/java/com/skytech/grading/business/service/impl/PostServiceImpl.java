package com.skytech.grading.business.service.impl;

import com.skytech.grading.business.domain.Post;
import com.skytech.grading.business.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skytech.grading.business.dao.PostDao;
import java.util.List;

/**
 * @Classname PostServiceImpl
 * @Description TODO
 * @Date 2019/6/25 15:45
 * @Created by huangdasheng
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;
    @Override
    public List<Post> getAllPost() {
        return postDao.getAllPost();
    }
}
