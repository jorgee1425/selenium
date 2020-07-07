import java.util.Arrays;
import java.util.List;

public class arrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] array= {"a","b","c","d","d","e","f"};
		
		List  arrayTolist=Arrays.asList(array);
		
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(arrayTolist.get(i));	
		}
		
		
		

	}

}
