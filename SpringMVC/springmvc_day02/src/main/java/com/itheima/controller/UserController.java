package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了...");
        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);

        model.addAttribute("user",user);

        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid方法执行了...");
      /*  //请求妆发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);*/
     /*   //重定向
        response.sendRedirect(request.getContextPath()+"/index.jsp");
*/

        // 直接会进行响应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("你好");
        return;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        System.out.println("ModelAndView方法执行了...");
        //存储数据到mv
        mv.addObject("result","hello ModelAndView");
        // 封装结果视图
        mv.setViewName("success");
        return mv;
    }


    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect方法执行了...");


   /*     //请求转发
        return "forward:/WEB-INF/pages/success.jsp";
*/
        //重定向
        return "redirect:/index.jsp";
    }


    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        System.out.println(user);
        // 做响应
        user.setUsername("zhangsan");
        user.setAge(52);
        // 做响应
        return user;
    }

}
