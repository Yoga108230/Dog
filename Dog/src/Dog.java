public class Dog {
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		this.name= name;
		this.breed= breed;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setBreed(String breed) {
		this.breed= breed;
	}
	
	public void display() {
		System.out.println("Name: "+ name+ " Breed: "+ breed);
	}
	
	public static void main(String[]args) {
		Dog d1= new Dog("Max", "German Shephered");
		Dog d2= new Dog("Daisy", "Chihuahua");
		
		d1.display();
		d2.display();
		
		d1.setName("Charlie");
		d1.setBreed("Golden Retriever");
		d2.setName("Luna");
		d2.setBreed("Pug");
		
		d1.display();
		d2.display();
	}
}