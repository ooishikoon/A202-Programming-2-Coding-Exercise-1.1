
public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		dog.name = "Fifteen";
		dog.age = 2;
		dog.breed = "Golden Retriver";
		
		cat.name = "Gogo";
		cat.age = 3;
		cat.breed = "Ragdoll";
		
		System.out.println("Dog" + "\nType : " + dog.name + "\nAge : " + dog.age + "\nBreed : " + dog.breed);
		
		System.out.println("\nCat" + "\nType : " + cat.name + "\nAge : " + cat.age + "\nBreed : " + cat.breed);

	}

}
