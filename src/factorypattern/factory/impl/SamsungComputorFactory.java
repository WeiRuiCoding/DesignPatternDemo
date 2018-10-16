package factorypattern.factory.impl;

import factorypattern.factory.ComputerAbstractFactory;
import factorypattern.product.Computer;
import factorypattern.product.Laptop;
import factorypattern.product.impl.SamsungComputer;
import factorypattern.product.impl.SamsungLaptop;

/** 
 * @ClassName: SamsungComputorFactory 
 * @Description: 具体工厂:生产三星电脑 
 * @author HongDa
 * @date 2018年9月13日 下午6:00:09 
 */
public class SamsungComputorFactory implements ComputerAbstractFactory {

	@Override
	public Computer getComputer() {
		return new SamsungComputer();
	}

	@Override
	public Laptop getLaptop() {
		return new SamsungLaptop();
	}

}
