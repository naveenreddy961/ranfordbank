package module;

import pagelibrary.LoginPage;

public class login_module
{
	public static void login_exe(String u,String p)
	{
		LoginPage.Username.sendKeys(u);
		LoginPage.password.sendKeys(p);
		LoginPage.Login.click();
	}
}
