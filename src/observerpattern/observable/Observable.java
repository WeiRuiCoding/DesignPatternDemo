package observerpattern.observable;

import observerpattern.observer.Observer;

/** 
 * @ClassName: Observable 
 * @Description: 抽象被观察者角色
 * 定义了注册观察者,注销观察者,通知观察者方法 
 * @author HongDa
 * @date 2018年9月14日 下午4:02:04 
 */
public interface Observable {
	
	//注册观察者
	public abstract void registerObserver(Observer observer);
	
	//注销观察者
	public abstract void removeObserver(Observer observer);
	
	//通知观察者
	public void notifyObserver();
}
