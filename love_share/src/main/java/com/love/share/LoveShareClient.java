package com.love.share;

import android.content.Context;
import android.util.Log;

public class LoveShareClient {

    private final static String TAG = "LoveShareClient";
    private static Boolean isDebug = false;
    private static String appKey = "";

    public static void setDebugMode(boolean var0) {
        isDebug = var0;
    }

    /**
     * 初始化
     *
     * @param context  上下文
     * @param appkey   appkey
     * @param callback 回调方法
     */
    public static void init(Context context, String appkey, final HttpUtils.StringCallback callback) {
        logd(TAG, "action:init - sdkVersion:" + LoveShareConstants.SDK_VERSION_NAME);
        HttpUtils.doHttpReqeust("POST", LoveShareConstants.Base_URL + appkey, null, DataResp.class, new HttpUtils.ObjectCallback<DataResp>() {
            @Override
            public void onSuccess(DataResp dataResp) {
                if (dataResp.getCode() == 0) {
                    callback.onSuccess(dataResp.getEntity().getContext());
                } else {
                    callback.onFaileure(dataResp.getCode(), new Exception(dataResp.getMessage()));
                }
            }

            @Override
            public void onFaileure(int code, Exception e) {
                callback.onFaileure(code, e);
            }
        });
    }


    private static void logd(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

}
