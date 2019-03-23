package graduate7;

public class UndergraduateException extends Exception{
	/**
	 * 设计一个继承 Exception 的异常类 UndergraduateException ，用于捕获大学生异常
	 */
	private static final long serialVersionUID = 1L;
	String massage="Your grades may be wrong!";
	
	public String warnMess() {
		return massage;
		
	}

}
