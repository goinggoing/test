package web.service.face;

import web.dto.Member;

public interface MemberService {
	
	/*
	 * 회원가입 정보
	 * 
	 * @param Member - 요청 정보 객체
	 * @return boolean - true(가입성공), false(가입 실패)
	 * 
	 */
	public boolean join(Member writer);

	/*
	 * 로그인 정보
	 * 
	 * @param writer - 로그인 입력 정보
	 * @return boolean - true(로그인 성공), false(로그인 실패)
	 */
	public boolean login(Member writer);
	
	/*
	 * id로 nick 정보 가져오기
	 * 
	 * @param writer - id를 가진 객체
	 * @return String - nick
	 */
	public String getUsernick(Member writer);

}
