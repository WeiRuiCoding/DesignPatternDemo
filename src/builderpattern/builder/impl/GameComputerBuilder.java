package builderpattern.builder.impl;

import builderpattern.builder.ComputerBuilder;
import builderpattern.product.Computer;

/** 
 * @ClassName: GameComputerBuilder 
 * @Description: 具体建造者角色:游戏电脑配置构建
 * @author HongDa
 * @date 2018年9月13日 下午6:35:01 
 */
public class GameComputerBuilder implements ComputerBuilder {
	
	private Computer computer = new Computer();

	@Override
	public void builderCPU() {
		computer.setCPU("Intel酷睿i7-7700K");
	}

	@Override
	public void builderHD() {
		computer.setHD("WD 1TB 7200 转机械硬盘");
	}

	@Override
	public void builderMOBO() {
		computer.setMOBO("华擎 Z270 Extreme4主板");
	}

	@Override
	public void builderRAM() {
		computer.setRAM("金士顿 骇客神条 DDR4 2400 32G");
	}

	@Override
	public void builderMonitor() {
		computer.setMonitor("影驰G TX1080 名人堂");
	}
	
	public Computer getComputer(){
		return computer;
	}

}
