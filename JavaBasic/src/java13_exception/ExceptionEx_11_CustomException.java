package java13_exception;

class User {
	private int age; //나이

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException {
		
		if( age < 0 || age > 150 ) {
			this.age = -1; //상태값, age == -1 이면 잘못된 입력 
		
			//예외객체 발생시키기
			throw new UserAgeException();
		}
		
		this.age = age;
	}
}

class UserAgeException extends Exception {
	//사용자의 나이가 0미만, 150초과일 때
	
	@Override
	public String getMessage() {
		return "나이는 0보다 작거나 150보다 클 수 없다";
	}
}

public class ExceptionEx_11_CustomException {
	public static void main(String[] args) {
		
		User user = new User();
		
		try {
			user.setAge(-5);
			
		} catch (UserAgeException e) {
			e.printStackTrace();
			
		}
		
		// ---------------------------------------------
		
		int age = user.getAge();
		
		if( age == -1 ) {
			System.out.println("입력한 나이가 비정상");
		} else {
			System.out.println("입력한 나이 : " + age);
		}
		
	}
}













