package graduate7;

public class MasterException extends Exception {
	/**
	 * 设计一个继承 Exception 的异常类 MasterException ， 用于捕获硕士研究生异常，
	 */
	private static final long serialVersionUID = 1L;
	String massage="Your grades may be wrong!";
	 
	 public String warnMess() {
		 return massage;
	 }

}
