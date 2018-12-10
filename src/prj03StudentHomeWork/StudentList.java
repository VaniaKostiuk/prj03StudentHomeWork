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
	/*	�������� ������� : (a,b,c,d) :
	 * 	a) ������ ��������� ��������� ����������;
		b) ������ ��������� ��� ������� ���������� � �����;
		c) ������ ���������, ���������� ����� ��������� ����;
		d) ������ ������� ������ 
	*/
	
	public StudentList a (String faculty) {
		StudentList a = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty)) {
					System.out.println(students[i]);
				}
			}
		return a ;
	}
	public StudentList b (String faculty ,int course) {
		StudentList b = new StudentList ();
		for (int i = 0; i < size(); i++) {
				if(students[i].getFaculty().equals(faculty) && students[i].getCourse()==course) {
					System.out.println(students[i]);
				}
			}
		return b ;
	}

}
