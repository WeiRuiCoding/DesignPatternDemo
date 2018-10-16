package factorypattern.product.impl;

import factorypattern.product.Shape;

/** 
 * @ClassName: Rectangle 
 * @Description: 具体产品:矩形
 * @author HongDa
 * @date 2018年9月13日 下午2:44:34 
 */
public class Rectangle implements Shape {

	@Override
	public void show() {
		System.out.println("I Am Rectangle");
	}
}
