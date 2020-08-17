public boolean detectCapitalUse(String word) 
{
	if(word.length() == 0)
		return true;
	
	boolean firstChar = false;
	int smalls = 0, caps = 0;
	
	for(int i=0; i<word.length(); i++)
	{
		if(i == 0 && (word.charAt(i) >= 'A' &&  word.charAt(i) <= 'Z'))
		{
			firstChar = true;
		}
		
		if(i > 0)
		{
			if(word.charAt(i) >= 'A' &&  word.charAt(i) <= 'Z')
				caps++;
			else if(word.charAt(i) >= 'a' &&  word.charAt(i) <= 'z')
				smalls++;
		}
	}
	
	if(firstChar && ((smalls == word.length()-1) || (caps == word.length()-1)))
	   return true;
	else if(!firstChar && smalls == word.length()-1)
	   return true;
	   
	return false;
}