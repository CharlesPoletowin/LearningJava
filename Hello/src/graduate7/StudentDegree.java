package graduate7;

public class StudentDegree{
	public void issueDegree(Manageable manage) {
		manage.printInfo();
		try{
			manage.computeAverage();
		} catch(MasterException e) {
			e.warnMess();
		} catch(UndergraduateException e) {
			e.warnMess();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
