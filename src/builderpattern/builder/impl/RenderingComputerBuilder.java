package builderpattern.builder.impl;

import builderpattern.builder.ComputerBuilder;
import builderpattern.product.Computer;

/** 
 * @ClassName: RenderingComputerBuilder 
 * @Description: 具体建造者角色:视频渲染电脑配置构建 
 * @author HongDa
 * @date 2018年9月13日 下午6:49:01 
 */
public class RenderingComputerBuilder implements ComputerBuilder {

	private Computer computer = new Computer();
	
	@Override
	public void builderCPU() {
		computer.setCPU("Intel酷睿i7-7700K");
	}

	@Override
	public void builderHD() {
		computer.setHD("三星750 EVO SATA III(250GB)");
	}

	@Override
	public void builderMOBO() {
		computer.setMOBO("华硕ROG STRIX B250H GAMING");
	}

	@Override
	public void builderRAM() {
		computer.setRAM("海盗船复仇者LPX DDRA 3200 32GB");
	}

	@Override
	public void builderMonitor() {
		computer.setMonitor("丽台Quadro P2000");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
