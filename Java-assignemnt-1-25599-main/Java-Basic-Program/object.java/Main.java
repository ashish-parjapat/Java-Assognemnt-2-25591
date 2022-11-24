
class comuputer_networks{
    int total_chapters;
    int total_lectues;
    String teacher_name;
    comuputer_networks(int total_chapters,int total_lectues,String teacher_name){
        this.total_chapters=total_chapters;
        this.total_lectues=total_lectues;
        this.teacher_name=teacher_name;
    }
}

public class Main
{
	public static void main(String[] args) {
		comuputer_networks obj=new comuputer_networks(4,20,"Haresh");
	}
}
