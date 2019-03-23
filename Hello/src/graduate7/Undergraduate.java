package graduate7;

public class Undergraduate extends student implements Manageable {
	double aver;
	
	public double computeAverage() throws UndergraduateException {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i]<0) {
				throw new UndergraduateException();
			}
			sum += score[i];
		}
		aver=sum/score.length;
		System.out.println("¾ù·Ö"+aver);
		return aver;
	}
	public  boolean getPass() {
		if (aver>=60){
			return true;
		}
		else{
			return false;
		}
		
	}
	public  String getDegree() {
		if(getPass()==true) {
			System.out.println(Constants.ISSUE_UNDERGRADUATE_DEGREE);
			return Constants.ISSUE_UNDERGRADUATE_DEGREE;
		}
		else {
			System.out.println(Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE);
			return Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
		}
	}

	public void printInfo() {
		// TODO Auto-generated method stub		System.out.println("name: "+student.getname());
		System.out.println("studentid: "+this.getstuId());
		System.out.println("gender: "+this.getgender());
		System.out.println("school: "+this.getschool());
		System.out.println("category: "+this.getcategory());
		System.out.println("birthday: "+this.getbirthday());
		double[] sscore=this.getscore();
		System.out.println("Score:");
		for (int i = 0; i < sscore.length; i++) {
			System.out.println(sscore[i]);
		}
	}	
}
