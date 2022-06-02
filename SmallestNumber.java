
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {30,16,6,81,62};    
	        int min = arr[0];  
	        for (int a = 0; a < arr.length;a++) {    
	           if(arr[a] <min)  
	               min = arr[a];  
	        }  
	        System.out.println("Smallest element array: " + min);  
	    }  
	}  
	


