package courseManagement;

public class Course {
	private String title;
	private String courseNumber;
	private Instructor instructor;
	private Textbook textbook;
	private Student[] students;

	public Course(String title, String courseNumber, Instructor instructor, Textbook textbook, Student[] students) {
		super();
		this.title = title;
		this.courseNumber = courseNumber;
		this.instructor = new Instructor(instructor);
		this.textbook = new Textbook(textbook);
		this.students = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = new Student(students[i]);
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = new Instructor(instructor);
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = new Textbook(textbook);
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = new Student(students[i]);
		
	}

}
}
