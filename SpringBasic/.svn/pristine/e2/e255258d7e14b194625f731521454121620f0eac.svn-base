package web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.dao.face.SchoolDao;
import web.dto.Info;
import web.service.face.SchoolService;

@Controller
public class SchoolController {
	
	private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);
	
	@Autowired private SchoolService schoolService;
	@Autowired private SchoolDao schoolDao;
	
	//메인 페이지
	@RequestMapping(value = "/school/schInfoPage")
	public void schInfoPage() {
		logger.info("학교 관리 페이지 접속");
	}
	
	//조회 버튼 클릭시 ajax에서 request
	@RequestMapping(value="/school/list")
	public ModelAndView list(ModelAndView mav
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType) {
		
		//조회 조건으로 리스트 가져오기
		search(mav, keyword, searchType);
		
		//조회조건으로 통계 가져오기
		statistics(mav, keyword, searchType);

		mav.setViewName("jsonView");
		
		return mav;
		
	}
	
	//저장 버튼 클릭시 학교코드 중복 검사 및 submit
	@RequestMapping(value = "/school/infoSave", method = RequestMethod.POST)
	public ModelAndView save(ModelAndView mav
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType
			, Info info) {
		
		int check = schoolService.infoCheck(info.getSchCd());
		
		//학교 코드 데이터 중복 아님
		if(check == 0) {
			// 1. 학교 입력 정보 저장
			schoolDao.insert(info);
			
			// 2. 조회조건으로 리스트 가져오기
			search(mav, keyword, searchType);
					
			// 3. 조회조건으로 통계 가져오기
			statistics(mav, keyword, searchType);
			
		}
		
		mav.addObject("check", check);
		mav.setViewName("jsonView");
		
		return mav;
		
	}
	
	//리스트 삭제 처리
	@RequestMapping(value="/school/listDelete", method=RequestMethod.POST)
	public ModelAndView deleteList(ModelAndView mav
								,@RequestParam() String names
								,@RequestParam(value = "keyword") String keyword
								,@RequestParam(value = "searchType") String searchType) {
		
		if(!"".equals(names) && names != null) {
			schoolService.listDelete(names);
		}
		
    	//조회 조건으로 리스트 가져오기
		search(mav, keyword, searchType);
		
		//조회조건으로 통계 가져오기
		statistics(mav, keyword, searchType);
    	
    	mav.setViewName("jsonView");
    	
		return mav;
		
	}
	
	//	https://myjamong.tistory.com/111 참조
	@RequestMapping(value = "/school/downloadExcelFile", method = RequestMethod.POST)
    public String downloadExcelFile(Model model
    								,String keyword
    								,String searchType
    								,@RequestParam() String names) {
		
        List<Info> excelList = schoolService.list(names);
        
        SXSSFWorkbook workbook = schoolService.excelFileDownloadProcess(excelList);
		
        model.addAttribute("locale", Locale.KOREA);
        model.addAttribute("workbook", workbook);
        model.addAttribute("workbookName", "학교정보");
        
        return "excelDownloadView";
    }
	
	//검색조건 조회하여 리스트 가져오기 메소드
	public void search(ModelAndView mav
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		
		//게시글 목록
		List<Info> list = schoolService.list(map);
		logger.info("list: " + list);
		mav.addObject("list", list);
	}
	
	//검색조건으로 조회하여 통계 가져오기 메소드
	public void statistics(ModelAndView mav
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		
		List<Map> cnt = schoolService.userCnt(map);
		mav.addObject("cnt", cnt);
		
	}
	
	
}
