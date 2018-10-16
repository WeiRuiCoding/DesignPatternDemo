package factorypattern.demo;

import factorypattern.factory.impl.ShapeSimpleFactory;
import factorypattern.product.Shape;

/** 
 * @ClassName: SimpleFactoryPatternDemo 
 * @Description: 简单工厂模式Demo
 * 角色:
 *  |-具体工厂:ShapeSimpleFactory
 *  |-抽象产品:Shape
 *  |-具体产品:
 *   |-Circle
 *   |-Rectangle
 *   |-Triangle
 * @author HongDa
 * @date 2018年9月12日 下午6:01:18 
 */
public class SimpleFactoryPatternDemo {
	public static void main(String[] args){
		
		Shape circle = ShapeSimpleFactory.getInstance(ShapeSimpleFactory.circle);
		Shape rectangle = ShapeSimpleFactory.getInstance(ShapeSimpleFactory.rectangle);
		Shape triangle = ShapeSimpleFactory.getInstance(ShapeSimpleFactory.triangle);
		
		circle.show();
		rectangle.show();
		triangle.show();
	}
}