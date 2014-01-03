
public class a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
person i=new person();
try{
	i.setName("pranjay");
	Address ad=new Address();
	ad.setAddress("noida");
	i.setAd(ad);
person p=(person)i.clone();
System.out.println(p.getName());
System.out.println(p.getAd().getAddress());
ad.setAddress("delhi");
i.setName("hhhh");
System.out.println(p.getName());
System.out.println(p.getAd().getAddress());

		
}
catch(CloneNotSupportedException e){
	e.printStackTrace();
}
	}
}

