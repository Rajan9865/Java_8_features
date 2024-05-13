package interview.prepration;

@FunctionalInterface  
interface AddInterface{  
    void add(int a, int b);  
}  
 
public class FunctionalInterfaceExample implements AddInterface {
	public void add(int a, int b){  
        System.out.println(a+b);  
    } 
	public static void main(String args[]){
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.add(155, 200);  
	}
}