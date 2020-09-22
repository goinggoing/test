package web.dao.face;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import web.dto.Test;

public interface TestDao {
	
	
//	public void selectYear(String year);

//	public void selectDw(String dw);

	/**
	 * 초기값 셋팅 - 2018, d
	 * @return
	 */
//	public List selectDW();

	/**
	 * 선택한 일/요일에 리스트 보여주기
	 * 
	 * @param map
	 * @return List
	 */
	public List<Map> selectDW(Map map);
	
	/*
	 * 년도, 일/요일 db에 insert
	 */
	public void insert(HashMap<String, Object> mapmap);
	
	/*
	 * 선택한 년도, 맵으로 일/요일 그리드에 가져오기
	 */
	public List<Test> selectTest(HashMap<String, Object> map);
	


	
	
}
