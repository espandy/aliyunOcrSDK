# aliyunOcrSDK version 0.0.1
This is a simplified version of the OCR universal print character recognition (GPU) provided for Ali cloud, which you can develop quickly using the SDK (SDK).
 
Usage method：
```java
ImageToOCR imageToOCR = new ImageToOCR();
ResponseBody responseBody = imageToOCR.getOcrResult("image file path");
//Then you can use the methods provided by responseBody to get the parameters you need
```
这是一个用于阿里云提供的OCR通用印刷文字识别(GPU)的简化版SDK，你可以快捷的使用该SDK进行开发。
***
使用方法：
```java
ImageToOCR imageToOCR = new ImageToOCR();
ResponseBody responseBody = imageToOCR.getOcrResult("image file path");
//然后使用responseBody提供的get方法获取你需要的参数即可
```
 

SDK功能：
1. 提供Json数据转换为Java对象功能
2. 提供正确的aliyun OCR SDK识别功能
3. 简便的使用方式，传入图片相对或绝对路径即可(需有读取该图片文件的权限)