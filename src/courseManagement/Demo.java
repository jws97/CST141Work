package courseManagement;

public class Demo {

	public static void main(String[] args) {
		Instructor i1 = new Instructor("John", "4983", "Professor", "MW 8:30 - 12:30");
		Student s1 = new Student("Adam" , "1234", "CS", 4.0);
		Student s2 = new Student("Bill" , "4321", "CS", 3.0);
		Student[] students =  {s1, s2 };
		Textbook t1 = new Textbook("Java", "Liang", "Pearson", 150.50);
		
		Course c = new Course("Intro to Java", "CST141", i1, t1, students);

	}

}
