package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexCHK {
	public boolean checkInt(String str) {
		String reg = "^[0-9]*[1-9][0-9]*$";
		Pattern pattern1 = Pattern.compile(reg);
		Matcher matcher1 = pattern1.matcher(str);
		return matcher1.matches();
	}
	public boolean checkPhoneNumber(String str) {
		String reg ="1[3|4|5|8|9][0-9]\\d{8}";
		Pattern pattern2 = Pattern.compile(reg);
		Matcher matcher2 = pattern2.matcher(str);
		return matcher2.matches();
	}
	public boolean checkEmail(String str) {
		String reg ="^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w{2,3}){1,3})$";
		Pattern pattern3 = Pattern.compile(reg);
		Matcher matcher3 = pattern3.matcher(str);
		return matcher3.matches();
	}
	public boolean checkMailCode(String str) {
		String reg="[1-9]\\d{5}(?!\\d)";
		Pattern pattern4 = Pattern.compile(reg);
		Matcher matcher4 = pattern4.matcher(str);
		return matcher4.matches();
	}
	public boolean checkId(String str) {
		String reg="^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		Pattern pattern5 = Pattern.compile(reg);
		Matcher matcher5 = pattern5.matcher(str);
		return matcher5.matches();
	}
	
	public static void main(String args[]) {
		RegexCHK R=new RegexCHK();	
		System.out.print("²âÊÔÕıÕûÊı 3	");
		System.out.println(R.checkInt("3"));
		System.out.print("²âÊÔÕıÕûÊı -2	");
		System.out.println(R.checkInt("-2"));
		System.out.print("²âÊÔÕıÕûÊı 0	");
		System.out.println(R.checkInt("0"));
		System.out.println("------------------");
		System.out.print("²âÊÔÊÖ»úºÅ 18888888888	");
		System.out.println(R.checkPhoneNumber("18888888888"));
		System.out.print("²âÊÔÊÖ»úºÅ 19999999999	");
		System.out.println(R.checkPhoneNumber("19999999999"));
		System.out.print("²âÊÔÊÖ»úºÅ 10000000000	");
		System.out.println(R.checkPhoneNumber("10000000000"));
		System.out.println("------------------");
		System.out.print("²âÊÔÓÊÏäser@163.com	");
		System.out.println(R.checkEmail("ser@163.com"));
		System.out.print("²âÊÔÓÊÏäser@gov	");
		System.out.println(R.checkEmail("ser@gov"));
		System.out.println("------------------");
		System.out.print("²âÊÔÓÊ±à200000	");
		System.out.println(R.checkMailCode("200000"));
		System.out.print("²âÊÔÓÊ±à12000	");
		System.out.println(R.checkMailCode("12000"));
		System.out.println("------------------");
		System.out.print("²âÊÔÉí·İÖ¤ºÅ310000000000000000	");
		System.out.println(R.checkId("310000000000000000"));
		System.out.print("²âÊÔÉí·İÖ¤ºÅ310107199911112222	");
		System.out.println(R.checkId("310107199911112222"));
	}
}
