package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	abstract class Exam{
		void print(){}
		
	}
	
	
	class Question extends Exam{
		   String description;
		   public Question(String desc) {
		      this.description = desc;
		   }
		   public void print() {
		      System.out.println(description);
		   }      
		}
}
