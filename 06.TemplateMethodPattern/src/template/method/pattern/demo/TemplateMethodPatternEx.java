package template.method.pattern.demo;

import engineering.papers.BasicEngineering;
import engineering.papers.ComputerScience;
import engineering.papers.Electronics;

public class TemplateMethodPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Template Method Pattern Demo***\n");
		
		BasicEngineering bs = new ComputerScience();
		System.out.println("Computer Sc Papers:");
		bs.Papers();
		System.out.println();
		bs = new Electronics();
		System.out.println("Electronics Papers:");
		bs.Papers();
	}

}
