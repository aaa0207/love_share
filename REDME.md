## love_share集成




* 01-申请appkey


* 02-love_share初始化

LoveShareClient.init(this, "123", new HttpUtils.StringCallback() {
            @Override
            public void onSuccess(String result) {
                Log.e("xxx", result);
            }

            @Override
            public void onFaileure(int code, Exception e) {
                Log.e("xxx", code + e.toString());
            }
        });