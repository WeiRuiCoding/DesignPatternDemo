package test;

public class TestDemo {
	
	public static void main(String[] args){
	}
}

//饿汉式
class Singleton1{
	
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		return instance;
	}
}

//懒汉式
class Singleton2{
	
	private static Singleton2 instance;
	
	private Singleton2(){}
	
	public static Singleton2 getInstance(){
		
		if(instance == null){
			instance = new Singleton2();
		}
		
		return instance;
	}
}

//懒汉式加锁版
class Singleton3{
	
	private static Singleton3 instance;
	
	private Singleton3(){}
	
	public static synchronized Singleton3 getInstanxce(){
		
		if(instance == null){
			instance = new Singleton3();
		}
		
		return instance;
	}
}

//双检锁模式
class Singleton4{
	
	private static Singleton4 instance;
	
	private Singleton4(){}
	
	public static Singleton4 getInstance(){
		
		if(instance == null){
			synchronized (Singleton4.class) {
				if(instance == null)
					instance = new Singleton4();
			}
		}
		
		return instance;
	}
}

//基于volatile的双检锁模式
class Singleton5{
	
	private static volatile Singleton5 instance;
	
	private Singleton5(){}
	
	public static Singleton5 getInstance(){
		
		if(instance == null){
			synchronized (Singleton5.class) {
				if(instance == null)
					instance = new Singleton5();
			}
		}
		
		return instance;
	}
}

//静态内部类
class Singleton6{
	
	private Singleton6(){}
	
	private static class Inner{
		private static final Singleton6 instance = new Singleton6();
	}
	
	public static Singleton6 getInstance(){
		return Inner.instance;
	}
}

