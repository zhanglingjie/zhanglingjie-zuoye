package model;
public abstract class Duck {
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;

   public void swim(){
	System.out.println("�һ���Ӿ");  
   }
   public void display(){
		System.out.println("�һ�display");  
	   }
   
   public void performQuack() {
      try {
		quackBehavior.quack();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void performFly() {
	   try {
		flyBehavior.fiy();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   }
}


