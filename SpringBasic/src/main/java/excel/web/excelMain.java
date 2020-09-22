package excel.web;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import excel.service.ExcelService;
import excel.vo.Fruit;


//엑셀poi 다운로드 참조 
//https://myjamong.tistory.com/111
@Controller
public class excelMain {

	@Autowired private ExcelService service;
	private static final Logger logger = LoggerFactory.getLogger(excelMain.class);
	
	//메인페이지
	@RequestMapping(value = "/excel/excelMainPage", method=RequestMethod.GET)
	public void excelMainPage() {
		
	}
	
	
	@RequestMapping(value = "/excel/downloadExcelFile", method = RequestMethod.POST)
    public String downloadExcelFile(Model model) {
		
        String[] names = {"자몽", "애플망고", "멜론", "오렌지"};
        long[] prices = {5000, 10000, 7000, 6000};
        int[] quantities = {50,50, 40, 40};
        List<Fruit>	list = service.makeFruitList(names, prices, quantities);
        
        SXSSFWorkbook workbook = service.excelFileDownloadProcess(list);
		
        model.addAttribute("locale", Locale.KOREA);
        model.addAttribute("workbook", workbook);
        model.addAttribute("workbookName", "과일표");
        
        return "excelDownloadView";
    }
	
    @RequestMapping(value = "/excel/uploadExcelFile", method = RequestMethod.POST)
    public String uploadExcelFile(MultipartHttpServletRequest request, Model model) {
        MultipartFile file = null;
        Iterator<String> iterator = request.getFileNames();
        logger.info("iterator: " + iterator);
        if(iterator.hasNext()) {
            file = request.getFile(iterator.next());
            logger.info("file: " + file);
        }
        List<Fruit> list = service.uploadExcelFile(file);
        logger.info("list: " + list);
        
        model.addAttribute("list", list);
        return "jsonView";
    }


	
}
