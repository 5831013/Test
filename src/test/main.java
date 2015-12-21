package test;
// D0280300 陳冠州

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
		//examination 裡包括 exam(也就是examination或Question),所以examination能產生1到多個Question
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
