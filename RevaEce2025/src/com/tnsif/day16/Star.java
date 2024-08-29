package com.tnsif.day16;

public class Star {
	
	public static void print(int n)
	{
		for(int i=0;i<n;i++)
	    {
	    	//space
	        for(int j=0;j<n-i;j++)
	        {
	            System.out.print(" ");
	        }
	        //star
	        for(int j=0;j<i+1;j++)
	        {
	        	System.out.print( (i-j+1)+" "  );
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {
		
		print(5);

	}

}
