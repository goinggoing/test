package java09_innerClass.quiz;

public class Taxi implements Fare {

	@Override
	public void calc(int distance) {
		System.out.println(distance+"m를 운행했을 때 요금은 " +
				distance*FEE*2 + "원 입니다");
		
	}
	
}
