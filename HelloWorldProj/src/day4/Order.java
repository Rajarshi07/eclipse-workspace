package day4;

public class Order {
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;
//	Constructor overloading
	public Order() {
		// TODO Auto-generated constructor stub
		this.status="Ordered";
	}
	public Order(int orderId,String orderedFoods) {
		// TODO Auto-generated constructor stub
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	public Order(int orderId, String orderedFoods, double totalPrice, String status) {
//		super();
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public String getOrderedFoods() {
		return orderedFoods;
	}
	public String getStatus() {
		return status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public double calculateTotalPrice(double unitPrice) {
		totalPrice = unitPrice + (.05*unitPrice);
		return totalPrice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
