package model;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		// TODO Auto-generated constructor stub
	quackBehavior=new  Quack();
	flyBehavior=new  FlywithWings();
	}
	public void display(){
		System.out.println("�����Һ�ͷѼ��display��ʽ");			
	}	
}
