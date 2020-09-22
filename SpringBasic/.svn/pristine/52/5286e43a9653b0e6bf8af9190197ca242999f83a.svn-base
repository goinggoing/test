package jqGrid.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import interceptor.dto.Data;

//https://mine-it-record.tistory.com/283 jqGrid 참조
//https://tychejin.tistory.com/136 Gson 참조
@Controller
public class jqGridController {

	@RequestMapping(value="/jqGrid/jqGrid", method=RequestMethod.GET)
	public void jqGridList() {}
	
//	@RequestMapping(value="/jqGrid/jqGridProcess", method=RequestMethod.GET)
//	public ModelAndView jqGridListProcess(ModelAndView mav) {
//		
//		Gson gson = new Gson();
//		
//		//json 타입의 파일을 객체로 변환
//		try {
//			JsonReader jsonReader = new JsonReader(
//					new FileReader("D:/project_web/SpringBasic/src/main/java/json/data.json"));
//			
//			jqGridJson data = gson.fromJCson(jsonReader, jqGridJson.class);
//			
//			System.out.println(data.getCategoryName());
//			
//			System.out.println("data: " + data);
//			
//			mav.addObject("data", data);
//			mav.setViewName("jsonView");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		@RequestMapping(value="/jqGrid/jqGridProcess", method=RequestMethod.GET)
		public ModelAndView jqGridListProcess(ModelAndView mav) {

			List<Data> list = new ArrayList<Data>();

			Data data = new Data();
			
			data.setCategoryName("Beverages");
			data.setProductName("Steeleye Stout");
			data.setCountry("UK");
			data.setPrice("1008.0000");
			data.setQuantity(65);

			list.add(data);

//			Map gridData = new HashMap();
			
//			gridData.put("rows", list); // Grid data
//			gridData.put("page", 1); // Current page
//			gridData.put("records", 1);  // Total count
//			gridData.put("total", 10); // Total page
			 
//			Gson gson = new Gson();
//			String retVal = gson.toJson(gridData);

			mav.addObject("rows", list);
			mav.addObject("page", 1);
			mav.addObject("records", 1);
			mav.addObject("total", 10);
			mav.setViewName("jsonView");
			
			return mav;

		}
	
}
