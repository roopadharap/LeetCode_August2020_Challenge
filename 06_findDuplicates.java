public List<Integer> findDuplicates(int[] nums) 
{
	List<Integer> lst = new ArrayList<>();
	
	if(nums.length == 0)
		return lst;
	
	int [] arr = new int [nums.length];
	
	for(int i=0; i<nums.length; i++)
	{
		arr[nums[i]-1]++;
		if(arr[nums[i]-1] > 1)
			lst.add(nums[i]);
	}
	
	return lst;
}