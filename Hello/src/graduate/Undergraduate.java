package graduate;

public class Undergraduate extends Student{
	private double aver;
	public double computeAverage() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		aver=sum/score.length;
		return aver;
	}
	public  Boolean getPass() {
		if (computeAverage()>=60){
			return true;
		}
		else{
			return false;
		}
	}
	public  String getDegree() {
		if(getPass()) {
			return "Undergraduate";
		}
		else {
			return "None";
		}
	}
}
