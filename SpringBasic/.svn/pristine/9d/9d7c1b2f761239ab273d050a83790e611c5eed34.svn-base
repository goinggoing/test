package login.dao.face;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import login.dto.Login;
import web.dto.User;

public interface LoginDao {

	/**
	 * 회원가입 정보 삽입
	 * 
	 * @param login - 회원가입 정보
	 */
	public void insert(Login login);
	
	/**
	 * 로그인 아이디, 패스워드 가 일치하는 사용자의 수 구하기
	 * 
	 * @param login - 로그인 아이디, 패스워드
	 * @return int - 일치하는 유저 수
	 */
	public int selectCnt(Login login);

	/**
	 * 주어진 id를 이용해 회원정보 조회
	 * 
	 * @param id - 조회 대상 id
	 * @return Login - 조회된 회원 정보
	 */
	public Login selectById(String id);
	
}











