package builderpattern.product;

/** 
 * @ClassName: Computer 
 * @Description: 复杂产品对象 
 * @author HongDa
 * @date 2018年9月13日 下午6:13:39 
 */
public class Computer {
	
	//CPU
	private String CPU;
	
	//硬盘
	private String HD;
	
	//主板
	private String MOBO;
	
	//内存
	private String RAM;
	
	//显示器
	private String monitor;

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getHD() {
		return HD;
	}

	public void setHD(String hD) {
		HD = hD;
	}

	public String getMOBO() {
		return MOBO;
	}

	public void setMOBO(String mOBO) {
		MOBO = mOBO;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", HD=" + HD + ", MOBO=" + MOBO + ", RAM=" + RAM + ", monitor=" + monitor + "]";
	}
	
	public void show(String name){
		System.out.println("----------" + name + "----------");
		System.out.println("CPU:" + this.getCPU());
		System.out.println("HD:" + this.getHD());
		System.out.println("MOBO:" + this.getMOBO());
		System.out.println("RAM:" + this.getRAM());
		System.out.println("Monitor:" + this.getMonitor());
	}
}
