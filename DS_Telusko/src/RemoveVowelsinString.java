import java.util.Arrays;
import java.util.List;

public class RemoveVowelsinString {

	public static void main(String[] args) {

		System.out.println("After Removal of Vowels in a string: "+removeVowels("manjunatha"));
		
	}

	private static String removeVowels(String string) {
		
		Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		
		List<Character> vowelList = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(string);
		
		for (int i=0;i<sb.length();i++)
		{
			if(vowelList.contains(sb.charAt(i)))
			{
				sb.replace(i, i+1, "");
				i--;
			}
		}
		
		return sb.toString();
	}

}
