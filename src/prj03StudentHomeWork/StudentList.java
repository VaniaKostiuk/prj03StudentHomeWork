package prj03StudentHomeWork;



public class StudentList {
	private Student [] students ;
	private int count ;
	
	public StudentList () {
		students = new Student[10];
		count=-1;
	}
	public void add(Student student){
		students[++count] = student ;	
	}
	public Student get(int i){
		return students[i];
	}
	public int size(){
		return count+1;
	}
	public void print() {
		for (int i = 0; i < size(); i++) {
		System.out.println(students[i]);
		}
	}
	
	 //(StudentListByFaculty ) список студентов заданного факультета;
	 //(StudentListByFacultyAndCourse) списки студентов для каждого факультета и курса;
	 //(StudentListBornAfterNYear) список студентов, родившихся после заданного года;
	 //(StudentListGroup) список учебной группы 
	
	public StudentList StudentListByFaculty (String faculty) {    
		StudentList StudentListByFaculty  = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty)) {
					System.out.println(students[i]);
				}
			}
		return StudentListByFaculty  ;
	}
	
	public StudentList StudentListByFacultyAndCourse (String faculty ,int course) {      
		StudentList StudentListByFacultyAndCourse = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty) && students[i].getCourse()==course) {
					System.out.println(students[i]);
				}
			}
		return StudentListByFacultyAndCourse ;
	}
	
	public StudentList StudentListBornAfterNYear (int yearBorn) {
		StudentList StudentListBornAfterNYear = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getYearBorn()>yearBorn) {
					System.out.println(students[i]);
				}
			}
		return StudentListBornAfterNYear ;
	}

	public StudentList StudentListGroup (String group) {
		StudentList StudentListGroup = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getGroup().equals(group)) {
					System.out.println(students[i]);
				}
			}
		return StudentListGroup ;
	}
}
