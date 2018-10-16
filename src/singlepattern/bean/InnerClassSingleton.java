package singlepattern.bean;

/** 
 * @ClassName: InnerClassSingleton 
 * @Description: 静态内部类方式实现单例
 * @author HongDa
 * @date 2018年9月12日 下午4:40:42 
 */
public class InnerClassSingleton{
	
	private InnerClassSingleton(){}
	
	private static class Inner{
		private static final InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance(){
		return Inner.instance;
	}
	
	public void println(){
		System.out.println("我是基于静态内部类实现的单例类");
	}
}
