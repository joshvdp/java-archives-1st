package JavaActivity02;
import java.util.HashMap;

public class IDandPIN 
{

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPIN ()
	{
	logininfo.put("111", "222");
	}
	
	protected HashMap getLoginInfo ()
	{
		return logininfo;
	}
}
