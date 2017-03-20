
public class Pet {

	   private String name;
	   private String type;
	   private int age;

	   //Parameter constructor
	   public Pet(String name, String type, int age) {
	       super();
	       System.out.println("Pet Obejct Created");
	       this.name = name;
	       this.type = type;
	       this.age = age;
	   }

	   public String getName() {
	       return name;
	   }

	   public String getType() {
	       return type;
	   }

	   public int getAge() {
	       return age;
	   }

	
}
