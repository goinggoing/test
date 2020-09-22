package selectKey.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import selectKey.dao.face.SelectKeyDao;
import selectKey.dto.TestMember;
import selectKey.dto.TestMember2;

@Controller
public class SelectKeyController {

	private static final Logger logger = LoggerFactory.getLogger(SelectKeyController.class);

	@Autowired SelectKeyDao selectKeyDao;
	
	@RequestMapping(value="/mybatis/selectKey", method=RequestMethod.GET)
	public void selectKeyForm() {}

	@RequestMapping(value="/mybatis/selectKey", method=RequestMethod.POST)
	public String selectKeyInsert(
			Model model,
			TestMember testMember) {
		
		logger.info("insert수행 전 : " + testMember.toString());
		
		selectKeyDao.insert(testMember);

		logger.info("insert수행 후 : " + testMember.toString());

		model.addAttribute("member", testMember);
		
		return "mybatis/insertResult";
	}

	
	@RequestMapping(value="/mybatis/list")
	public void memberList(Model model) {
		
		List<TestMember2> list = selectKeyDao.select();
		
		model.addAttribute("list", list);
		
	}
	
}












