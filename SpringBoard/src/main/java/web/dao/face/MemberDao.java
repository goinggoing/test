package web.dao.face;

import web.dto.Member;

public interface MemberDao {
	
	/*
	 * userid로 유저 조회
	 * 
	 * @param writer - 조회할 회원, userid 필수
	 * @return int - 존재하는 회원 1, 비존재0
	 */
	public int selectByUserid(Member writer);
	
	/*
	 * 회원 가입
	 * 
	 * @param member - 회원 가입 정보
	 */
	public void join(Member writer);
	
	/*
	 * 로그인 처리
	 * 
	 * @param writer - 로그인 정보
	 * @return int - 로그인 성공(1), 로그인 실패(0)
	 */
	public int login(Member writer);
	
	/*
	 * id로 닉네임 가져오기 
	 * 
	 * @param writer - id를 가진 객체
	 * @return String - nick
	 */
	public String getUsernick(Member writer);
	

}
