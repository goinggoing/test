package web.service.face;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import web.dto.AttchfileDts;
import web.dto.AttchfileMst;
import web.dto.RotSteMng;

public interface RotSteService {
	
	/*
	 * 2020-08-20 지재용
	 * 
	 * 부패신고 목록
	 * 
	 * @param - keyword, searchType
	 * @return List 
	 * 
	 */
	List<RotSteMng> list(Map<String, String> map);
	
	/*
	 * 2020-08-20 지재용
	 * 
	 * 부패신고 작성 저장
	 * 
	 * @param - rotSte
	 * 
	 */
	public void rotSteSave(RotSteMng rotSte);
	
	/*
	 * 2020-08-24 지재용
	 * 
	 * 마스터 첨부파일  저장
	 * 
	 * @param - mst
	 * 
	 */
	public int setAttchfileMSt(AttchfileMst mst);
	
	/*
	 * 2020-08-24 지재용
	 * 
	 * 디테일 첨부 파일  저장
	 * 
	 * @param - dts, fileupload
	 * 
	 */
	public void setAttchfileDts(AttchfileDts dts, MultipartFile fileupload);
	
	/*
	 * 2020-08-20 지재용
	 * 
	 * 게시판 리스트 삭제
	 * 
	 * @param names - 지울 신고코드를 문자열로 합친 것
	 */
	public void listDelete(String fileSeq);

	/*
	 * 2020-08-25 지재용
	 * 
	 * 첨부 파일 리스트 얻기
	 * 
	 * @param fileSeq - 첨부파일을 조회할 파일 번호 객체(문자열로 받음)
	 * @return AttchfileDts - 게시글에 첨부된 파일 정보
	 */
	public List<AttchfileDts> fileViewList(String fileSeq);

	/*
	 * 2020-09-01 지재용
	 * 
	 * 다운로드 할 첨부파일 정보 가져오기
	 * 
	 * @param seq - 선택한 파일번호
	 * @return AttchfileDts - 디테일 파일 정보
	 */
	public AttchfileDts getFile(int seq);


}
