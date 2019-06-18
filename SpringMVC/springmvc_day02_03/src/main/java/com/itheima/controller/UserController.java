package com.itheima.controller;

import com.itheima.domain.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
//文件上传

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request, MultipartFile upload) throws IOException {
        //1.将文件传到服务器的/uploads/目录下
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //2.判断是否存在uploads,没有创建
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }

        //3.获取上传的文件名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;

        //4.文件上传
        upload.transferTo(new File(path,filename));

        return "success";
    }

    @RequestMapping("/fileupload2")
    public String fileupload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("跨服务器上传文件");

        // 1.定义上传文件服务器路径
        String path = "http://localhost:9090/uploads/";
        // 2.获取要上传的文件名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
         filename = uuid + "_" + filename;

        // 3.创建客户端的对象
        Client client = Client.create();
        // 4.和图片服务器进行连接
        WebResource webResource = client.resource(path + filename);
        // 5.上传文件
        webResource.put(upload.getBytes());
        return "success";
    }
}
