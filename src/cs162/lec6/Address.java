package cs162.lec6;

public class Address{
	private int streetNum;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	public void printAddress(){
		System.out.println((street == null
			? ""
			: streetNum + " " + street + ", ")
			+ city + ", " + state
			+ " " + zipCode);
	}
	public int getStreetNum(){return streetNum;}
	public void setStreetNum(int pStreetNum){streetNum = pStreetNum;}
	public String getStreet(){return street;}
	public void setStreet(String pStreet){street = pStreet;}
	public String getCity(){return city;}
	public void setCity(String pCity){city = pCity;}
	public String getState(){return state;}
	public void setState(String pState){state = pState;}
	public String getZipCode(){return zipCode;}
	public void setZipCode(String pZipCode){zipCode = pZipCode;}
	public Address(){
		streetNum	= 410;
		street		= "S. Third Street";
		city		= "River Falls";
		state		= "WI";
		zipCode		= "54022";
	}
	public Address(int pStreetNum, String pStreet, String pCity, String pState, String pZipCode){
		streetNum	= pStreetNum;
		street		= pStreet;
		city		= pCity;
		state		= pState;
		zipCode		= pZipCode;
	}
	public Address(String pCity, String pState, String pZipCode){
		city		= pCity;
		state		= pState;
		zipCode		= pZipCode;
	}
	public String toString(){
		return (street == null
			? ""
			: streetNum + " " + street + ", ")
			+ city + ", " + state
			+ " " + zipCode;
	}
}