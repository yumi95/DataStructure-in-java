package Day1;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	public static final Comparator<Student> WITH_NAME = new WithName();
	public static final Comparator<Student> WITH_DEPT = new WithDept();
	public static final Comparator<Student> WITH_GRADE = new WithGrade();
	
	private int ID;
	private String name;
	private String dept;
	private int grade;
	
	// 생성자 초기화
	public Student(int IDIn, String nameIn, String deptIn, int gradeIn) {
		ID = IDIn;
		name = nameIn;
		dept = deptIn;
		grade = gradeIn;
	}
	public int getID() { return ID; }
	public String getName() { return name; }
	public String getDept() { return dept; }
	public int getGrade() { return grade; }
	
	// 오버라이딩
	public static class WithName implements Comparator<Student> {
		// 이름으로 비교하는 compare()
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	}
	public static class WithDept implements Comparator<Student> {
		// 학과 이름으로 비교하는 compare()
		public int compare(Student s1, Student s2) {
			return s1.dept.compareTo(s2.dept);
		}
	}
	public static class WithGrade implements Comparator<Student> {
		// 학년으로 비교하는 compare()
		public int compare(Student s1, Student s2) {
			return s1.grade-s2.grade;
		}
	}
	public int compareTo(Student s1) {
		// 학번으로 비교하는 compareTo()
		return this.ID - s1.ID;
	}
}
