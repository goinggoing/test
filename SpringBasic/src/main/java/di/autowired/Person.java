package di.autowired;

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
				"/src/main/java/di/autowired/di.xml");
		
		// Car 클래스 DI
		Car car = (Car) context.getBean("car");
		
		System.out.println( car.getInfo() );
	
	}
}











