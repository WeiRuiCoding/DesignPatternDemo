package observerpattern.observer;

/** 
 * @ClassName: Observer 
 * @Description: 抽象观察者角色 
 * 定义了所有观察者需要实现的更新方法
 * @author HongDa
 * @date 2018年9月14日 下午4:00:52 
 */
public interface Observer {
	public abstract void update(String message);
}
