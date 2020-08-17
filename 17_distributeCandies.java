public int[] distributeCandies(int candies, int num_people) 
{
	int [] arr = new int [num_people];
	
	int cnt = 1, i = 0;
	while(candies > 0)
	{
		if(candies < cnt)
			arr[i] = arr[i] + candies;
		else
			arr[i] = arr[i] + cnt;
		candies = candies - cnt;
		cnt++;
		i++;
		if(i == num_people)
			i = 0;
	}
	
	return arr;
}