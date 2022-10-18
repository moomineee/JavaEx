package com.dbexercise;

import java.util.Map;

// Environment Variable에 값 전체 확인하기
// DB_USER, HOST, PASSWORD 등의 정보가 잘 넘어왔는지 확인하는 방법.

public class SystemEnv {
    public static void main(String[] args) {

        Map<String, String> env = System.getenv();

        for (String key : env.keySet()) {
            System.out.printf("key:%s vlaue:%s\n", key, env.get(key));
        }
    }
}
