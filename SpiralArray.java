class SpiralArray
{
	public static void main(String a[])
{
    int arrs[][] = new int[][]{ { 1, 2, 3, 4, 5},
                            { 16,17,18,19,6},
                            { 15,24,25,20,7},
                            {14,23,22,21, 8},
                            {13,12,11,10, 9}
                          };
int col=arrs.length;
    // Four direction counters of current movement
    // Horizontal right, vertical bottom, horizontal left and vertical top respectively
    int r, b, l, t;
	int count=0,steps=17;
    // levl indicates current depth of our imaginary rectangle into array. Starting value is zero
    // since we are looping on the boundaries and ending value is the inner most rectangle
    int level;
    int arr[]=new int[2];
    for (level=0; level < col-level; level++)
    {
        for(r=level; r < col-level; r++)   // go right
        {count++;
        	if(count==steps)
        	{arr[0]=level;
        	arr[1]=r;
        	
        	}
        }
          

        for(b=level+1; b < col-level; b++) // go down
        {
        	count++;
        	if(count==steps)
        	{
        		arr[0]=b;
        	arr[1]=r-1;
        	
        	}
        

        }
        
        for(l=b-1; l-1 >= level; l--)  // go left
        {
        		count++;
        	if(count==steps)
        	{ arr[0]=b-1;
        	arr[1]=l-1;
        		
        	}
			  
        }
           

        for(t=b-1; t-1 > level; t--)  // go up
        {
        		count++;
        	if(count==steps)
        	{
        		 arr[0]=t-1;
        	arr[1]=l;
        		
        	
        	}
        	 
        }
          
    }

    System.out.println(arr[0]+" "+arr[1]);
   
}
	
	
	
}



