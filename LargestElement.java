package Sum;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {30,16,4,81,58};    
        int max = arr[0];  
        for (int a = 0; a < arr.length;a++) {  
           if(arr[a] > max)  
               max = arr[a];  
        }  
        System.out.println("Largest element array: " + max);  
    }  
}  
	


