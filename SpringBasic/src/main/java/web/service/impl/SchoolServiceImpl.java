package web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.media.jfxmedia.logging.Logger;

import web.dao.face.SchoolDao;
import web.dto.Info;
import web.service.face.SchoolService;


@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired SchoolDao schoolDao;
	
	//게시글 목록
	@Override
	public List<Info> list(Map<String, String> map) {
		// TODO Auto-generated method stub
		return schoolDao.selectList(map);
	}
	
	//학교 정보 저장시 중복 체크
	@Override
	public int infoCheck(String schCd) {
		// TODO Auto-generated method stub
		return schoolDao.selectSchCdCntCheck(schCd);
	}
	
	//리스트 삭제
	@Override
	public void listDelete(String names) {
		// TODO Auto-generated method stub
		schoolDao.deleteList(names);
		
	}
	
	//엑셀 리스트
	@Override
	public List<Info> list(String names) {
		// TODO Auto-generated method stub
		return schoolDao.excelList(names);
	}
	
	 /**
     * 리스트를 간단한 엑셀 워크북 객체로 생성
     * @param list
     * @return 생성된 워크북
     */
    public SXSSFWorkbook makeSimpleInfoExcelWorkbook(List<Info> excelList) {
        SXSSFWorkbook workbook = new SXSSFWorkbook();
        
        // 시트 생성
        SXSSFSheet sheet = workbook.createSheet("학교정보");
        
        //시트 열 너비 설정
        sheet.setColumnWidth(0, 4600);
        sheet.setColumnWidth(1, 3600);
        sheet.setColumnWidth(2, 4600);
        sheet.setColumnWidth(3, 4600);
        sheet.setColumnWidth(4, 4600);
        sheet.setColumnWidth(5, 4600);
        sheet.setColumnWidth(6, 1600);
        
        // 헤더 행 생
        Row headerRow = sheet.createRow(0);
        // 해당 행의 첫번째 열 셀 생성
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("학교코드");
        // 해당 행의 두번째 열 셀 생성
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("구분");
        // 해당 행의 세번째 열 셀 생성
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("학교명");
        // 해당 행의 네번째 열 셀 생성
        headerCell = headerRow.createCell(3);
        headerCell.setCellValue("연락처");
        // 해당 행의 다섯번째 열 셀 생성
        headerCell = headerRow.createCell(4);
        headerCell.setCellValue("우편번호");
        // 해당 행의 여섯번째 열 셀 생성
        headerCell = headerRow.createCell(5);
        headerCell.setCellValue("주소");
        // 해당 행의 일곤번째 열 셀 생성
        headerCell = headerRow.createCell(6);
        headerCell.setCellValue("비고");
        
        // 과일표 내용 행 및 셀 생성
        Row bodyRow = null;
        Cell bodyCell = null;
        for(int i=0; i<excelList.size(); i++) {
            Info Info = excelList.get(i);
            
            // 행 생성
            bodyRow = sheet.createRow(i+1);

            // 데이터 학교 코드 표시
            bodyCell = bodyRow.createCell(0);
            bodyCell.setCellValue(Info.getSchCd());
            
            // 데이터 구분 표시
            bodyCell = bodyRow.createCell(1);
            bodyCell.setCellValue(Info.getSchDiv());
            
            // 데이터 학교명 표시
            bodyCell = bodyRow.createCell(2);
            bodyCell.setCellValue(Info.getSchNm());
            // 데이터 연락처 표시
            bodyCell = bodyRow.createCell(3);
            bodyCell.setCellValue(Info.getTelNo());
            // 데이터 우편번호 표시
            bodyCell = bodyRow.createCell(4);
            bodyCell.setCellValue(Info.getZipno());
            // 데이터 주소 표시
            bodyCell = bodyRow.createCell(5);
            bodyCell.setCellValue(Info.getAddr());
            // 데이터 비고 표시
            bodyCell = bodyRow.createCell(6);
            bodyCell.setCellValue(Info.getRemk());
        }
        
        return workbook;
    }

    /**
     * 생성한 엑셀 워크북을 컨트롤레에서 받게해줄 메소
     * @param list
     * @return
     */
	@Override
	public SXSSFWorkbook excelFileDownloadProcess(List<Info> excelList) {
		// TODO Auto-generated method stub
		return this.makeSimpleInfoExcelWorkbook(excelList);
	}
	
	//사용자 수
	@Override
	public List<Map> userCnt(Map<String, String> map) {
		
		return schoolDao.selectSchUserCnt(map);
	}







}
