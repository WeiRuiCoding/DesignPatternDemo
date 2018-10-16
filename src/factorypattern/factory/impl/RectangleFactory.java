package factorypattern.factory.impl;

import factorypattern.factory.ShapeAbstactFactory;
import factorypattern.product.Shape;
import factorypattern.product.impl.Rectangle;

/** 
 * @ClassName: RectangleFactory 
 * @Description: 具体工厂:生产矩形 
 * @author HongDa
 * @date 2018年9月13日 下午3:13:45 
 */
public class RectangleFactory implements ShapeAbstactFactory {

	@Override
	public Shape getInstance() {
		return new Rectangle();
	}
}
