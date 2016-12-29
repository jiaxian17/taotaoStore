package com.taotao.commom.pojo;

public class PictureResult {
    
    //error 0表示成功 1表示失败
    private int error;
    //url表示图片上传地址
    private String url;
    //message表示错误信息
    private String message;
    public int getError() {
        return error;
    }
    public void setError(int error) {
        this.error = error;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
