package test;

import model.Duck;
import model.RedheadDuck;
import model.RubberDuck;

public class Ducktestdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ӿڣ���Ӳ�ͬѼ��ʱֻ��Ҫ���Ľӿ�ʵ�ּ��ɡ�
		Duck duck1=new RedheadDuck();
		duck1.performFly();
		duck1.display();
		Duck duck2=new RubberDuck();
		duck2.performFly();
		duck2.display();
	}
	
	
}
