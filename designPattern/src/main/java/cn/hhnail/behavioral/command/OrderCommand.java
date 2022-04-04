package cn.hhnail.behavioral.command;

public class OrderCommand implements Command{

	private Cook cook;
	private Order order;

	/**
	 * 哪个厨师做哪个订单
	 */
	public OrderCommand(Cook cook, Order order){
		this.cook = cook;
		this.order = order;
	}

	public void execute() {
		Integer orderId = order.getOrderId();
		System.out.println(orderId+"号卓的餐：");
		order.getFood().forEach((foodName,num)->{
			cook.makeFood(foodName,num);
		});
		System.out.println(orderId+"号卓的餐做完了！");
	}
}
