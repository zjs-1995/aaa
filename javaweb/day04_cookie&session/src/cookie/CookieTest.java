package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 在服务器中的Servlet判断是否有一个名为lastTime的cookie
 1. 有：不是第一次访问
 1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
 2. 写回Cookie：lastTime= 当前时间
 2. 没有：是第一次访问
 1. 响应数据：您好，欢迎您首次访问
 2. 写回Cookie：lastTime= 当前时间
 */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("texy/html;charset=utf-8");
        //获取所有cookie
        Cookie[] cookies = req.getCookies();
        //设置没有cookie为lastname
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                //如果有lastname,不是第一次访问
                if ("lastname".equals(name)) {
                    flag = true;
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    String format = sdf.format(date);
                    System.out.println("编码前:" + format);

                    //编码
                    String encode = URLEncoder.encode(format, "utf-8");
                    System.out.println("编码后:" + encode);
                    cookie.setValue(encode);

                    //设置cookie存活时间 一个月
                    cookie.setMaxAge(60 * 60 * 24 * 30);

                    //响应数据
                    String value = cookie.getValue();
                    System.out.println("解码前:" + value);
                    //URL解码
                    String decode = URLDecoder.decode(value, "utf-8");
                    System.out.println("解码后:" + decode);

                    resp.getWriter().write("<h1>欢迎回来，您上次访问时间为:" + decode + "</h1>");

                    break;
                }
            }
        }

        if (cookies==null || cookies.length==0 || flag==false){
            //没有cookie  是第一次访问
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat();
            String format = sdf.format(date);
            System.out.println("编码前:" + format);
            //编码
            String encode = URLEncoder.encode(format, "utf-8");
            System.out.println("编码后:" + encode);
            Cookie cookie = new Cookie("lastname",encode);

            //设置cookie存活时间 一个月
            cookie.setMaxAge(60 * 60 * 24 * 30);
            resp.addCookie(cookie);

            resp.getWriter().write("<h1>您好，欢迎您首次访问</h1>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
