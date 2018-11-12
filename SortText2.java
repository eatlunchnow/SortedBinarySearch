import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortText2 {
	
		public static void main(String[] args) {	
			Scanner file = null; 
			ArrayList<Integer> list = new ArrayList<Integer>();
			Scanner file2 = null;
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			
			try {
				file = new Scanner(new File("C:\\Users\\Kiki\\Documents\\BS_Nums1.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			while(file.hasNext()){
				if (file.hasNextInt()) list.add(file.nextInt());
				else file.next();
			}
			
			Collections.sort(list);
			
		
		try {
			file2 = new Scanner(new File("C:\\Users\\Kiki\\Documents\\BS_Nums2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		while(file2.hasNext()){
			if (file2.hasNextInt()) list2.add(file2.nextInt());
			else file2.next();
		}	
		
		
		for(int i = 0; i < list2.size(); i++){
		    int valueToSearch = list2.get(i);
		    
		    int index = Collections.binarySearch(list, valueToSearch);
		    
		    if(index < 0 || index >= list.size()){
		        System.out.println("Element " + list2.get(i) + " not found");
		    }
		    else{
		        System.out.println("Element " + list2.get(i) + " found at index " + index);
		    }
		}
}
}