package graduate;

public class StudentApplication {
	public static void main(String args[]) {
		Student stdt;
		Undergraduate st=new Undergraduate();
		double[] stscore= {89.5, 82, 87, 73};
		st.set("��С��",'��',"1995-06-01","�Ϻ���ѧ","11128981","��ѧ������",stscore,false);
		Master ms =new Master();
		double[] msscore= {70, 52.5, 95, 88, 89, 91};
		ms.set("����",'Ů',"1991-6-12","�Ϻ���ѧ","10306","˶ʿ�о���",msscore,false);
		ms.setthesislevel('B');
		StudentDegree sd=new StudentDegree();
		sd.printStudentInfo(st);
		sd.issueDegree(st);
		sd.printStudentInfo(ms);
		sd.issueDegree(ms);
		stdt=st;
		sd.printStudentInfo(stdt);
		sd.issueDegree(stdt);
		stdt=ms;
		sd.printStudentInfo(stdt);
		sd.issueDegree(stdt);
	}
}