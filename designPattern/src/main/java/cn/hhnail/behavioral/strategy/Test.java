package cn.hhnail.behavioral.strategy;

/**
 * 策略模式
 */
public class Test {
	public static void main(String[] args) {

		// 春节来了，春节促销活动
		SalesMan salesMan = new SalesMan(new Strategy01());
		System.out.println("春节来了，使用策略");
		salesMan.show();
		System.out.println("===========================");
		salesMan.setStrategy(new Strategy02());
		System.out.println("元宵来了，使用策略");
		salesMan.show();
		System.out.println("===========================");
		salesMan.setStrategy(new Strategy03());
		System.out.println("圣诞节来了，使用策略");
		salesMan.show();
		System.out.println("===========================");
	}
}
