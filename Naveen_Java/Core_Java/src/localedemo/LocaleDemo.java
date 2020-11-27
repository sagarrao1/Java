package localedemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		String lang="te";
		String country="IN";
		
		Locale l=new Locale(lang, country);
		ResourceBundle r =ResourceBundle.getBundle("localedemo/Bundle", l);
		String str= r.getString("wish");
		System.out.println(str);

	}

}
