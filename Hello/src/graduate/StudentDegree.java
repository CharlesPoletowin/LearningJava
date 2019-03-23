package graduate;

public class StudentDegree {
	public void printStudentInfo(Student s) {
		System.out.println("Name:"+s.getName()+"  ID:"+s.getStuId()+"  gender:"+s.getGender());
		System.out.println("School:"+s.getSchool()+"  categorgy:"+s.getCategory()+"  birthday:"+s.getBirthDay()+" average grade:"+s.computeAverage());
		double[] sscore=s.getScore();
		System.out.print("Score:");
		for (int i = 0; i < sscore.length; i++) {
			System.out.print(sscore[i]+",");
		}
	}
	public void issueDegree(Student s) {
		System.out.println("GetDegree or not?  "+s.getDegree());
		System.out.println(" ");
	}
}
