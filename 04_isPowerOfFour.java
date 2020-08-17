public boolean isPowerOfFour(int num) 
{
	if(num <= 0)
		return false;
	
	int rem = 0;
	
	while(num > 1)
	{
		rem = num % 4;
		num = num / 4;
		
		if(rem > 0)
			return false;
	}
	
	if(num == 1)
		return true;

	return false;
}