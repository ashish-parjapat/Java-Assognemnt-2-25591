
class Cse{
    int total_student;
    int total_subjects;
    String java_teacher;
    Cse(int total_student,int total_subjects,String java_teacher){
        this.total_student=total_student;
        this.total_subjects=total_subjects;
        this.java_teacher=java_teacher;
    }
}





public class Main
{
	public static void main(String[] args) {
	    Cse obj1=new Cse(75,6,"Dhiraj Kumar Sahnai");
	      Cse obj2=new Cse(75,6,"Dhiraj Khurana");
	System.out.println(obj1.equals(obj2));
	}
}
