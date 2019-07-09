package com.shylock.seckill.result;

/**
 * @Author: yk
 * @Date: 2019/7/9 16:44
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    /**
     * 成功时调用
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> error(CodeMsg msg) {
        return new Result<>(msg);
    }

    private Result(CodeMsg msg) {
        if (msg == null) {
            return;
        }
        this.code = msg.getCode();
        this.msg = msg.getMsg();
    }

    private Result(T data) {
        this(CodeMsg.SUCCESS);
        this.data = data;
    }

    private Result() {
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
