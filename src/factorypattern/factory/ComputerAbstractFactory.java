package factorypattern.factory;

import factorypattern.product.Computer;
import factorypattern.product.Laptop;

/** 
 * @ClassName: ComputerAbstractFactory 
 * @Description: 抽象工厂:电脑工厂
 * @author HongDa
 * @date 2018年9月13日 下午5:57:39 
 */
public interface ComputerAbstractFactory {
	
	public abstract Computer getComputer();
	
	public abstract Laptop getLaptop();
}
