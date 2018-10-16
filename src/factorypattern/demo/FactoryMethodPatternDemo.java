package factorypattern.demo;

import factorypattern.factory.impl.CircleFactory;
import factorypattern.factory.impl.RectangleFactory;
import factorypattern.factory.impl.TriangleFactory;
import factorypattern.product.Shape;

/** 
 * @ClassName: FactoryMethodPatternDemo 
 * @Description: 工厂方法模式DEMO
 * 角色:
 *  |-抽象工厂:ShapeAbstractFactory
 *  |-具体工厂:
 *   |-CircleFactory
 *   |-RectangleFactory
 *   |-TriangleFactory
 *  |-抽象产品:Shape
 *  |-具体产品:
 *   |-Circle
 *   |-Rectangle
 *   |-Triangle
 * @author HongDa
 * @date 2018年9月13日 下午3:03:33 
 */
public class FactoryMethodPatternDemo {
	public static void main(String[] args){
		
		Shape circle = new CircleFactory().getInstance();
		Shape rectangle = new RectangleFactory().getInstance();
		Shape triangle = new TriangleFactory().getInstance();
		
		circle.show();
		rectangle.show();
		triangle.show();
	}
}
