package observerpattern.demo;

import observerpattern.observable.impl.WechatServer;
import observerpattern.observer.impl.WechatUser;

/** 
 * @ClassName: ObserverPatternDemo 
 * @Description: 观察者模式DEMO
 * 角色:
 *  |-抽象被观察者角色:Observable
 *  |-具体被观察者角色:WechatServer:微信公众号
 *  |-抽象观察者角色:Observer
 *  |-具体观察者角色:WechatUser:订阅了微信公众号的微信用户
 * @author HongDa
 * @date 2018年9月14日 下午3:56:48 
 */
public class ObserverPatternDemo {
	public static void main(String[] args){
		
		//创建公众号
		WechatServer gzh = new WechatServer();
		
		//创建微信用户
		WechatUser zhang = new WechatUser("张三");
		WechatUser li = new WechatUser("李二");
		WechatUser zhao = new WechatUser("赵六");
		
		//微信用户订阅公众号
		gzh.registerObserver(zhang);
		gzh.registerObserver(li);
		gzh.registerObserver(zhao);
		
		//公众号首次推送消息
		gzh.pushMessage("欢迎大家关注,请领取新人红包");
		
		//赵六取消关注
		gzh.removeObserver(zhao);
		
		//公众号日常推送消息
		gzh.pushMessage("感恩老顾客,请领取粉丝福利");
	}
}
