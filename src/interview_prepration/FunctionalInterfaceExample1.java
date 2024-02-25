package interview_prepration;

@FunctionalInterface  
interface AddInterface1{  
    void add(int a, int b);  
 
    //It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
 
public class FunctionalInterfaceExample1 implements AddInterface {
	public void add(int a, int b){  
        System.out.println(a+b);  
    } 
	public static void main(String args[]){
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.add(10, 20);  
	}
}