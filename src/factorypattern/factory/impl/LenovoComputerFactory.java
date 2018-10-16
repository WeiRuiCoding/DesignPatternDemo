package factorypattern.factory.impl;

import factorypattern.factory.ComputerAbstractFactory;
import factorypattern.product.Computer;
import factorypattern.product.Laptop;
import factorypattern.product.impl.LenovoComputer;
import factorypattern.product.impl.LenovoLaptop;

/** 
 * @ClassName: LenovoComputerFactory 
 * @Description: 具体工厂:生产联想电脑 
 * @author HongDa
 * @date 2018年9月13日 下午5:59:20 
 */
public class LenovoComputerFactory implements ComputerAbstractFactory {

	@Override
	public Computer getComputer() {
		return new LenovoComputer();
	}

	@Override
	public Laptop getLaptop() {
		return new LenovoLaptop();
	}
}
