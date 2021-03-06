package java11_collection;

public class Person {
	private int no;
	private String name;
	private String hobby;

	public Person(int no, String name, String hobby) {
		setNo(no);
		setName(name);
		setHobby(hobby);
	}

	// Source 메뉴 부르기 단축키 : alt + shift + s

	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", hobby=" + hobby + "]";
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}













