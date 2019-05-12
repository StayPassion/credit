package com.tjl.credit.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author PengBo
 * @CreateTime 2019/5/12 0:06
 * @Version 1.0.0
 */
public class FileUtils {
    private static String dir="D:\\myfile";

    /**
     * 创建文件夹的路径，基础路径加上学号文件夹
     * @param userNumber 唯一的学号
     * @return
     */
    public static String makeDir(String userNumber){
        dir += "\\"+userNumber;
        return dir;
    }
    public static String getFileName(MultipartFile file){
        return file.getOriginalFilename();
    }

    /**
     * 文件上传
     * @param fileName 文件名
     * @param dir 文件路径
     * @return
     */
    public static boolean uploadFile(MultipartFile file,String fileName,String dir){
        File dirFile = new File(dir);
        if (!dirFile.exists()){
            dirFile.mkdir();
        }
        File targetFile = new File(dir+"\\"+fileName);
        try {
            //写入文件
            file.transferTo(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static void downloadFile(String url,String fileName, HttpServletResponse response) {
        File file = new File(url+"\\"+fileName);
        FileInputStream fis = null;
        if (file.exists()) {
            try {
                // 设置强制下载不打开    
                response.reset();
                response.setHeader("Content-Disposition", "attachment; filename="+fileName);
                response.setContentType("application/octet-stream; charset=utf-8");
                //response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
                fis =  new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int count = 0;
                while ((count = fis.read(buffer)) > 0) {
                    response.getOutputStream().write(buffer, 0, count);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    response.getOutputStream().flush();
                    response.getOutputStream().close();
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
