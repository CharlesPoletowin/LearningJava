package graduate7;

abstract class student {
	 String name;
	 char gender;
	 String birthDay;
	 String school;
	 String stuId;
	 String category;
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

	public String getname() {
		 return name;
	 }
	 public char getgender() {
		 return gender;
	 }
	 public String getbirthday(){ 
		 return birthDay;
	 }
	 public String getschool() {
		 return school;
	 }
	 public String getstuId() {
		 return stuId;
	 }
	 public String getcategory() {
		 return category;
	 }
	 public double[] getscore() {
		 return score;
	 }
	 public Boolean getstatus() {
		 return status;
	 }
	 //public abstract double computeAverage();
	 //public abstract Boolean getPass();
	 public abstract String getDegree();
		// TODO Auto-generated method stub
		
	}

