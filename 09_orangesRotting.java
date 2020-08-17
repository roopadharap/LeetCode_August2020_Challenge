public int orangesRotting(int[][] grid) 
{
	int cnt = 2;
	boolean rot = false;
	
	while(true)
	{
		for(int i = 0; i<grid.length; i++)
		{
			for(int j=0; j<grid[0].length; j++)
			{
				if(grid[i][j] == cnt)
				{
					if(i-1 != -1 && grid[i-1][j] == 1)
					{
						grid[i-1][j] = grid[i][j] + 1;
						rot = true;
					}
					if(j-1 != -1 && grid[i][j-1] == 1)
					{
						grid[i][j-1] = grid[i][j] + 1;
						rot = true;
					}
					if(i+1 != grid.length && grid[i+1][j] == 1)
					{
						grid[i+1][j] = grid[i][j] + 1;
						rot = true;
					}
					if(j+1 != grid[0].length && grid[i][j+1] == 1)
					{
						grid[i][j+1] = grid[i][j] + 1;
						rot = true;
					}
				}
			}
		}
		
		if(!rot)
			break;
		
		rot = false;
		cnt++;
	}
	for(int i = 0; i<grid.length; i++)
	{
		for(int j=0; j<grid[0].length; j++)
		{
			if(grid[i][j] == 1)
				return -1;
		}
	}
	
	return cnt - 2;
}