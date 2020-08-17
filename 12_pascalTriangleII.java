public List<Integer> getRow(int rowIndex) 
{
	List<Integer> lst = new ArrayList();
	double n;
		
	lst.add(1);
	
	for(int i=1;i<=rowIndex;i++)
	{
		n = lst.get(i-1) * ((double)(rowIndex - i + 1) / i);
		lst.add((int)(Math.round(n)));
	}
	
	return lst;

}