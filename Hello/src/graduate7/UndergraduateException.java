package graduate7;

public class UndergraduateException extends Exception{
	/**
	 * ���һ���̳� Exception ���쳣�� UndergraduateException �����ڲ����ѧ���쳣
	 */
	private static final long serialVersionUID = 1L;
	String massage="Your grades may be wrong!";
	
	public String warnMess() {
		return massage;
		
	}

}
