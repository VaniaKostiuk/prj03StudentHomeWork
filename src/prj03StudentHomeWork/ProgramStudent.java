package prj03StudentHomeWork;

public class ProgramStudent {

	public static void main(String[] args) {
		/*	Ќазвание методов : (aaa,bbb,ccc,ddd) :
		 * 	aaa) список студентов заданного факультета;
			bbb) списки студентов дл€ каждого факультета и курса;
			ccc) список студентов, родившихс€ после заданного года;
			ddd) список учебной группы 
		*/
	
	StudentList studentList = new StudentList ();
	studentList.add(new Student (0001, "Kostiuk", "Ivan", "Victorovic", 7, 10, 1992, "Kiev", 931145207, "IRSZT", "01", 5));
	studentList.add(new Student (0002, "Kostiu", "Viktor", "Victorovi", 8, 10, 1993, "Kiev", 931145208, "UZ", "01", 3));
	studentList.add(new Student (0003, "Kosti", "Den", "Victoro", 12, 2, 1995, "Kiev", 931145209, "KIKS", "01", 5));
	studentList.add(new Student (0004, "Kost", "Sar", "Victor", 12, 1, 1995, "Kiev", 931145210, "TEH", "02", 1));
	studentList.add(new Student (0005, "Kos", "Coss", "Victo", 15, 11, 1992, "Kiev", 931145211, "IRS", "01", 1));
	
	StudentList facIRSZT = studentList.aaa("IRSZT");
	facIRSZT.print();
	System.out.println("******************************");
	
	StudentList facTENcourse1 = studentList.bbb("TEH", 1);
	facTENcourse1.print();
	System.out.println("******************************");
	
	StudentList Year1992 = studentList.ccc(1992);
	Year1992.print();
	System.out.println("******************************");
	
	StudentList Group01 = studentList.ddd("01");
	Group01.print();

	}
}
