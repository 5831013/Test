package test;
// D0280300 ���a�{

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	void prex(Exam c) // client
	{
		c.print();
	}
	
	abstract class Exam{//COMPONENT
		void print(){}
		
	}
	class Examination extends Exam{//composite  
		//examination �̥]�A exam(�]�N�Oexamination��Question),�ҥHexamination�ಣ��1��h��Question
		  Exam c;  
		   public Examination(Exam desc) {
		      this.c = desc;
		   }
		   public void print() {
		    c.print();
		   }      
		}
	
	class Question extends Exam{//leaf
		   String description;
		   public Question(String desc) {
		      this.description = desc;
		   }
		   public void print() {
		      System.out.println(description);
		   }      
		}
}
