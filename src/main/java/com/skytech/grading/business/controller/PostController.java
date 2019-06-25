package com.skytech.grading.business.controller;

import com.skytech.grading.business.domain.Post;
import com.skytech.grading.business.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname PostController
 * @Description TODO
 * @Date 2019/6/25 15:42
 * @Created by huangdasheng
 */
/*岗位接口*/
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/post/getAllPost",method = RequestMethod.GET)
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}
