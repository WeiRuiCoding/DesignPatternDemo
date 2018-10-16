package factorypattern.product.impl;

import factorypattern.product.Shape;

/** 
 * @ClassName: Triangle 
 * @Description: 具体产品:三角形 
 * @author HongDa
 * @date 2018年9月13日 下午2:46:09 
 */
public class Triangle implements Shape {

	@Override
	public void show() {
		System.out.println("I Am Triangle");
	}
}
