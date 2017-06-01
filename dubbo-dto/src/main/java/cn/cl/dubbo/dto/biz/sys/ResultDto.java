package cn.cl.dubbo.dto.biz.sys;


import java.io.Serializable;

/**
 * 响应结果
 * Created by songxiuju on 2016/8/12 16:22
 */
public class ResultDto<T> implements Serializable {


    private static final long serialVersionUID = -1L;
    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息描述
     */
    private String msg;

    /**
     * 返回数据集
     */
    private T data;

    /**
     * 添加默认构造器用于JSON反序列化时用到;
     */
    public ResultDto(){};

    public ResultDto(Integer code) {
        this(code, "", null);
    }

    public ResultDto(Integer code, T data) {
        this(code, "", data);
    }

    public ResultDto(Integer code, String msg) {
        this(code, msg, null);
    }

    public ResultDto(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
