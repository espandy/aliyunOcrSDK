package com.noesblog.aliyun.ocr;


/*
      测试示例
 */
public class Test {

    public static void main(String[] args) {
        // create ImageToOCR object
        //创建OCR对象
        ImageToOCR imageToOCR = new ImageToOCR();
        // set response object and set image file path
        //设置返回结果对象及传入文件地址
        ResponseBody responseBody = imageToOCR.getOcrResult("image file path");

        //打印结果集
        // print id
        System.out.println(responseBody.getRequest_id());
        System.out.println();

        //print return word
        //打印返回的结果集
        Ret[] words = responseBody.getRet();
        for (Ret word:words) {
            System.out.println(word.getWord() + "\"");
        }
    }
}