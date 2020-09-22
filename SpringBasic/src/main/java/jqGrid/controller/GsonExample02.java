package jqGrid.controller;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import json.User;

public class GsonExample02 {
	 
    public static void main(String[] args) {
 
        Gson gson = new Gson();
 
        try {
 
            // JSON 타입의 파일을 객체로 변환
            JsonReader jsonReader = new JsonReader(new FileReader("D:\\project_web\\SpringBasic\\src\\main\\java\\json\\user.json"));
            User user01 = gson.fromJson(jsonReader, User.class);
            System.out.println("user01: " + user01);
 
            String jsonInString = "{\"name\":\"JSON\",\"age\":10,\"messages\":[\"JSON은 자바스크립트를 확장하여 만들어졌습니다.\",\"JSON은 자바스크립트 객체 표기법을 따릅니다.\",\"JSON은 사람과 기계가 모두 읽기 편하도록 고안되었습니다.\",\"JSON은 프로그래밍 언어와 운영체제에 독립적입니다.\"]}";
 
            // JSON 타입의 String을 객체로 변환
            User user02 = gson.fromJson(jsonInString, User.class);
            System.out.println("user02: " + user02);
 
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

