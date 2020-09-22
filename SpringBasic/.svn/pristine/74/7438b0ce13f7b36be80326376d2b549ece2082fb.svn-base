package web.dao.face;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import web.dto.Info;


public interface SchoolDao {
	
	/*
	 * @return List - 게시글 목록
	 */
	public List<Info> selectList(Map<String, String> map);
	
	/*
	 * 학교코드 중복 체크
	 * 
	 * @return 1 - 중복, 0 - 중복x
	 * 
	 */
	public int selectSchCdCntCheck(String schCd);
	
	/*
	 * 학교 정보 등록
	 * 
	 * @param - info
	 * 
	 */
	public void insert(Info info);
	
	/**
	 * 리스트에서 게시정보 삭제하기
	 * 
	 * @param names - 삭제한 학교코드 목록들 문자열
	 */
	public void deleteList(String names);
	
	/*
	 * 출력할 엑셀 리스트
	 * 
	 */
	public List<Info> excelList(String names);
	
	/*
	 * 통계 학교별 유저 수
	 */
	public List<Map> selectSchUserCnt(Map<String, String> map);
	

}
