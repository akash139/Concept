package TCS;

public class CloneableCOncept implements Cloneable {
	int rollNo;
	int marks;
	public CloneableCOncept(int x, int y){
	this.rollNo = x; 	
	this.marks = y; 	
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
	int a = 10;
	int b = 20;
	CloneableCOncept s = new CloneableCOncept(a,b);
	CloneableCOncept s2 = (CloneableCOncept)s.clone();
	System.out.println(s+"\n"+s2);

	}

}
