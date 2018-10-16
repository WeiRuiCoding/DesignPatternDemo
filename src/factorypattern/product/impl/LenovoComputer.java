package factorypattern.product.impl;

import factorypattern.product.Computer;

/** 
 * @ClassName: LenovoComputer 
 * @Description: 具体产品:联想台式电脑
 * @author HongDa
 * @date 2018年9月13日 下午5:28:29 
 */
public class LenovoComputer implements Computer {

	@Override
	public void show() {
		System.out.println("I Am Lenovo Computer");
	}
}
