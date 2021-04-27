package javawork;

public class CourseManager {



	public void Start(Course course) {
		System.out.println("kursa baslandi:" + course.name);
		
	}
	public void Continue(Course course) {
		System.out.println("Kursa Devam Ediliyor:"+ course.name);
	}
	
	public void Finish(Course course) {
		System.out.println("Kursun Zamaný Doldu:"+ course.name);
	}
}
