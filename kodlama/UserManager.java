package kodlama;

public class UserManager {
	public void login(User user) {
		System.out.println(user.firstName+user.lastName+" Kullanýcýsý giriþ yaptý");
	}
	public void register(User user) {
		System.out.println(user.firstName+user.lastName+" Yeni kullanýcý oluþturuldu");
	}
	public void printUserInfo(User user) {
		System.out.println(user);
	}
}
