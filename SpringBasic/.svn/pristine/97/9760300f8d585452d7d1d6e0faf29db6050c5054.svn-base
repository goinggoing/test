package jqGrid.controller;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import json.User;



public class GsonExample01 {
	 
    public static void main(String[] args) {
 
        Gson gson = new Gson();
 
        User user = setUser();
 
        try {
 
            // 객체를 JSON 타입의 String으로 변환
            String jsonInString01 = gson.toJson(user);
            System.out.println(jsonInString01);
 
        } catch (Exception e) {
            e.getMessage();
        }
    }
 
    public static User setUser() {
 
        User user = new User();
        user.setName("JSON");
        user.setAge(10);
 
        List<String> list = new ArrayList<String>();
        list.add("JSON은 자바스크립트를 확장하여 만들어졌습니다.");
        list.add("JSON은 자바스크립트 객체 표기법을 따릅니다.");
        list.add("JSON은 사람과 기계가 모두 읽기 편하도록 고안되었습니다.");
        list.add("JSON은 프로그래밍 언어와 운영체제에 독립적입니다.");
        user.setMessages(list);
 
        return user;
    }
}
