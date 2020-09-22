package web.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import web.dao.face.RotSteDao;
import web.dto.AttchfileDts;
import web.dto.AttchfileMst;
import web.dto.RotSteMng;
import web.service.face.RotSteService;

@Service
public class RotSteServiceImpl implements RotSteService {
	
	@Autowired RotSteDao rotSteDao;
	@Autowired ServletContext context;
	
	//게시글 목록
	@Override
	public List<RotSteMng> list(Map<String, String> map) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		System.out.println(map);
		return rotSteDao.selectList(map);
	}
	
	//신고폼 저장
	@Override
	public void rotSteSave(RotSteMng rotSte) {
		// TODO Auto-generated method stub
		rotSteDao.insertRotSte(rotSte);
	}
	
	//리스트 삭제
	@Override
	public void listDelete(String fileSeq) {
		// TODO Auto-generated method stub
		rotSteDao.deleteList(fileSeq);
		rotSteDao.deleteFileMst(fileSeq);
		rotSteDao.deleteFileDts(fileSeq);
	}
	
	//마스터 파일 정보 저장
	@Override
	public int setAttchfileMSt(AttchfileMst mst) {
		// TODO Auto-generated method stub
		
		int fileSeq = rotSteDao.getFileSeq();	
		
		mst.setFileSeq(fileSeq);
		rotSteDao.insertFileMst(mst);
		
		return fileSeq;
	}
	
	//디테일 파일 정보 저장
	@Override
	public void setAttchfileDts(AttchfileDts dts, MultipartFile fileupload) {
		// TODO Auto-generated method stub
		
		int fileSeq = dts.getFileSeq();		
		dts.setFileSeq(fileSeq);
		
		//파일이 저장될 경로
		String storedPath = context.getRealPath("upload");

		//UUID
		String uid = UUID.randomUUID().toString().split("-")[4];

		//저장될 파일의 이름 (원본명 + UUID)
		String filename = fileupload.getOriginalFilename()+"_"+uid;

		//저장될 파일 객체
		File dest = new File(storedPath, filename);

		try {
			fileupload.transferTo(dest); //실제 파일 저장
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		dts.setOgnFileNm(fileupload.getOriginalFilename());
		dts.setSaveFileNm(filename);
		dts.setSavePath(storedPath);
		rotSteDao.insertFileDts(dts);
	}
	
	//선택한 게시글 파일목록 조회
	@Override
	public List<AttchfileDts> fileViewList(String fileSeq) {
		// TODO Auto-generated method stub
		return rotSteDao.selectFileList(fileSeq);
	}
	
	//파일정보 조회
	@Override
	public AttchfileDts getFile(int seq) {
		// TODO Auto-generated method stub
		return rotSteDao.selectFile(seq);
	}

}
