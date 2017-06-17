package anagram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class AnaCheck {
	
	

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String[] input = { "listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what",
	                "shit" };
	        String[] newArr = new String[input.length];
	        
	        
	        //sort and store in an new array
	        for (int index = 0;index<input.length;index++) {
	            char[] ar = input[index].toCharArray();
	            Arrays.sort(ar);
	            String a = new String(ar);
	            newArr[index] = a;                        
	        }

	        //search matches and create sets
	        for (int index1=0; index1<newArr.length;index1++) {
	            List<String> array = new ArrayList<String>();
	            
	            for(int index2=0;index2<newArr.length;index2++){
	                if(newArr[index1].equals(newArr[index2])){
	                    //System.out.print(input[index2]);
	                    array.add(input[index2]);
	                }
	                
	            }
	            
	            for(String element: array){
	                System.out.print(element + " ");
	            }
	            
	            
	            System.out.print("\n-----\n" );
	        }
	    }

	}	
	
