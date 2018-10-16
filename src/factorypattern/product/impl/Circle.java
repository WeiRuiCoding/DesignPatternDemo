package factorypattern.product.impl;

import factorypattern.product.Shape;

/** 
 * @ClassName: Circle 
 * @Description: 具体产品:圆形 
 * @author HongDa
 * @date 2018年9月13日 下午2:43:14 
 */
public class Circle implements Shape {

	@Override
	public void show() {
		System.out.println("I Am Circle");
	}
}
