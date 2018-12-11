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
	/*	Название методов : (aaa,bbb,ccc,ddd) :
	 * 	aaa) список студентов заданного факультета;
		bbb) списки студентов для каждого факультета и курса;
		ccc) список студентов, родившихся после заданного года;
		ddd) список учебной группы 
	*/
	//aaa) список студентов заданного факультета;
	public StudentList aaa (String faculty) {    
		StudentList aaa = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty)) {
					System.out.println(students[i]);
				}
			}
		return aaa ;
	}
	
	//bbb) списки студентов для каждого факультета и курса;
	public StudentList bbb (String faculty ,int course) {      
		StudentList bbb = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty) && students[i].getCourse()==course) {
					System.out.println(students[i]);
				}
			}
		return bbb ;
	}
	
	//ccc) список студентов, родившихся после заданного года;
	public StudentList ccc (int yearBorn) {
		StudentList ccc = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getYearBorn()>yearBorn) {
					System.out.println(students[i]);
				}
			}
		return ccc ;
	}
	
	//ddd) список учебной группы 
	public StudentList ddd (String group) {
		StudentList ddd = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getGroup().equals(group)) {
					System.out.println(students[i]);
				}
			}
		return ddd ;
	}
}
