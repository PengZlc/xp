package com.yaao.ps10.app.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Arrays;
import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileManagerAppController {
    @Resource
    ServletContext servletContext;
    @Resource
    HttpServletResponse response;
    /**
     * app上传巡检任务图片
     * @param roomId 机房Id
     * @param processInStanceId 流程Id
     * @param files 文件组
     * @return UPLOAD_SUCCESS-上传成功，UPLOAD_FAIL-上传失败
     * @author xp
     */
    @RequestMapping("/disposeMultipartEntityUp")
    public String disposeMultipartEntityUp(@RequestParam(name="RoomId") String roomId,
                                          @RequestParam(name="myProcessInStanceId") String processInStanceId,
                                          @RequestParam(name = "files") MultipartFile[] files){
        String code;
        try{
            /*判断是否有文件上传*/
            if (files.length>0){
                /*获取当前项目下文件路径*/
                String path = servletContext.getRealPath("/")+"TaskPic/"+processInStanceId+"/"+roomId;
                /*验证当前路径是否存在，不存在则创建*/
                File doc = new File(path);
                if (!doc.exists()) {
                    boolean bool = doc.mkdirs();
                    System.out.println("创建巡检图片目录，结果="+bool);
                }
                Arrays.asList(files).forEach(s->{
                    /*文件名*/
                    String fileName = s.getOriginalFilename();
                    if (!StringUtils.isEmpty(fileName)){
                        /*后缀名*/
                        String suffixName = fileName.substring(fileName.lastIndexOf("."));
                        /*生成新的文件名*/
                        fileName = UUID.randomUUID() + suffixName;
                        File file = new File(path+"/"+fileName);
                        try {
                            s.transferTo(file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
            code = "UPLOAD_SUCCESS";
        }catch(Exception e){
            code = "UPLOAD_FAIL";
        }
        return code;
    }
    /**
     * app上传否决图片
     * @param roomId 机房Id
     * @param processInStanceId 流程Id
     * @param files 文件组
     * @return UPLOAD_SUCCESS-上传成功，UPLOAD_FAIL-上传失败
     * @author xp
     */
    @RequestMapping("/disposeMultipartPicture")
    public String disposeMultipartPicture(@RequestParam(name="RoomId") String roomId,
                                        @RequestParam(name="myProcessInStanceId") String processInStanceId,
                                          @RequestParam(name = "files") MultipartFile[] files){
        String code;
        try{
            /*判断是否有文件上传*/
            if (files.length>0){
                /*获取当前项目下文件路径*/
                String path = servletContext.getRealPath("/")+"EvaluatePic/"+processInStanceId+"/"+roomId;
                /*验证当前路径是否存在，不存在则创建*/
                File doc = new File(path);
                if (!doc.exists()) {
                    boolean bool = doc.mkdirs();
                    System.out.println("创建否决图片目录，结果="+bool);
                }
                Arrays.asList(files).forEach(s->{
                    /*文件名*/
                    String fileName = s.getOriginalFilename();
                    if (!StringUtils.isEmpty(fileName)){
                        /*后缀名*/
                        String suffixName = fileName.substring(fileName.lastIndexOf("."));
                        /*生成新的文件名*/
                        fileName = UUID.randomUUID() + suffixName;
                        File file = new File(path+"/"+fileName);
                        try {
                            s.transferTo(file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
            code = "UPLOAD_SUCCESS";
        }catch(Exception e){
            code = "UPLOAD_FAIL";
        }
        return code;
    }

    /**
     * Android上传db文件
     * @param fileName 文件名
     * @param userName 用户名
     * @param length 长度
     * @param file 上传的文件
     * @author xp
     */
    @RequestMapping("/upLoadDB")
    public void upLoadDB(@RequestParam("fileName") String fileName,@RequestParam("username") String userName,
                         @RequestParam(value = "length",required = false) Long length,@RequestParam("file")  MultipartFile file){
        /*获取项目路径*/
        String dirPath = servletContext.getRealPath("/");
        /*获取文件存放路径*/
        String realPath= dirPath + "DBUpload";
        /*验证项目存放目录是否存在，否在创建*/
        File fd = new File(realPath);
        if (!fd.exists()) {
            boolean bool = fd.mkdirs();
            System.out.println("创建安卓DB文件目录，结果="+bool);
        }
        String dbPath = realPath + "DBUpload\\New" + userName + fileName;
        String dbPath2 = realPath + "DBUpload\\" + userName + fileName;
        File f = new File(dbPath);
        if (!f.exists()){
            boolean bool = f.mkdirs();
            System.out.println("创建新的安卓DB文件目录，结果="+bool);
        }
        long fileSize = 0;
        try {
            file.transferTo(f);
            fileSize = file.getSize();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(length == fileSize && fileSize > 32768) {
            renameFile(dbPath,dbPath2);
        } else {
            File oldFile=new File(dbPath);
            if(oldFile.exists()){
                boolean bool = oldFile.delete();
                System.out.println("删除安卓DB文件，结果="+bool);
            }

        }
    }

    /**
     * Android上传db文件
     * @param filePath 文件路径
     * @param userName 用户名
     * @author xp
     */
    @RequestMapping("/downLoadDB")
    public void downLoadDB(@RequestParam("filePath") String filePath,
                           @RequestParam("username") String userName ){
        /*获取项目路径*/
        String dirPath = servletContext.getRealPath("/");
        /*获取文件存放路径*/
        String realPath= dirPath + "DBUpload";
        File file = new File(realPath+userName+filePath);
        /*验证当前路径是否存在*/
        if(!file.exists()){
            byte[] buffer = new byte[1024];
            FileInputStream fis = null; //文件输入流
            BufferedInputStream bis = null;
            OutputStream os; //输出流
            try {
                os = response.getOutputStream();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                assert bis != null;
                bis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 文件重命名
     * */
    public void renameFile(String oldName,String newName) {
        if (!StringUtils.isEmpty(oldName)&!StringUtils.isEmpty(newName)){
            if(!oldName.equals(newName)){
                File oldFile=new File(oldName);
                File newFile=new File(newName);
                if(!oldFile.exists()){
                    return;
                }
                if(newFile.exists()) {
                    boolean delNewDoc = newFile.delete();
                    System.out.println("删除新的安卓DB文件目录，结果="+delNewDoc);
                    boolean delOldDoc = oldFile.renameTo(newFile);
                    System.out.println("删除旧的安卓DB文件目录，结果="+delOldDoc);
                }
                else{
                    boolean reNameFile = oldFile.renameTo(newFile);
                    System.out.println("更改旧文件名为新文件名，结果="+reNameFile);
                }
            }else{
                System.out.println("新文件名和旧文件名相同...");
            }
        }
    }
}
