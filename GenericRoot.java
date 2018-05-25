/*
Generic Root means to add the digits of the number until the sum of all digits is not a single digit. Example 1798 = 1+7+9+8 = 25 = 2+5 = 7
Example 123= 1+2+3=6
*/




class GenericRoot
{
  
   public static void main(String args[])
   { int num,sum,r;
   	num=09166342111; // Read num from user
       while(num>10)
       	{
			sum=0;
					while(num!=0)
						{
						r=num%10;
						num=num/10;
						sum+=r;
						}
						num=sum;
   		}
   		
   		System.out.println(num);
   			   
   }
}
   