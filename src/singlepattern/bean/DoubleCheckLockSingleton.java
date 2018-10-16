package singlepattern.bean;

/** 
 * @ClassName: DoubleCheckLockSingleton 
 * @Description: 普通双检锁模式 
 * @author HongDa
 * @date 2018年9月12日 下午4:19:30 
 */
public class DoubleCheckLockSingleton{
	
	private static DoubleCheckLockSingleton instance;
	
	private DoubleCheckLockSingleton(){}
	
	public static DoubleCheckLockSingleton getInstance(){
		
		if(instance == null){
			synchronized (DoubleCheckLockSingleton.class) {
				if(instance == null){
					instance = new DoubleCheckLockSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public void println(){
		System.out.println("我是普通双检锁模式单例类");
	}
}
