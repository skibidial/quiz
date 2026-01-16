package logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;

	public Order() {
		// TODO
		orderNumber = totalOrderCount;
		totalOrderCount++;
		orderItemList = new ArrayList<>();
	}

	public OrderItem addItem(Item item, int amount) {
		// TODO
		// Loop the orderItemList to find if item of any orderItem equals to the given item
		// if there is orderItem with given item, increase that orderItem itemAmount with amount
		// and return that orderItem
		if(amount < 0){
			amount = 0;
		}
		for(OrderItem orderItem : orderItemList){
			if (orderItem.getItem().getName().equals(item.getName())) {
				orderItem.setItemAmount(orderItem.getItemAmount() + amount);
				return orderItem;
			}
		}
		OrderItem NewOrderItem = new OrderItem(item, amount);
		orderItemList.add(NewOrderItem);
		return NewOrderItem;
		// else create new orderItem with given item and amount, then return the new orderItem
	}

	public int calculateOrderTotalPrice() {
		// TODO
		int sum = 0;
		// Calculate total price of the order by summing total price of each orderItem in orderItemList
		for(OrderItem orderItem : orderItemList){
			sum += orderItem.calculateTotalPrice();
		}
		return sum;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	
	
}
