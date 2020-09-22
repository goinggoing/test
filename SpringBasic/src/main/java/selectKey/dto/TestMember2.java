package selectKey.dto;

public class TestMember2 {

	private int userNo;
	private String userId;
	private String userPw;
	
	@Override
	public String toString() {
		return "TestMember2 [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + "]";
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
}
