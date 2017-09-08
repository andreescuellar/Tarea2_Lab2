
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point punto = new Point(-1, 3);
		Point puntoFinal = new Point(4, 1);
		
		Line linea = new Line(punto, puntoFinal);
		
		System.out.println("El tamaño de la linea es: " + linea.getLength());
		
		
		//Prueba de Herencia
		
		//Prueba sub clase Student
		Student estudiante = new Student("Pedro", "Zona 21, Guatemala", 5);
		System.out.println(estudiante.toString());
		estudiante.addCourseGrade("Mate", 90);
		estudiante.addCourseGrade("Progra", 99);
		estudiante.addCourseGrade("Ingles", 80);
		estudiante.addCourseGrade("Quimica", 75);
		
		estudiante.printGrades();
		System.out.println("Promedio: " + estudiante.getAverageGrade());
		
		
		//Prueba sub clase Teacher
		Teacher profe = new Teacher("Juanito", "5ta. Calle Zona 1, Guatemala", 4);
		System.out.println(profe.toString());
		System.out.println( profe.addCourse("Mate"));
		System.out.println( profe.addCourse("Idioma"));
		System.out.println( profe.addCourse("Mate"));
		System.out.println( profe.addCourse("Progra"));
		System.out.println( profe.addCourse("Quimica"));
		System.out.println( profe.removeCourse("Ingles"));
		System.out.println( profe.removeCourse("Mate"));
		
	}

}
