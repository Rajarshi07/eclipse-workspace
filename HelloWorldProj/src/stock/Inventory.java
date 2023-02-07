package stock;

public class Inventory {
	int quantity;
	int lowLevelOrderQuantity;
	
	public Inventory(int quantity, int lowLevelOrderQuantity) {
		super();
		this.quantity = quantity;
		this.lowLevelOrderQuantity = lowLevelOrderQuantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getLowLevelOrderQuantity() {
		return lowLevelOrderQuantity;
	}
	public void generateRFM() {
		// TODO Auto-generated method stub
	
	}
	public void order(int qty) {
		if(quantity>=qty) {
			quantity-=qty;
			printInvoice(qty);
		}
		if(quantity<lowLevelOrderQuantity) {
			generateRFM();
		}
		
	}

	public void setLowLevelOrderQuantity(int lowLevelOrderQuantity) {
		this.lowLevelOrderQuantity = lowLevelOrderQuantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void printInvoice(int qty) {
		// TODO Auto-generated method stub
		
	}

}
