package com.zjw.springbootday02.controller.user;

import com.zjw.springbootday02.entities.User;
import com.zjw.springbootday02.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhjw
 * @date 2020-03-26 10:11
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    /**
     * 登陆首页
     * @return
     */
    /* @PostMapping(value = "/user/login")*/

    @RequestMapping(value={"/login","/"},method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 登录判断
     * @param request
     * @return
     */
    @RequestMapping(value="/login",method = RequestMethod.POST)
    //PostMapping的作用是相当于@RequestMapping(value="",method = RequestMethod.POST)
    //@RequestParam("username")String username,@RequestParam("password")String password,
    public String login(User user,HttpServletRequest request){
        if(userService.queryByUserName(user)==null){
            request.setAttribute("msg","账户名或密码错误");
            return "login";
        }else{
            return "zjw/dashboard";
        }
    }

    /**
     * 成功页面
     * @return
     */
    @RequestMapping(value="/dashboard",method = RequestMethod.GET)
    public String dashboard(){
        return "zjw/dashboard";
    }

}
