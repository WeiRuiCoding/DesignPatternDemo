package singlepattern.bean;

/** 
 * @ClassName: Singleton 
 * @Description: 饿汉式 
 * @author HongDa
 * @date 2018年9月13日 上午11:47:57 
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	public void println(){
		System.out.println("我是饿汉式单例类");
	}
}
