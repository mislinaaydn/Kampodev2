package kodlama;

public class UserManager {
	public void login(User user) {
		System.out.println(user.firstName+user.lastName+" Kullan�c�s� giri� yapt�");
	}
	public void register(User user) {
		System.out.println(user.firstName+user.lastName+" Yeni kullan�c� olu�turuldu");
	}
	public void printUserInfo(User user) {
		System.out.println(user);
	}
}
