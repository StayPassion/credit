package com.tjl.credit.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @Author PengBo
 * @CreateTime 2019/5/12 0:06
 * @Version 1.0.0
 */
public class FileUtils {

    /**
     * 创建文件夹的路径，基础路径加上学号文件夹
     * @param userNumber 唯一的学号
     * @return
     */
    public static String makeDir(String userNumber){
        String dir = "D:\\myfile";
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
    public static void downloadFile(String url,String fileName,
                                    HttpServletResponse response,File file) throws Exception {

        if (fileName != null) {
            //设置文件路径

            // 如果文件名存在，则进行下载
            if (file.exists()) {
                // 配置文件下载
                response.setHeader("content-type", "application/octet-stream");
                response.setContentType("application/octet-stream");
                // 下载文件能正常显示中文
                response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));

                // 实现文件下载
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
