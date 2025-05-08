class student{
	String name="Adam";
	int marks=100;


	student(){
		name="no name";
	}

	student(String n,int m){
		name=n;
		marks=m;
	}
}



class studentDemo{
	public static void main(String[] args){
		System.out.println("Hi from studentDemo class");
		System.out.println("Creating an object from student class");
		student s1=new student("nice name",10);
		System.out.println("Created an object of student class");
		System.out.println("Name value of the object is "+s1.name );
		System.out.println("Marks value of the object is "+s1.marks );
		s1.name="Bob"; //setting the variable
		s1.marks=50;
		
		System.out.println("Name value of the object is "+s1.name );
		System.out.println("Marks value of the object is "+s1.marks );
	}
}