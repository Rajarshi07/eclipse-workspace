package material;

import stock.Inventory;

public class Laptops extends Inventory {
	int uId;
	String brand,model,processor;
	int ram,storage;
	double price;



	public Laptops(int quantity, int uId, String brand, String model, String processor,
			int ram, int storage,double price) {
		super(quantity,3);
		this.uId = uId;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}
	@Override
	public void printInvoice(int qty) {
		// TODO Auto-generated method stub
		super.printInvoice(qty);
		System.out.println("Invoice for "+brand+" "+model+" " +"("+processor+", "+ram+"GB/"+storage+"GB) x"+qty);
		System.out.println("Total: "+price*qty);
	}
	@Override
	public void generateRFM() {
		// TODO Auto-generated method stub
		super.generateRFM();
		System.out.println("RFM for "+uId);
	}

}
