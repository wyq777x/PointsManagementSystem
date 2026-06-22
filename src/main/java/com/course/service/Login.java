package com.course.service;

import com.course.pojo.PointObject;
import com.course.utils.FileUtils;
import com.course.utils.JsonUtils;
import org.springframework.stereotype.Component;

/**
 * @author lixuy
 * Created on 2019-04-11
 */
// 类名与方法名须与controller层拦截的方法一致
@Component
// 登录平台
public class Login
{

    public void login()
    {
        System.out.println("======被拦截的login方法执行======");
    }
}
