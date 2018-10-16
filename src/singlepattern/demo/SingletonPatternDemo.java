package singlepattern.demo;

import singlepattern.bean.DelaySingleton;
import singlepattern.bean.DoubleCheckLockSingleton;
import singlepattern.bean.InnerClassSingleton;
import singlepattern.bean.LockDelaySingleton;
import singlepattern.bean.Singleton;
import singlepattern.bean.VolatileDoubleCheckLockSinglton;

/** 
 * @ClassName: SingletonPatternDemo 
 * @Description: 单例模式测试Demo
 * @author HongDa
 * @date 2018年9月12日 下午3:39:48 
 */
public class SingletonPatternDemo {
	public static void main(String[] args){
		
		//饿汉式
		Singleton singleton = Singleton.getInstance();
		singleton.println();
		
		//懒汉式
		DelaySingleton delaySingleton = DelaySingleton.getInstance();
		delaySingleton.println();
		
		//加锁版懒汉式
		LockDelaySingleton lockDelaySingleton = LockDelaySingleton.getInstance();
		lockDelaySingleton.println();
		
		//普通双检锁模式
		DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
		doubleCheckLockSingleton.println();
		
		//基于volatile的双检锁模式
		VolatileDoubleCheckLockSinglton volatileDoubleCheckLockSinglton = VolatileDoubleCheckLockSinglton.getInstance();
		volatileDoubleCheckLockSinglton.println();
		
		//基于静态内部类实现的单例类
		InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
		innerClassSingleton.println();
		
	}
}













