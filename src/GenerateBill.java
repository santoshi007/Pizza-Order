
public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		OrderPizza[] item1=new OrderPizza[5];
		item1[0]=new OrderPizza("  chicken Pizza",2,300);
		item1[1]=new OrderPizza("  Chesse Pizza",3,350);
		item1[2]=new OrderPizza("  Onion Pizza",1,150);
		
		System.out.println("====================================================");
		System.out.println("               WELCOME               ");
		System.out.println("                 To                  ");
		System.out.println("              Pizza Hutt             ");
		System.out.println("====================================================");
		System.out.println("  Phone No :- 7788995544                   ");
		System.out.println("  Order No :- 61                           ");
		System.out.println("====================================================");
		
	    System.out.println(" Pizza Name	Quantity	Price	Total Price");
	    
	    System.out.println("====================================================");
	    for(i=0;i<=2;i++)
		{
			total=total+item1[i].totalPrice();
			item1[i].printDetail();
		
		}
	  
		
		
	
		System.out.println("===================================================");
		
		System.out.println("  Amount = "+total);
		
		
		int amount=total;
		int gst;
		amount=(amount*8)/100;
		gst=total+amount;
		System.out.println("  GST(8%) Tax = "+amount);
		System.out.println("  Total Amount = "+gst);
		
		
		System.out.println("===================================================");
		System.out.println("               THANK YOU                   ");
		System.out.println("===================================================");
		
	}
	
}


