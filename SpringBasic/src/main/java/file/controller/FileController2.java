package file.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import file.dto.Filetest;
import file.service.face.FileService;

@Controller
public class FileController2 {

	private static final Logger logger = LoggerFactory.getLogger(FileController2.class);
	
	@Autowired FileService fileService;
	
	@RequestMapping(value="/file/fileup2", method=RequestMethod.GET)
	public void fileupForm() { }

	@RequestMapping(value="/file/fileup2", method=RequestMethod.POST)
	public ModelAndView fileup(ModelAndView mav,
			@RequestParam(value="title") String title,
			@RequestParam(value="file") MultipartFile fileupload
			) {
		logger.info("파일업로드 처리");
		
		logger.info("title : " + title);
		logger.info("file : " + fileupload);
		logger.info("file : " + fileupload.getOriginalFilename());
//		logger.info(context.getRealPath("upload"));
		
		fileService.filesave(title, fileupload);
		
		mav.setViewName("jsonView");
		return mav;
		
	}

	@RequestMapping(value="/file/list2")
	public void filelist(Model model) {
		
		List<Filetest> list = fileService.list();
		
		model.addAttribute("list", list);
		
	}
	
	@RequestMapping(value="/file/download2")
	public ModelAndView download(
			int fileno, //파일번호 파라미터
			ModelAndView mav
			) {
		
		logger.info("파일번호 : " + fileno);
		
		//파일번호에 해당하는 파일 정보 가져오기
		Filetest file = fileService.getFile(fileno);
		
		logger.info("조회된 파일 : " + file);
		
		//파일정보를 MODEL 값으로 지정하기
		mav.addObject("downFile", file);
		
		//viewName 지정하기
		mav.setViewName("down");
		
		return mav;
	}
	
}











