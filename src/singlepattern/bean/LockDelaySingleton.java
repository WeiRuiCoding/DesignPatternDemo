package singlepattern.bean;

/** 
 * @ClassName: LockDelaySingleton 
 * @Description:懒汉式-加锁版
 * @author HongDa
 * @date 2018年9月12日 下午4:10:09 
 */
public class LockDelaySingleton{
	
	private static LockDelaySingleton instance;
	
	private LockDelaySingleton(){}
	
	public static synchronized LockDelaySingleton getInstance(){
		
		if(instance == null){
			instance = new LockDelaySingleton();
		}
		
		return instance;
	}
	
	public void println(){
		System.out.println("我是加锁版懒汉式单例类");
	}
}
