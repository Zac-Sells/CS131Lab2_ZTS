
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
	super();
	this.name="";
	this.key = 0;
	this.health = 100;
	this.locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
	super();
	this.setName(name);
	this.key = 0;
	this.health = 100;
	this.locked = false
	

	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
			if (isLocked() == false)
			health = health - power;
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
	       return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health=health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	public void setKey(int key) {
		// TODO Auto-generated method stub
		if(key > 0 && this.key == 0 )
		this.key=key;
			
	}

	@Override
	public void lock(int key) {
		// TODO Auto-generated method stub
		if(this.key == key)
			this.locked=true;
	}

	@Override
	public void unlock(int key) {
		// TODO Auto-generated method stub
		if(this.key == key)
			this.locked=false;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return this.locked;
	}
	
}//end class
