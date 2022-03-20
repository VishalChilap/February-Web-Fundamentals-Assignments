package AssignementMar17;

public class ClassDog {
	private String name;

	public ClassDog(String name){
		this.name = name;
	}

	


	public static void main(String[] args) {
		ClassDog d1 = new ClassDog("Rufus");
		ClassDog d2 = new ClassDog("Sally");
		ClassDog d3 = new ClassDog("Rufus");
		ClassDog d4 = d3;
	    System.out.println(d1==d2?true : false);
	    System.out.println(d2==d3?true : false);
	    System.out.println(d1==d3?true : false);
	    System.out.println(d3==d4?true : false);
	}


}
