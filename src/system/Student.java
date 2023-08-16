package system;


public class Student {
	private int id;
	private String name;
	private String course;
	private double fee_paid;
	
	public Student(){
	
	}
	
	public Student(String name,String course,double fee_paid, int id){
		this.id=id;
		this.name=name;
		this.course=course;
		this.fee_paid=fee_paid;
	}
	
	public int get_id(){
		return id;
	}
	public String get_name(){
		return name;
	}
	public String get_course(){
		return course;
	}
	public double get_fee_paid(){
		return fee_paid;
	}
	
	public void set_id(int id){
		this.id=id;
	}
	
	public void set_name(String name){
		this.name=name;
	}
	public void set_course(String course){
		this.course=course;
	}
	public void set_fee_paid(double fee_paid){
		this.fee_paid=fee_paid;
	}
	
	public String toString(){
		return "Student [id = "+id+", name = "+name+", course = "+course+", fee_paid = "+fee_paid+"]";
	}

}


