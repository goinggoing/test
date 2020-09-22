package web.dto;

import java.util.Arrays;

public class CheckBoxTest {

	private String[] check;

	@Override
	public String toString() {
		return "CheckBoxTest [check=" + Arrays.toString(check) + "]";
	}

	public String[] getCheck() {
		return check;
	}

	public void setCheck(String[] check) {
		this.check = check;
	}
	
}
