package inheritanceDemo;

public class UserManager {
	public void add(User user)
	{
		System.out.println("Kullan�c� kaydedildi.");
	}
	public void update(User user)
	{
		System.out.println("Kullan�c� bilgileri ba�ar�yla g�ncellendi.");
	}
	public User getByEmail(String email,String password)
	{
		User user=new User();
		user.setFirstName("Hilal");
		user.setLastName("Ba�tan");
		return user;
	}
}
