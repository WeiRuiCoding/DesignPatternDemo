package factorypattern.factory;

import factorypattern.product.Shape;

/** 
 * @ClassName: ShapeAbstactFactory 
 * @Description: 创建形状的抽象工厂 
 * @author HongDa
 * @date 2018年9月13日 下午3:11:08 
 */
public interface ShapeAbstactFactory {
	
	public abstract Shape getInstance();
}
