package graduate6;

public class StudentApplication {
	public static void main(String args[]) {
		Student stdt;
		Undergraduate st=new Undergraduate();
		double[] stscore= {89.5, 82, 87, 73};
		st.set("王小二",
		 '男',"1996-06-01","上海大学","11128981","大学本科生",stscore,false);
		Master ms =new Master();
		double[] msscore= {70, 52.5, 95, 88, 89, 91};
		ms.set("李燕",'女',"1991-6-12","上海大学","10306","硕士研究生",msscore,false);
		ms.setthesislevel('B');
		StudentDegree studentDegree=new StudentDegree();
		studentDegree.issueDegree(st);
		studentDegree.issueDegree(ms);
		
	}

}