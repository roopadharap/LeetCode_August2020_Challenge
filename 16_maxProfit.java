public int maxProfit(int[] prices) 
{
	int b1 = Integer.MAX_VALUE, b2 = Integer.MAX_VALUE, p1 = 0, p2 = 0;
	
	for(int i=0; i<prices.length; i++)
	{
		b1 = Math.min(b1, prices[i]);
		p1 = Math.max(p1, prices[i] - b1);
		b2 = Math.min(b2, prices[i] - p1);
		p2 = Math.max(p2, prices[i] - b2);
	}
	
	return p2;
}