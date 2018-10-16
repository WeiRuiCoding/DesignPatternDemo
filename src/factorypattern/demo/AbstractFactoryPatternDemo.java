package factorypattern.demo;

import factorypattern.factory.impl.LenovoComputerFactory;
import factorypattern.factory.impl.SamsungComputorFactory;
import factorypattern.product.Computer;
import factorypattern.product.Laptop;

/**
 * @ClassName: AbstractFactoryPatternDemo 
 * @Description: 抽象工厂模式DEMO
 * 角色:
 *  |-抽象工厂角色:
 *   |-ComputerAbstractFactory:生产电脑的抽象工厂
 *  |-具体工厂角色:
 *    |-LenovoComputerFactory:生产联想电脑的工厂
 *    |-SamsungComputerFactory:生产三星电脑的工厂
 *  |-抽象产品角色:
 *   |-Computer:台式电脑抽象
 *   |-Laptop:笔记本电脑抽象
 *  |-具体产品角色
 *    |-LenovoComputer:联想台式电脑
 *    |-LenovoLaptop:联想笔记本电脑
 *    |-SamsungComputer:三星台式电脑
 *    |-SamsungLaptop:三星笔记本电脑
 * @author HongDa
 * @date 2018年9月13日 下午5:17:19
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		
		LenovoComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
		SamsungComputorFactory samsungComputorFactory = new SamsungComputorFactory();
		
		Computer lenovoComputer = lenovoComputerFactory.getComputer();
		Laptop lenovoLaptop = lenovoComputerFactory.getLaptop();
		
		lenovoComputer.show();
		lenovoLaptop.show();
		
		Computer samsungComputer = samsungComputorFactory.getComputer();
		Laptop samsungLaptop = samsungComputorFactory.getLaptop();
		
		samsungComputer.show();
		samsungLaptop.show();
		
	}
}
