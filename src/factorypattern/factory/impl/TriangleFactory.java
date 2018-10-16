package factorypattern.factory.impl;

import factorypattern.factory.ShapeAbstactFactory;
import factorypattern.product.Shape;
import factorypattern.product.impl.Triangle;

/** 
 * @ClassName: TraingleFactory 
 * @Description: 具体工厂:生产三角形 
 * @author HongDa
 * @date 2018年9月13日 下午3:14:45 
 */
public class TriangleFactory implements ShapeAbstactFactory {

	@Override
	public Shape getInstance() {
		return new Triangle();
	}
}
