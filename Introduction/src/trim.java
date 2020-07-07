import java.util.Arrays;
import java.util.List;

public class trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[] = { "jitomate - Kg", "fresa - Kg" };

		List<String> arrayAsList = Arrays.asList(array);
		String[] name = arrayAsList.get(0).toString().split("-");
		String formattedName = name[0].trim();

		System.out.println(formattedName + name);

		// System.out.println(arrayAsList.get(0).trim());
		// System.out.println(array[1].toString().trim());
		// System.out.println(name);

		String attributes = "palabra, palabra2, palabra3";

		String[] attributes_split = attributes.split(",");
		String   nameTrim=attributes_split[0].trim();
		
		System.out.println(nameTrim=attributes_split[0].trim());
		System.out.println(nameTrim=attributes_split[1].trim());
		System.out.println(nameTrim=attributes_split[2].trim());
		
		
		
		
		
		String attributes2 = "palabra1,palabra2,palabra3";
		String[] name1 = attributes2.trim().split(",");
		for (int i = 0; i < attributes2.length(); i++) {

			System.out.println(name1[i]);
			break;

		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			if(i==3) {System.out.println("el numero es tres");
			//break;
			}
			
			
			
			
			String cadena= "palabra1,palabra2,palabra3";
			//a cadena le aplico un trim y split
			
			String[] elemento=cadena.trim().split(",");
			System.out.println(elemento[0]);
			System.out.println(elemento[1]);
			System.out.println(elemento[2]);
			
			
			String string="palabra1, palara2,palabvra3";
			String[] fragmanto=string.trim().split(",");
			System.out.println(fragmanto[0]);
			System.out.println(fragmanto[1]);
			System.out.println(fragmanto[2]);
			
			
		}	
	}

}
