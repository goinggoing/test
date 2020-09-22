package di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import di.tire.Tire;

public class Person {
	public static void main(String[] args) {

		//어플리케이션 컨텍스트 객체
		ApplicationContext context = null;
		
		// Spring Bean Configuration XML 파일에 등록된
		//스프링 빈 정보를 읽어서 어플리케이션 컨텍스트를 생성한다
		context = new FileSystemXmlApplicationContext(
				"/src/main/java/di/xml/di.xml");
		
		
		
		
		// Car 클래스 DI
		Car car = (Car) context.getBean("car");
		
		// tire 멤버필드 DI
		car.setTire( (Tire) context.getBean("sTire") );
		
		System.out.println( car.getInfo() );
		
		
		System.out.println("----------------");
		
		Car c1 = (Car) context.getBean("car");
		c1.setTire( (Tire) context.getBean("gTire") );
		
		Car c2 = (Car) context.getBean("car");
		c2.setTire( (Tire) context.getBean("sTire") );

		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		System.out.println("c1 info : " + c1.getInfo());
		System.out.println("c2 info : " + c2.getInfo());
	}
}











