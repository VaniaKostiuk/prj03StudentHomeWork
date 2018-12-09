package prj03StudentHomeWork;

public class Student {
	private int id ;
	private String surname ;
	private String name ;
	private String patronymic ;
	private String dateBorn ;
	private String address ;
	private int number ;
	private String faculty ;
	private String group ;
	private int course ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getDateBorn() {
		return dateBorn;
	}
	public void setDateBorn(String dateBorn) {
		this.dateBorn = dateBorn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public Student(int id, String surname, String name, String patronymic, String dateBorn, String address, int number,
			String faculty, String group, int course) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.dateBorn = dateBorn;
		this.address = address;
		this.number = number;
		this.faculty = faculty;
		this.group = group;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", dateBorn=" + dateBorn + ", address=" + address + ", number=" + number + ", faculty=" + faculty
				+ ", group=" + group + ", course=" + course + "]";
	}
	
}
