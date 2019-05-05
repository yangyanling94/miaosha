package com.miaoshaproject.response;

public class CommonReturnType {

    //表明对应请求的返回处理结果 “success” 或 “fail”
    private String status;
    //若status=success，返回json数据
    //若status=fail，使用通用错误码格式
    private Object data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object data) {
        return CommonReturnType.create(data, "success");
    }

    public static CommonReturnType create(Object data, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setData(data);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
