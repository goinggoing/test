package java11_collection;

import java.util.Stack;

public class Collection_09_Stack {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
	
		System.out.println("------------------");
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
		
		System.out.println("------------------");
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println( stack.empty() );
		
		System.out.println("----------------");
		stack.push("Grape");
		stack.push("Orange");
		stack.push("Peach");
		
		while( !stack.empty() ) {
			System.out.println( stack.pop() );
		}
	}
}













