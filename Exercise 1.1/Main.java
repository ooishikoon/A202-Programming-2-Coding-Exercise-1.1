
public class Main {

	public static void main(String[] args) {
		ClassDog a = new ClassDog();
		System.out.print("Animal 1 is ");
		a.type();
		
		System.out.println("Name : " + a.name);
		System.out.println("Age : " + a.age + " years old");
		System.out.println("Breed : " + a.breed);
		
		ClassCat b = new ClassCat();
		System.out.print("\nAnimal 2 is ");
		b.type();
		
		System.out.println("Name : " + b.name);
		System.out.println("Age : " + b.age + " years old");
		System.out.println("Breed : " + b.breed);

	}

}
