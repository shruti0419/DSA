package GeeksForGeeks.Strings;

public class checkstring {
    Boolean check (String s)
    {
        
        char a = s.charAt (0);
    	for (int i = 1; i < s.length (); ++i)
    	{
    		if (s.charAt(i) != a)
    			return false;
    	}
    	return true;
    }  
}


