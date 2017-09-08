
//Hereda métodos públicos de la clase Person
public class Student extends Person{

	private int numCourses = 0;
	private String[] courses = {};
	private int[] grades = {};
	private int counter = 0; //Contador para los cursos y notas.
	
	//Constructor
	public Student(String name, String address, int numCourses ){
		//Parametros de la superclase
		super(name, address);
		//Almacena como máximo 10 notas
		this.numCourses = numCourses;
		this.courses = new String[numCourses];
		this.grades = new int[numCourses];
		this.counter = 0;
	}
	
	//Métodos propios de la subclase
	public String toString(){
		return "Student: "+ aString();
	}
	
	public void addCourseGrade(String course, int grade){
		this.courses[counter] = course;
		this.grades[counter] = grade;
		counter = counter + 1;
	}
	
	public void printGrades(){
		
		for(int i = 0; i < this.numCourses; i++){
			System.out.println(this.courses[i] + ": " + this.grades[i]);
		}	
	}
	
	public double getAverageGrade(){
		double result = 0;
		double sum = 0;
		
		for(int i = 0; i < this.grades.length; i++){
			sum = sum + this.grades[i];
		}
		
		result = sum/this.counter;
		return result;
	}
	
}
