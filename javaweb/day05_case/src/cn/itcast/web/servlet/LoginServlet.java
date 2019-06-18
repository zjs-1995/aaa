package cn.itcast.web.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

//登录页面

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");
        //获取数据
        //先单独获取用户填写的验证码,用于判断
        String verifycode = req.getParameter("verifycode");
        //获取系统生成的验证码
        HttpSession session = req.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        //确保验证码一次性
        session.removeAttribute("CHECKCODE_SERVER");
        //用户输入的验证码和系统生成的验证码比较
        if (checkcode_server==null || !checkcode_server.equalsIgnoreCase(verifycode)){
            //如果验证码不正确,提示错误信息,跳转到登录页面
            req.setAttribute("login_msg","验证码错误!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        //如果验证码正确
        //获取数据
        Map<String, String[]> map = req.getParameterMap();
        //使用BeanUtils的populate方法吧map封装到user对象中
        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserService service = new UserServiceImpl();
        User loginUser = service.login(user);
        //判断是否登录成功
        if (loginUser!=null){
            //登录成功
            //将用户存入session ,跳转到index.jsp
            session.setAttribute("user",loginUser);
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        }else{
            //登录失败
            //提示错误信息,跳转到登录页面
            req.setAttribute("login_msg","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}

