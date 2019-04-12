



package instanceVariable;

public class instanceVariable {
	public String name; //instance variable is visible for any child class.
	private int age;  //this instance age variable is visible in Record class only.
	
	public instanceVariable(String rename){ name = rename;}
	public void setAge( int reAge){ age = reAge;}
	
	public void printRec(){
		System.out.println(" name: " + name);
		System.out.println(" age : " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		instanceVariable r = new instanceVariable("salah");
		
		r.setAge(25);
		r.printRec();
		
		

	}

}
