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
public class FileController3 {

	private static final Logger logger = LoggerFactory.getLogger(FileController3.class);
	
	@Autowired FileService fileService;
	
	@RequestMapping(value="/file/fileuploadsample", method=RequestMethod.GET)
	public void fileupForm() { }


	
}











