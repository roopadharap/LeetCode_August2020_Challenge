public int longestPalindrome(String s) 
{
	int [] ucase = new int [26];
	int [] lcase = new int [26];
	int len = 0;
	
	if(s == null || s.length() == 0)
		return 0;
	
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		{
			ucase[s.charAt(i) - 'A']++;
			if(ucase[s.charAt(i) - 'A']%2 == 0)
				len = len + 2;
				
		}
		else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		{
			lcase[s.charAt(i) - 'a']++;
			if(lcase[s.charAt(i) - 'a']%2 == 0)
				len = len + 2;
		}
	}
	
	if(s.length() > len)
		len++;
	
	return len;
}