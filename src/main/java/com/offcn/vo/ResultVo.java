package com.offcn.vo;

import lombok.Data;

/**
 * @program: springMVC
 * @description:
 * @author: 刘宇航
 * @create: 2020-05-16 15:06
 **/
@Data
public class ResultVo {

    public ResultVo(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ResultVo(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public ResultVo(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public ResultVo(String msg) {
        this.msg = msg;
    }

    /**
     * 状态码
     */
    private Integer status;
    /**
     * 结果信息
     */
    private String msg;
    /**
     * 数据信息
     */
    private Object data;

    public static ResultVo success(Object data, String msg) {
        return new ResultVo(200, msg, data);
    }

    public static ResultVo error(String msg) {
        return new ResultVo(400, msg);
    }
}
