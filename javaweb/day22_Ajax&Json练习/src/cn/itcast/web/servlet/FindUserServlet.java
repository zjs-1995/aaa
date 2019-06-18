package cn.itcast.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* //获取数据
        String username = request.getParameter("username");
        response.setContentType("text/html;charset=utf-8");

        Map<String, Object> map = new HashMap<>();

        if ("tom".equals(username)){
            //已存在
            map.put("userExist",true);
            map.put("msg","此用户名太受欢迎,请更换一个");
        }else {
            //未存在
            map.put("userExist",false);
            map.put("msg","用户名可用");
        }

        //将map转为json，并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        response.getWriter().write(json);*/

        String username = request.getParameter("username");
        response.setContentType("text/html;charset=utf-8");
        Map<String, Object> map = new HashMap<>();
        if ("tom".equals(username)){
            //用户名已被注册
            map.put("userExist",true);
            map.put("msg","用户名已被注册,请换一个");
        }else{
            //可以注册
            map.put("userExist",false);
            map.put("msg","可以注册");
        }

        //将map转为json，并且传递给客户端
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
