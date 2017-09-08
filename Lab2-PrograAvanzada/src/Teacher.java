
//Hereda métodos públicos de la clase Person
public class Teacher extends Person{

	//Variables privadas 
	private int numCourses = 0;
	private String[] courses = {};
	private int counter = 0;
	
	//Constructor
	public Teacher(String name, String address, int numCourses){
		//Parametros de la superclase
		super(name, address);
		this.numCourses = numCourses;
		this.courses = new String[numCourses];
		this.counter = 0;
	}
	
	
	//Métodos propios de la subclase
	
	public String toString(){
		return "Teacher: " + aString();
	}
	
	public boolean addCourse(String course){
		
		for(int i = 0; i < this.numCourses; i++){
			if(this.courses[i] == course){
				return false;
			}
		}
		
		this.courses[counter] = course;
		counter = counter + 1;
		
		return true;
		
	}
	
	public boolean removeCourse(String course){
		
		for(int i = 0; i < this.numCourses; i++){
			if(this.courses[i] == course){
				this.courses[i] = "";
				return true;
			}
		}
		
		return false;
	}
}
