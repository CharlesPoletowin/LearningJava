package graduate7;

public class MasterException extends Exception {
	/**
	 * ���һ���̳� Exception ���쳣�� MasterException �� ���ڲ���˶ʿ�о����쳣��
	 */
	private static final long serialVersionUID = 1L;
	String massage="Your grades may be wrong!";
	 
	 public String warnMess() {
		 return massage;
	 }

}
