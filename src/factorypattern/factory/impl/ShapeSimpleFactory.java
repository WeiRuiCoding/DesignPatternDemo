package factorypattern.factory.impl;

import factorypattern.product.Shape;
import factorypattern.product.impl.Circle;
import factorypattern.product.impl.Rectangle;
import factorypattern.product.impl.Triangle;

/** 
 * @ClassName: ShapeSimpleFactory 
 * @Description: 创建形状的简单工厂 
 * @author HongDa
 * @date 2018年9月13日 下午2:53:12 
 */
public class ShapeSimpleFactory {
	
	/** 
	 * @Fields circle : 圆形标识
	 */ 
	public static final int circle = 1;
	
	/** 
	 * @Fields rectangle : 矩形标识
	 */ 
	public static final int rectangle = 2;
	
	
	/** 
	 * @Fields triangle : 三角形标识 
	 */ 
	public static final int triangle = 3;
	
	public static Shape getInstance(int model){

		Shape shape = null;
		
		if(model == circle){
			shape = new Circle();
		}else if(model == rectangle){
			shape = new Rectangle();
		}else if(model == triangle){
			shape = new Triangle();
		}
		
		return shape;
	}
}
