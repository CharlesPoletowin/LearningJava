package graduate;

abstract class Student {
	private String name;
	private char gender;
	private String birthDay;
	private String school;
	private String stuId;
	private String category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double[] getScore() {
		return score;
	}
	public void setScore(double[] score) {
		this.score = score;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	double[] score;
	boolean status;
	public void set(String n,char a,String b,String c,String d,String e, double[] f,boolean g) {
		this.name=n;
		this.gender=a;
		this.birthDay=b;
		this.school=c;
		this.stuId=d;
		this.category=e;
		this.score=f;
		this.status=g;
	}

	public abstract double computeAverage();
	public abstract Boolean getPass();
	public abstract String getDegree();
}
