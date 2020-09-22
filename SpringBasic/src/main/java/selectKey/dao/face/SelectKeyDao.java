package selectKey.dao.face;

import java.util.List;

import selectKey.dto.TestMember;
import selectKey.dto.TestMember2;

public interface SelectKeyDao {
	
	/**
	 * 회원정보 삽입
	 * 
	 * @param testMember - 회원정보 객체 
	 */
	public void insert(TestMember testMember);
	

	
	
	public List<TestMember2> select();
	
}














