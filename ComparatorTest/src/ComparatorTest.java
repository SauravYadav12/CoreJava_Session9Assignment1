import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HDTV> al=new ArrayList<HDTV>();  //Creating new array list
		
		//Creating 3 objects to compare
		al.add(new HDTV("Sony",55));  
		al.add(new HDTV("Samsung",21));  
		al.add(new HDTV("LG",43));  
		  
		System.out.println("Sorting by Size...");  
		  //Sorting by size
		Collections.sort(al,new sizeComparator());  
		for(HDTV st: al){  
		System.out.println(st.Brandname+" "+st.Size);  
		}  

	}

}
