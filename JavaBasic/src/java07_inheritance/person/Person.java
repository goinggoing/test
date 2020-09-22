package java07_inheritance.person;

import java07_inheritance.product.Product;

public class Person {
	private String name;
	private int money;
	
	private Product prod;
	
	
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	public void buy(Product p) {
		//전달인자로 받은 Product를 멤버필드에 저장하고
		prod = p;
		
		//물건가격만큼 money를 차감한다
		money -= p.getPrice();
		
		//진행상황을 출력한다
		System.out.println(
			name + "님이 " + p.getPrice() + "원을 "
			+ "지불하고 " + p.getModel() + " 구매함");
		System.out.println("[잔액] " + money);
		
//		ex)
//		Alice님이 500원을 지불하고 i5 구매함
//		[잔액] 0원
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	
}
















