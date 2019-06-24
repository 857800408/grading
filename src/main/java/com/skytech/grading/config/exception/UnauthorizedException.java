package com.skytech.grading.config.exception;



/**
 * @Classname UnauthorizedException
 * @Description 异常处理
 * @Date 2019/4/30 17:01
 * @Created by huangdasheng
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() {
        super();
    }
}
