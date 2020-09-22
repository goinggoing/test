package file.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import file.dao.face.FileDao;
import file.dto.Filetest;
import file.service.face.FileService;

@Service
public class FileServiceImpl implements FileService {

	private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

	@Autowired ServletContext context;
	@Autowired FileDao fileDao;
	
	@Override
	public void filesave(String title, MultipartFile file) {
		logger.info(context.getRealPath("TEST"));
		
		//파일이 저장될 경로
		String storedPath = context.getRealPath("upload");
		
		//UUID
		String uid = UUID.randomUUID().toString().split("-")[4];
		
		//저장될 파일의 이름 (원본명 + UUID)
		String filename = file.getOriginalFilename()+"_"+uid;
		
		//저장될 파일 객체
		File dest = new File(storedPath, filename);
		
		try {
			file.transferTo(dest); //실제 파일 저장
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		// DB에 저장 (업로드된 파일의 정보를 기록)
		Filetest filetest = new Filetest();
		filetest.setTitle(title);
		filetest.setOriginName(file.getOriginalFilename());
		filetest.setStoredName(filename);
		
		fileDao.insertFile(filetest);
		
	}
	
	@Override
	public List<Filetest> list() {
		return fileDao.selectAll();
	}
	
	@Override
	public Filetest getFile(int fileno) {
		return fileDao.selectByFileno(fileno);
	}
}











