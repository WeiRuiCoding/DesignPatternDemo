package builderpattern.builder;

import builderpattern.product.Computer;

/** 
 * @ClassName: ComputerBuilder 
 * @Description: 抽象建造者
 * @author HongDa
 * @date 2018年9月13日 下午6:22:22 
 */
public interface ComputerBuilder {
	
	public abstract void builderCPU();
	public abstract void builderHD();
	public abstract void builderMOBO();
	public abstract void builderRAM();
	public abstract void builderMonitor();
	public abstract Computer getComputer();
}
