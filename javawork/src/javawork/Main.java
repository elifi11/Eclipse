package javawork;

public class Main{
	public static void main(String[]args) {
		Course course1 =new Course ();
		course1.id=1;
		course1.name="Yazılım Gelistirici Kampı c#";
		course1.teacher="Engin Demirog";
		course1.percent=36;
		
		
		
	
		
		
		Course course2 =new Course ();
		course2.id=2;
		course2.name="Yazılım Gelistirici Kampı Java";
		course2.teacher="Engin Demirog";
		course2.percent=44;
		
		Course[] courses= {course1,course2
				
		};
		for (Course course:courses) {
			System.out.println(course.name+ course.id+course.teacher+course.percent);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.Finish(course1);
		courseManager.Start(course1);
		courseManager.Continue(course2);
	}

	
	
	
}
