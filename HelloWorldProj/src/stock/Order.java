package stock;
import material.Accessories;
import material.Laptops;
public class Order {

	public static void main(String[] args) {
		Laptops l1=new Laptops(15,100,"lenovo","ideapad","ryzen5",16,512,60000.00);
		Laptops l2=new Laptops(15,101,"lenovo","yoga","i7",16,512,65000.00);
		Laptops l3=new Laptops(15,102,"lenovo","thinkpad","ryzen7",16,512,90000.00);
		Laptops l4=new Laptops(15,103,"asus","vivobook","ryzen7",16,512,70000.25);
		Laptops l5=new Laptops(15,104,"lg","gram","i5",16,512,80000.00);
		Accessories a1=new Accessories(15,201,"earphone","jbl","tws100",4000.00);
		Accessories a2=new Accessories(15,202,"earphone","jbl","tws100",4000.00);
		Accessories a3=new Accessories(15,203,"earphone","jbl","tws100",4000.00);
		Accessories a4=new Accessories(15,204,"earphone","jbl","tws100",4000.00);
		Accessories a5=new Accessories(15,205,"earphone","jbl","tws100",4000.00);
		Accessories a6=new Accessories(15,206,"earphone","jbl","tws100",4000.00);
		Accessories a7=new Accessories(15,207,"earphone","jbl","tws100",4000.00);
		Accessories a8 =new Accessories(15,208,"earphone","jbl","tws100",4000.00);
		Accessories a9=new Accessories(15,209,"earphone","jbl","tws100",4000.00);
		Accessories a10=new Accessories(15,210,"earphone","jbl","tws100",4000.00);
		
		// TODO Auto-generated method stub
		
		l1.order(5);
		l1.order(10);
		l2.order(2);

	}

}
