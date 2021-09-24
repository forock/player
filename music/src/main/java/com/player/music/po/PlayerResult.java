package com.player.music.po;

import java.io.Serializable;

public class PlayerResult implements Serializable {
    private static final long serialVersionUID = 5438081233673212345L;

    private Integer code;

    private String message;

    private Object data;

    public PlayerResult() {
    }

    public PlayerResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static PlayerResult build(Integer code, String message){
        return new PlayerResult(code,message,null);
    }

    public static PlayerResult build(Integer code, String message, Object data){
        return new PlayerResult(code,message,data);
    }

    public static PlayerResult ok(){
        return new PlayerResult(200,"成功",null);
    }

    public static PlayerResult ok(Object data){
        return new PlayerResult(200,"成功",data);
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
