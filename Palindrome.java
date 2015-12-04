
public class Palindrome {
	public static boolean palindrome(String str)
	{
	    if (str.length()==1 || str.length == 0)
	    return true;
	    char c1 = str.charAt(0);
	    char c2 = str.charAt(str.length() - 1);
	    if (str.length() == 2)
	    {
	        if (c1 == c2)
	        return true;
	        else
	        return false;
	    }
	    if (c1 == c2)
	    return palindrome(str.substring(1,str.length() - 1));
	    else
	    return false;
	}
}
