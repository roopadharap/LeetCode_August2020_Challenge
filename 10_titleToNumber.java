public int titleToNumber(String s) 
{
	if(s == null)
		return 0;
	
	int val = 0, c = 26, index = 0;
	
	for(int i=s.length()-1; i>=0; i--)
	{
		int n = s.charAt(i) - 'A';
		
		val = val + ((n+1) * (int)Math.pow(c,index));
		index++;
	}
	
	return val;
}