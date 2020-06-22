package com.zhenhao.service;

import com.alibaba.fastjson.JSONObject;
import com.zhenhao.service.annotation.UserLoginToken;
import com.zhenhao.service.bean.UserInfo;
import com.zhenhao.service.service.TokenService;
import com.zhenhao.service.service.UserInfoService;
import com.zhenhao.service.util.TokenUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    TokenService tokenService;
    // 登录
    @ApiOperation(value = "登陆", notes = "登陆")
    @RequestMapping(value = "/login.do" ,method = RequestMethod.GET)
//    public Object login(UserInfo user, HttpServletResponse response) {
    public Object login(@RequestParam("username") String username,@RequestParam("password") String password,HttpServletResponse response) {
//        @RequestParam("username") String username,@RequestParam("password") String password,
        UserInfo user=new UserInfo();
        user.setUserName(username);
        user.setUserPassword(password);

        JSONObject jsonObject = new JSONObject();
        UserInfo userForBase = new UserInfo();
        userForBase.setUserID(userInfoService.findByUsername(username).getUserID());
        userForBase.setUserName(userInfoService.findByUsername(username).getUserName());
        userForBase.setUserPassword(userInfoService.findByUsername(username).getUserPassword());
        if (!userForBase.getUserPassword().equals(user.getUserPassword())) {
            jsonObject.put("message", "登录失败,密码错误");
            return jsonObject;
        } else {
            String token = tokenService.getToken(userForBase);
            jsonObject.put("token", token);

            Cookie cookie = new Cookie("token", token);
            cookie.setPath("/");
            response.addCookie(cookie);

            return jsonObject;

        }
    }
    /***
     * 这个请求需要验证token才能访问
     *
     * @author: qiaoyn
     * @date 2019/06/14
     * @return String 返回类型
     */
    @UserLoginToken
    @ApiOperation(value = "获取信息", notes = "获取信息")
    @RequestMapping(value = "/getMessage" ,method = RequestMethod.GET)
    public String getMessage() {

        // 取出token中带的用户id 进行操作
        System.out.println(TokenUtil.getTokenUserId());

        return "您已通过验证";
    }
}
