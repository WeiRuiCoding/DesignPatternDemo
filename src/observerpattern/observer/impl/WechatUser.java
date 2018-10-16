package observerpattern.observer.impl;

import observerpattern.observer.Observer;

/** 
 * @ClassName: WechatUser 
 * @Description: 具体的观察者角色:订阅公众号的用户 
 * @author HongDa
 * @date 2018年9月14日 下午4:40:34 
 */
public class WechatUser implements Observer {
	
	private String name;
	private String message;
	
	public WechatUser(String name){
		this.name = name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		read();
	}
	
	public void read(){
		System.out.println(name + "收到推送消息:" + message);
	}

}
