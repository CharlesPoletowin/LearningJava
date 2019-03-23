package graduate;

public class Master extends Student{
	private double aver;
	private char thesislevel;
	public void setthesislevel(char a) {
		thesislevel=a;
	}
	public double computeAverage() {
		double sum=1;
		for (int i = 0; i < score.length; i++) {
			sum = sum*score[i];
		}
		aver=Math.pow(sum, 1.0/score.length);
		return aver;
	}
	public Boolean getPass() {
		if ((computeAverage()>=80) && (thesislevel<='c')){
			return true;
		}
		else {
			return false;
		}
	}
	public String getDegree() {
		if (getPass()==true){
			return "Master";
		}
		else {
			return "None";
		}
	}
}
