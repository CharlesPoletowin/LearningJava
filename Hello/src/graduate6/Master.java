package graduate6;
import java.text.NumberFormat;

public class Master extends Student implements Manageable{
	double aver;
	char thesislevel;

	public void setthesislevel(char a) {
		thesislevel=a;
	}
	
	public double computeAverage() {
		double sum=1;
		for (int i = 0; i < score.length; i++) {
			sum = sum*score[i];
		}
		aver=Math.pow(sum, 1.0/score.length);
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.print("¾ù·Ö");
        System.out.println(nf.format(aver));
		
		return aver;
	}

	public boolean getPass() {
		if ((aver>=80) && (thesislevel<='c')){
			return true;
		}
		else {
			return false;
		}

	}

	public String getDegree() {
		if (getPass()==true){
			System.out.println(Constants.ISSUE_MASTER_DEGREE);
			return Constants.ISSUE_MASTER_DEGREE;
		}
		else {
			System.out.println(Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE);
			return Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
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
		System.out.println("Score: ");
		for (int i = 0; i < sscore.length; i++) {
			System.out.print(sscore[i]+" ");
		}
		System.out.println();
	}
}