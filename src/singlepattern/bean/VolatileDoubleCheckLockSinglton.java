package singlepattern.bean;

/** 
 * @ClassName: VolatileDoubleCheckLockSinglton 
 * @Description: 基于volatile的双检锁模式 
 * @author HongDa
 * @date 2018年9月12日 下午4:24:51 
 */

public class VolatileDoubleCheckLockSinglton{
	
	private static volatile VolatileDoubleCheckLockSinglton instance;
	
	private VolatileDoubleCheckLockSinglton(){}
	
	public static VolatileDoubleCheckLockSinglton getInstance(){
		
		if(instance == null){
			synchronized (VolatileDoubleCheckLockSinglton.class) {
				if(instance == null){
					instance = new VolatileDoubleCheckLockSinglton();
				}
			}
		}
		
		return instance;
	}
	
	public void println(){
		System.out.println("我是基于volatile的双检锁模式单例类");
	}
}
