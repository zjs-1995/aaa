package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        //获取浏览器传过来的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");

        //获取系统自动生成的验证码
        HttpSession session = req.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");

        //保证每次的验证码不一样,运行一次删除一次
        session.removeAttribute("checkCode_session");

        //判断系统生成的验证码是否正确                   //忽略大小写比较
        if (checkCode_session!=null && checkCode_session.equalsIgnoreCase(checkCode)){
            //如果验证码正确,在判断用户名和密码
            if ("zhangsan".equals(username) && "123".equals(password)){
                session.setAttribute("user",username);
                resp.sendRedirect(req.getContextPath()+"/success.jsp");
            }else{
                //登录失败
                req.setAttribute("login_error","用户名或密码错误");
                //重新跳转到登录页面
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }else{
            //验证码不一致
            req.setAttribute("cc_error","验证码输入错误");
            //跳转到登录页面
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
