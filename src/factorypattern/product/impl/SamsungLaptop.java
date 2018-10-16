package factorypattern.product.impl;

import factorypattern.product.Laptop;

/** 
 * @ClassName: SamsungLaptop 
 * @Description: 具体产品:三星笔记本
 * @author HongDa
 * @date 2018年9月13日 下午5:31:53 
 */
public class SamsungLaptop implements Laptop {

	@Override
	public void show() {
		System.out.println("I Am Samsung Laptop");
	}

}
