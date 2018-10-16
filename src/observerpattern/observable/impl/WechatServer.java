package observerpattern.observable.impl;

import java.util.ArrayList;
import java.util.List;

import observerpattern.observable.Observable;
import observerpattern.observer.Observer;

/** 
 * @ClassName: WechatServer 
 * @Description: 具体的被观察者角色:微信公众号
 * @author HongDa
 * @date 2018年9月14日 下午4:16:22 
 */
public class WechatServer implements Observable {

	//已注册的观察者列表
	private List<Observer> observers;
	
	//微信公众号推送的消息
	private String message;
	
	public WechatServer() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(observers != null){
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observers != null && observers.size() > 0){
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		if(observers != null && observers.size() > 0){
			for(Observer observer : observers){
				observer.update(message);
			}
		}
	}

	public void pushMessage(String message) {
		this.message = message;
		this.notifyObserver();
	}
}
