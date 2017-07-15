import java.util.*;  


class sizeComparator implements Comparator<HDTV>
{  
		public int compare(HDTV s1,HDTV s2)  
		{  
		if(s1.Size==s2.Size)  
				return 0;  
		else if(s1.Size>s2.Size)  
				return 1;  
		else  
				return -1;  
	}  
}  