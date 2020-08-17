public int eraseOverlapIntervals(int[][] intervals) 
{
	if(intervals == null || intervals.length == 0)
		return 0;
	
	Arrays.sort(intervals, (a,b)->a[0] - b[0]);
	
	int removeIntervals = 0;
	int prevStart, prevEnd, currStart, currEnd;
	
	prevStart = intervals[0][0];
	prevEnd = intervals[0][1];
	
	for(int i=1; i<intervals.length; i++)
	{
		currStart = intervals[i][0];
		currEnd = intervals[i][1];
		
		if(currStart < prevEnd)
		{
			prevEnd = Math.min(prevEnd, currEnd);
			removeIntervals++;
		}
		else
		{
			prevStart = currStart;
			prevEnd = currEnd;
		}
			
	}
	
	return removeIntervals;
	
}