package com.noesblog.aliyun.ocr;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.util.HashMap;
import java.util.Map;

public class ImageToOCR {

    private String host = "http://tysbgpu.market.alicloudapi.com";
    private String path = "/api/predict/ocr_general";
    private String method = "POST";
    private String appcode = "your appcode";    //必填！Required

    public ResponseBody getOcrResult(String imagePath){
        //get image file path and base64 image      设置文件路径及将图片Base64编码
        String imageFilePath = imagePath;
        String fileBase64 = Base64.getImageStr(imageFilePath);

        //add api http header       设置http请求头格式
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();

        //set api http body         拼接http请求主体
        String bodys = "{" +
                "   \"image\":    \"" +fileBase64+"\"," +
                "" +
                "\"configure\":" +
                "    \"{\\\"min_size\\\" : 16, " +
                "      \\\"output_prob\\\" : true}\"}";

        try {
            //send http request     发送http请求
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);

            //mapping Json to Object   映射返回数据到对象
            Gson gson = new Gson();
            ResponseBody responseBody = gson.fromJson(EntityUtils.toString(response.getEntity()),ResponseBody.class);

            //返回对象结果集
            return responseBody;
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回空
        return null;
    }
}