package Stack_lab;

import java.util.Scanner;

public class stack1  {

	
	int [] arr;
	int top;
	int capacity;
	public stack1(int size){
		
		arr=new int[size];
		capacity=size;
		top=-1;	
	}
	
	 void push(int item) {
		if(top==capacity-1) {
			throw new Stackexaption("Stack OverFlow...!");

		}
		else {
			top=+1;
			arr[top]=item;
			System.out.println("Push item: "+item);
		}
		
	}
	void pop() {
		if(top==-1) {
			throw new Stackexaption("Stack UnderFlow...!");
		}else {
			
			int i = arr[top--];
			System.out.println("Pop item: "+i);
		}
		
	
	}
	 void peek()
	 {
		if(top==-1) {
			throw new Stackexaption("Stack is empty");
		} 
		else {
			System.out.print("Peek Stack top:"+arr[top]);
		}
	 }
	 boolean isEmpty() 
	 { 
		 return top == -1; 
	 }
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Wich size of Stack:");
		int size=sc.nextInt();
		stack1 s=new stack1(size);
		
		do {
			System.out.println("*** Select Option: ****"
					          +"\n 1.Push"
					          +"\n 2.Pop"
					          +"\n 3.peek"
					          +"\n 4.isEmpty");
			int key=sc.nextInt();
			
			switch (key) {
			case 1: {
				System.out.println("Enter Push item:");
				int item=sc.nextInt();
				s.push(item);
				break;
			}
			case 2: {
				s.pop();
				break;
			}
			case 3: {
				s.peek();
				break;
			}
			case 4: {
				System.out.println("Stack is:"+s.isEmpty());
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}while(true);
		
	}

}
