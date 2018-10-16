package factorypattern.product.impl;

import factorypattern.product.Laptop;

/** 
 * @ClassName: LenovoLaptop 
 * @Description: 具体产品:联想笔记本 
 * @author HongDa
 * @date 2018年9月13日 下午5:31:00 
 */
public class LenovoLaptop implements Laptop {

	@Override
	public void show() {
		System.out.println("I Am Lenovo Laptop");
	}

}
