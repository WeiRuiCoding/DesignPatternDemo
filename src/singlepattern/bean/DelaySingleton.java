package singlepattern.bean;

/** 
 * @ClassName: DelaySingleton 
 * @Description: 懒汉式
 * @author HongDa
 * @date 2018年9月12日 下午4:03:39 
 */
public class DelaySingleton{
	
	private static DelaySingleton instance;
	
	private DelaySingleton(){}
	
	public static DelaySingleton getInstance(){
		
		if(instance == null){
			instance = new DelaySingleton();
		}
		
		return instance;
	}
	
	public void println(){
		System.out.println("我是懒汉式单例类");
	}
}