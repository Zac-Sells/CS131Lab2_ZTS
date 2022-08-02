
public class Application {

	public static void main(String[] args) {
		//create new wizard using empty argument constructor 
		Wizard W1 = new Wizard();
		System.out.println(W1.toString());
		
		//create new wizard using preferred constructor
		Wizard W2 = new Wizard("Merlin", 100, 0, false);
		System.out.println(W2.toString());
		
		//implement takeDamage method
		W2.takeDamage(50);
		System.out.println(W2.toString());
		
		//implement setKey method
		W2.setKey(15);
		System.out.println(W2.toString());
		
		//implement a second setKey method to demonstrate that it will not set a key a second time
		W2.setKey(25);
		System.out.println(W2.toString());
		
		//implement lock method that does not match the key to prove it will not lock unless it matches
		W2.lock(1);
		System.out.println(W2.toString());
		
		//implement lock method that does match the key to prove it will lock
		W2.lock(15);
		System.out.println(W2.toString());
		
		//implement takedamage() to prove it will not work when locked eqauls true
		W2.takeDamage(50);
		System.out.println(W2.toString());
		
		//implement unlock method that does not match the key to prove it will not unlock unless it matches
		W2.unlock(1);
		System.out.println(W2.toString());
		
		//implement unlock method that does match the key to prove it will unlock
		W2.unlock(15);
		System.out.println(W2.toString());
		
		//implement isLocked method 
		W2.isLocked();
		System.out.println(W2.isLocked());
	}
}
