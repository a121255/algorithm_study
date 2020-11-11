package ndb.DAY1102;

class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	@Override
	public int compareTo(Student other) {
		if(this.score < other.score) {
			return -1;
		}
		return 1;
	}
}


public class 성적 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
