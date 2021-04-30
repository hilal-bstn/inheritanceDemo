package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		
		Student student=new Student();
		
		student.setId(1);
		student.setFirstName("Hilal");
		student.setLastName("Baştan");
		student.setEmail("Hilal@");
		student.setPassword("12354");
		
		userManager.add(student);
        
		student.setEmail("hb@");
        userManager.update(student);
        
        User result=userManager.getByEmail(student.email,student.password);
        System.out.println(result.firstName+" "+result.lastName);
	}

}
