package model;

public class RubberDuck extends Duck {
	public RubberDuck() {
		// TODO Auto-generated constructor stub
	quackBehavior=new  Quack();
	flyBehavior=new  Flynoway();
	}
	public void display(){
		System.out.println("�����һ���Ѽ��display��ʽ");			
	}	
}
