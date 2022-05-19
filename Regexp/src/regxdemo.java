import java.util.regex.Matcher;
import java.util.regex.Pattern;

//program to extract values from text using regular expression
public class regxdemo {
	
	public static void main(String[] args) {
		
		//using compile method of pattern to compile Regex passed as string
		Pattern p = Pattern.compile("\\d+");
		
		//it performs match operations on a character sequence by interpreting pattern
		Matcher m = p.matcher("aa123abc456xyz");
		
		while(m.find())  
		{
			//it returns matched input sequence in the form of string
			System.out.println(m.group());
		}
		
	}

}
