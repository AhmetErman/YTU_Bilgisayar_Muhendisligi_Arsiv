package nyp03c;
public class Car {
	private String plate;
	private Person owner;

	public Car( String plate ) { this.plate = plate; }
	public Car( String plate, Person owner ) {
		this.plate = plate;
		setOwner(owner);
	}
	public void setOwner( Person owner ) { 
		this.owner = owner;
		if( owner.getCar() != this )
			owner.setCar(this);
	}
	public Person getOwner() { return owner; }
	public String getPlate( ) { return plate; }
	public void setPlate( String plate ) { this.plate = plate; }
	public String introduceSelf( ) {
		String intro;
		intro = "[CAR] My license plate is " + getPlate();
		if( owner != null )
			intro += " and my owner is " + owner.getName();
		return intro;
	}
}
