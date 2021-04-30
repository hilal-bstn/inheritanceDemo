package inheritanceDemo;

public class UserManager {
	public void add(User user)
	{
		System.out.println("Kullanýcý kaydedildi.");
	}
	public void update(User user)
	{
		System.out.println("Kullanýcý bilgileri baþarýyla güncellendi.");
	}
	public User getByEmail(String email,String password)
	{
		User user=new User();
		user.setFirstName("Hilal");
		user.setLastName("Baþtan");
		return user;
	}
}
