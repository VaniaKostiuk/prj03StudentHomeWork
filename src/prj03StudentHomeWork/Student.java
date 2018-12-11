package prj03StudentHomeWork;

public class Student {
	private int id ;
	private String surname ;
	private String name ;
	private String patronymic ;
	private int dayBorn ;
	private int monthBorn ;
	private int yearBorn ;
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
	public int getDayBorn() {
		return dayBorn;
	}
	public void setDayBorn(int dayBorn) {
		this.dayBorn = dayBorn;
	}
	public int getMonthBorn() {
		return monthBorn;
	}
	public void setMonthBorn(int monthBorn) {
		this.monthBorn = monthBorn;
	}
	public int getYearBorn() {
		return yearBorn;
	}
	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
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
	public Student(int id, String surname, String name, String patronymic, int dayBorn, int monthBorn, int yearBorn,
			String address, int number, String faculty, String group, int course) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.dayBorn = dayBorn;
		this.monthBorn = monthBorn;
		this.yearBorn = yearBorn;
		this.address = address;
		this.number = number;
		this.faculty = faculty;
		this.group = group;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", dayBorn=" + dayBorn + ", monthBorn=" + monthBorn + ", yearBorn=" + yearBorn + ", address="
				+ address + ", number=" + number + ", faculty=" + faculty + ", group=" + group + ", course=" + course
				+ "]";
	}
	
}
