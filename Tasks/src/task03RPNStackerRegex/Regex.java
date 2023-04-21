package task03RPNStackerRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
		
		
		public static boolean isNum(String token) {
			
			//Pattern p = Pattern.compile("[+*/-]");
			//Matcher m = p.matcher(token);
			return token.matches("[+*/-]");
			
		}
		
		public static boolean isOP(String token) {
			
			//Pattern p = Pattern.compile("-?\\d+"); //Pesquisei sobre Pattern e Matcher e testei usa-los também
			//Matcher m = p.matcher(token);
			return token.matches("-?\\d+");
			
			
		}

	}
	

