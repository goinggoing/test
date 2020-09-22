package web.service.face;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import web.dto.Info;

public interface SchoolService {
	
	/*
	 * 게시글 목록
	 * 
	 * @param - keyword, searchType
	 * @return List 
	 * 
	 */
	List<Info> list(Map<String, String> map);
	
	/*
	 * 학교 정보 저장시 중복 체크
	 * 
	 * @return - 1이면 중복
	 */
	public int infoCheck(String schCd);
	
	/*
	 * 게시판 리스트 삭제
	 * 
	 * @param names - 지울 학교코드를 문자열로 합친 것
	 */
	public void listDelete(String names);
	
	/*
	 * 엑셀 다운로드(리스트에서 선택한 대상)
	 * 
	 * @param - 리스트에서 선택한 대상
	 */
	public List<Info> list(String names);
	
	/*
	 * 엑셀 다운로드
	 * 
	 * @param - 학교 정보 
	 */
	public SXSSFWorkbook excelFileDownloadProcess(List<Info> excelList);
	
	/*
	 * 통계 학교별 유저수
	 */
	public List<Map> userCnt(Map<String, String> map);
	

	
	


	

	

}
