package web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import web.dto.AttchfileDts;
import web.dto.AttchfileMst;
import web.dto.RotSteMng;
import web.service.face.RotSteService;

@Controller
public class RotSteController {

	private static final Logger logger = LoggerFactory.getLogger(RotSteController.class);
	
	@Autowired private RotSteService rotSteService;
	
	//메인페이지
	@RequestMapping(value = "/rot/ste", method = RequestMethod.GET)
	public void rotSte() {
		logger.info("부패신고 페이지 접속 성공");
	}
	
	
	//리스트페이지
	@RequestMapping(value = "/rot/rotStelist", method = RequestMethod.GET)
	public ModelAndView rotSteList(ModelAndView mav
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType
			,@RequestParam(value = "startDate") String startDate
			,@RequestParam(value = "endDate") String endDate) {
		
		logger.info("부패신고 리스트 성공");
		
		//조회조건으로 리스트 가져오기
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		
		//게시글 목록
		List<RotSteMng> list = rotSteService.list(map);
		logger.info("list: " + list);
		mav.addObject("list", list);
		mav.setViewName("jsonView");
		
		return mav;
	}

	
// 파일업로드 참조
//	https://ktko.tistory.com/entry/Spring-%EB%8B%A8%EC%9D%BC%ED%8C%8C%EC%9D%BC-%EB%8B%A4%EC%A4%91%ED%8C%8C%EC%9D%BC-%EC%97%85%EB%A1%9C%EB%93%9C%ED%95%98%EA%B8%B0
	//부패신고 저장
	@RequestMapping(value = "/rot/rotSteSave", method = RequestMethod.POST)
	public ModelAndView rotSteSave(ModelAndView mav
			, RotSteMng rotSte
			, AttchfileMst mst
			, AttchfileDts dts
			, MultipartHttpServletRequest mtfRequest
			,@RequestParam(value = "keyword") String keyword
			,@RequestParam(value = "searchType") String searchType
			,@RequestParam(value = "startDate") String startDate
			,@RequestParam(value = "endDate") String endDate
			) {
		logger.warn("save 저장 로직 접속 성공");

		List<MultipartFile> fileList = mtfRequest.getFiles("file");
		
		//마스터 파일 
		int fileSeq = rotSteService.setAttchfileMSt(mst);
		
		dts.setFileSeq(fileSeq);
		
		rotSte.setFileSeq(fileSeq);
		
		rotSteService.rotSteSave(rotSte);
		System.err.println(dts);
		//세부 파일
		int i=0;
		String[] filesizes = dts.getFileSize().split(",");
		for (MultipartFile fileupload : fileList) {
			
			dts.setFileSize(filesizes[i++]);
			rotSteService.setAttchfileDts(dts, fileupload);
		}
		
		//조회조건으로 리스트 가져오기
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		
		//게시글 목록
		List<RotSteMng> list = rotSteService.list(map);
		logger.info("list: " + list);
		mav.addObject("list", list);
		mav.setViewName("jsonView");
		
		return mav;
	}
	
	
	//리스트 삭제 처리
	@RequestMapping(value="/rot/listDelete", method=RequestMethod.POST)
	public ModelAndView deleteList(ModelAndView mav
								,@RequestParam(value = "fileSeq") String fileSeq
								,@RequestParam(value = "keyword") String keyword
								,@RequestParam(value = "searchType") String searchType
								,@RequestParam(value = "startDate") String startDate
								,@RequestParam(value = "endDate") String endDate) {
		
		logger.info("삭제 메소드 접속" + fileSeq);
		if(!"".equals(fileSeq) && fileSeq != null) {
			rotSteService.listDelete(fileSeq);
		}
			
		//조회조건으로 리스트 가져오기
		Map<String, String> map = new HashMap<String, String>();
		map.put("keyword", keyword);
		map.put("searchType", searchType);
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		
		//게시글 목록
		List<RotSteMng> list = rotSteService.list(map);
		logger.info("list: " + list);
		mav.addObject("list", list);
		mav.setViewName("jsonView");
    	
		return mav;	
	}
	
	
	@RequestMapping(value = "/rot/fileView")
	public ModelAndView fileView(ModelAndView mav, String fileSeq) {

		if(!"".equals(fileSeq) && fileSeq != null) {
			List<AttchfileDts> list = rotSteService.fileViewList(fileSeq);

			System.err.println("fileView 컨트롤러 접속(list):  " + list);

			mav.addObject("fileList", list);

			mav.setViewName("jsonView");
		}

		return mav;
	}
	
	
	@RequestMapping(value = "/rot/fileDownLoad")
	public ModelAndView fileDownLoad(ModelAndView mav, int seq) {
		System.err.println("fileDownLoad 접속 성공 -- " + seq);
		
		//파일 번호에 해당하는 파일 정보 가져오기
		AttchfileDts file = rotSteService.getFile(seq);
			
		//파일정보를 MODEL 값으로 지정하기
		mav.addObject("downFile2", file);

		//viewName 지정하기
		mav.setViewName("down2");
		
		return mav;
	}
		
}
