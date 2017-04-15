package PersonalInfo;

public class Info {

	private String name;
	private String address;

	   public void setName(String name){
	      this.name  = name;
	   }
	   public void gettest(){
	      System.out.println("Your Message : " + name);
	   }
	   
	   
	   public void setAddress(String address){
		      this.address  = address;
		   }
		   public void getAddress(){
		      System.out.println("Your Address is : " + address);
		   }
}
