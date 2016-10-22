package com.cn.hnust.controller;

import com.cn.hnust.dao.IUserPojoDao;
import com.cn.hnust.pojo.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2016/10/19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserPojoDao dao;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model) throws Exception{

        UserPojo userPojo = dao.selectUserMessage("asdf12");
        List alist = new ArrayList();
        alist.add(userPojo);
        System.out.println(userPojo);
        model.addAttribute("user", alist);
        return "showUser";
    }
}
