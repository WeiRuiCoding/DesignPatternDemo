package builderpattern.director;

import builderpattern.builder.ComputerBuilder;

/** 
 * @ClassName: ComputerDirector 
 * @Description: 导演者角色:指导如何生产 
 * @author HongDa
 * @date 2018年9月13日 下午6:26:24 
 */
public class ComputerDirector {
	
	private ComputerBuilder builder;
	
	public ComputerDirector(ComputerBuilder builder){
		this.builder = builder;
	}
	
	public void construct(){
		
		builder.builderCPU();
		builder.builderHD();
		builder.builderMOBO();
		builder.builderRAM();
		builder.builderMonitor();
	}
}
