package builderpattern.demo;

import builderpattern.builder.ComputerBuilder;
import builderpattern.builder.impl.GameComputerBuilder;
import builderpattern.builder.impl.RenderingComputerBuilder;
import builderpattern.director.ComputerDirector;
import builderpattern.product.Computer;

/** 
 * @ClassName: BuilderPatternDemo 
 * @Description: 建造者模式DEMO
 * 角色:
 *  |-抽象建造者角色
 *   |-ComputerBuilder:定义了组装电脑各个部件的接口方法
 *  |-具体建造者角色
 *   |-GameComputerBuilder:实现了游戏电脑各个部件的组装方法
 *   |-RenderingComputerBuilder:实现了视频渲染电脑各个部件的组装方法
 *  |-导演者角色:
 *   |-ComputerDirector:调用Builder的组装方法,控制组装流程
 *  |-产品
 *   |-Computer:电脑产品,由各个组件构成
 * @author HongDa
 * @date 2018年9月13日 下午5:15:58 
 */
public class BuilderPatternDemo {
	public static void main(String[] args){
		
		ComputerBuilder gameComputerBuilder = new GameComputerBuilder();
		ComputerBuilder renderingComputerBuilder = new RenderingComputerBuilder();
		
		ComputerDirector gameComputerDirector = new ComputerDirector(gameComputerBuilder);
		ComputerDirector renderComputerDirector = new ComputerDirector(renderingComputerBuilder);
		
		gameComputerDirector.construct();
		renderComputerDirector.construct();
		
		Computer gameComputer = gameComputerBuilder.getComputer();
		Computer renderingComputer = renderingComputerBuilder.getComputer();
		
		gameComputer.show("游戏电脑");
		renderingComputer.show("视频渲染电脑");
	}
}
