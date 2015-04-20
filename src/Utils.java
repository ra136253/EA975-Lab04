import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {
	
	/*
	 * Validação de Data encontrada em: http://www.guj.com.br/657-validar-data-em-java
	 */
	public static Boolean validDate(String date) throws java.text.ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);

		try {
		  Date data = sdf.parse(date);
		  return true;
		} catch(ParseException e) {
		  return false;
		}
		
	}
	
	
	/*
	 * Validação de email encontrada em: http://www.guj.com.br/8002-validacao-de-email
	 */
	public static Boolean validEmail(String email){
		String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();		
	}
	
	
	/*
	 * Validação do CPF encontrada em: http://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
	 */
	public static Boolean validCPF(String CPF){
		
		 if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
			        CPF.equals("22222222222") || CPF.equals("33333333333") ||
			        CPF.equals("44444444444") || CPF.equals("55555555555") ||
			        CPF.equals("66666666666") || CPF.equals("77777777777") ||
			        CPF.equals("88888888888") || CPF.equals("99999999999") ||
			       (CPF.length() != 11))
			       return(false);

			    char dig10, dig11;
			    int sm, i, r, num, peso;


			    try {

			      sm = 0;
			      peso = 10;
			      for (i=0; i<9; i++) {                     
			        num = (int)(CPF.charAt(i) - 48); 
			        sm = sm + (num * peso);
			        peso = peso - 1;
			      }

			      r = 11 - (sm % 11);
			      if ((r == 10) || (r == 11))
			         dig10 = '0';
			      else dig10 = (char)(r + 48); 
			      
			      sm = 0;
			      peso = 11;
			      for(i=0; i<10; i++) {
			        num = (int)(CPF.charAt(i) - 48);
			        sm = sm + (num * peso);
			        peso = peso - 1;
			      }

			      r = 11 - (sm % 11);
			      if ((r == 10) || (r == 11))
			         dig11 = '0';
			      else dig11 = (char)(r + 48);

			      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
			         return(true);
			      else return(false);
			    } catch (InputMismatchException erro) {
			        return(false);
			    }

		
	}
	
	public static Boolean validPhone(String phone){
		String phonePattern = "\\+(\\d{1}|\\d{2}|\\d{3})[ -](([(](\\d{2}|\\d{3})[)])|(\\d{2}|\\d{3}))([0-9-]+)$";
		Pattern pattern = Pattern.compile(phonePattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();		
	}
	
	public static Boolean validCEP(String cep){
		String cepPattern = "[0-9]{5}-[0-9]{3}";
		Pattern pattern = Pattern.compile(cepPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cep);
        return matcher.matches();
	}
	
	public static Boolean validWord(String word){
		String wordPattern = "[A-Za-z ]+$";
		Pattern pattern = Pattern.compile(wordPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();		
	}

}
