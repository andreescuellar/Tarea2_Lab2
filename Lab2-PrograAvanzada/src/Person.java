
public class Person {

	//Variables privadas 
	
	private String name = "";
	private String address = "";
	
	//Constructor vacio
	public Person(){
		
	}
	
	//Constructor
	public Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	//Funciones y Procedimentos 
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String aString(){
		return "Name: " + this.name + "(Address: " + this.address + ")";
	}
	
}
