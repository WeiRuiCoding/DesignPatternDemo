package factorypattern.product.impl;

import factorypattern.product.Computer;

/** 
 * @ClassName: SamsungComputer 
 * @Description:具体产品:三星台式电脑
 * @author HongDa
 * @date 2018年9月13日 下午5:30:03 
 */
public class SamsungComputer implements Computer {

	@Override
	public void show() {
		System.out.println("I Am Samsung Computer");
	}
}
