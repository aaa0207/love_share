package com.love.share;

public class DataResp {

    private int code;
    private String message;
    private Context entity;


     public static class Context{
         private String context;

         public String getContext() {
             return context;
         }

         public void setContext(String context) {
             this.context = context;
         }
     }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Context getEntity() {
        return entity;
    }

    public void setEntity(Context entity) {
        this.entity = entity;
    }
}
