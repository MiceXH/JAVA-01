package io.github.micexh.gateway.gateway01;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpDemo {
    // 缓存客户端实例
    public static OkHttpClient client = new OkHttpClient();

    // GET 调用
    public static String getAsString(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }

        //help gc
        //OkHttpDemo.client = null;
    }


    public static void main(String[] args) throws Exception {

//        String url = "https://github.com/MiceXH/JAVA-01/blob/main/README.md";
        String url = "http://localhost:8801";
        String text = OkHttpDemo.getAsString(url);

        System.out.println("url: " + url + " ; response: \n" + text);

        // 清理资源
        OkHttpDemo.client = null;
    }
}