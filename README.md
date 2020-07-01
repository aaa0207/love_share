# 爱分享集成
[！[]（https://jitpack.io/v/aaa0207/love_share.svg）]（https://jitpack.io/#aaa0207/love_share）

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  dependencies {
	        implementation 'com.github.aaa0207:love_share:Tag'
	}
  
  
  
  
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
