package basicProgram;

public class VariableLearning {
	
	public static void calculator() {
		System.out.println("do calculation");
	}
public void calc() {
	int t,z,a;
	t=10;
    a=10;
    z=t+a;
    System.out.println(z);
}
public static void main (String []args) {
	calculator();
	VariableLearning B= new VariableLearning();
	B.calc();
		
}
}