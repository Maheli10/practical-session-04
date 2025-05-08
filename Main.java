class person{
	
private String name;

//Getter

public String getName(){
	return name;
	
}

//setter

public void setName(String newName){
	this.name=newName;
}
}

public class Main{
	public static void main(String[] args){
		person p1=new person();
		p1.setName("John");
		System.out.println(p1.getName());
		
	}
}