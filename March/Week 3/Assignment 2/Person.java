package AssignementMar15;

public class Person {
	// fields
	   private String name;
	   private String email;
	   private String phoneNumber;

	   // constructor
	   public Person(String theName)
	   {
	      this.name = theName;
	   }
	   public Person(String name, String email) {
		   this.name= name;
		   this.email=email;
		   this.phoneNumber="4688568546";
	   }
	   public Person(String name, String email, String phoneNumber) {
		   this.name= name;
		   this.email=email;
		   this.phoneNumber=phoneNumber;
	   }
	   public Person() {
		   this.name= "BB";
		   this.email="bb@c";
		   this.phoneNumber="25415663245";
	   }
	   
	   // methods - getters
	   public String getName() { return this.name;}
	   public String getEmail() { return this.email;}
	   public String getPhoneNumber() { return this.phoneNumber;}

	   // methods - setters
	   public void setName(String theName) { this.name = theName;}
	   public void setEmail(String theEmail) {this.email = theEmail;}
	   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	   public String toString()
	   {
	      return this.name + " " + this.email + " " + this.phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args)
	   {
	      Person p1 = new Person("Sana");
	      System.out.println(p1);
	      
	      Person p2 = new Person("Jean");
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2);
	      
	      Person p3 = new Person("AA","aa@b");
	      System.out.println(p3);
	      
	      Person p4 = new Person("CC","cc@d","451328312");
	      System.out.println(p4);
	      
	      Person p5 = new Person();
	      System.out.println(p5);


	   }


}
