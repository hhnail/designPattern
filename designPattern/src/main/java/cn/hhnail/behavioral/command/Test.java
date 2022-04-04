package cn.hhnail.behavioral.command;

/**
 * 命令模式
 */
public class Test {

	public static void main(String[] args) {
		Order order1 = new Order(1);
		order1.addOrder("扬州炒饭",2);
		order1.addOrder("豆奶",2);

		Order order2 = new Order(1);
		order2.addOrder("尖椒肉丝盖饭",1);
		order2.addOrder("羊肉面",1);

		Cook cook1 = new Cook();
		Cook cook2 = new Cook();

		// 厨师1做订单1; 厨师2做订单2
		OrderCommand cmd1 = new OrderCommand(cook1,order1);
		OrderCommand cmd2 = new OrderCommand(cook2,order2);

		Waitor waitor = new Waitor();
		waitor.saveCommand(cmd1);
		waitor.saveCommand(cmd2);
		waitor.sendOrder();
	}

}
