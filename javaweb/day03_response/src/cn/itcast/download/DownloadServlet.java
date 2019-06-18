package cn.itcast.download;

import cn.itcast.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String filename = req.getParameter("filename");
        ServletContext context = this.getServletContext();
        String realPath = context.getRealPath("/image/" + filename);
        FileInputStream fis = new FileInputStream(realPath);

        //设置响应头
        String mimeType = context.getMimeType(filename);
        resp.setHeader("content-type",mimeType);

        //解决中文文件名乱码问题
        String agent = req.getHeader("user-agent");
         filename = DownLoadUtils.getFileName(agent, filename);

         resp.setHeader("content-disposition","attachment;filename="+filename);
        ServletOutputStream os = resp.getOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        fis.close();
    }

@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
