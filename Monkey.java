
public class Monkey extends RescueAnimal{
	//private for monkey
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//constructor
	public Monkey (String name, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength,
	String height, String bodyLength, String species) {
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
	}
	
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setBodyLength(String monkeyBody) {
		bodyLength = monkeyBody;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public String getSpecies() {
		return species;
	}
	

}
