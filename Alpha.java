 class Alpha
{
	public static void main(String[] args) 
	{
		int n=7;
		for (int i=0;i<= n-1 ;++i )
		{
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||j==n/2||(j==0&&i==3)||(j==1&&i==4)||(j==2&&i==5))
		        {
		            System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(" ");
	                 }
	           
		    }
		    
		    
		    System.out.print(" ");
		    
		    
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	                }
	                else
	                {
	                   System.out.print(" ");
	                }
	           
		    }
		    
		    
		    System.out.print(" ");
                    
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0&&i<=n/2||j==n-1&&i<=n/2||i-j==n/2&&j<=n/2||i+j==n+n/2-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");

		 for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
            System.out.print("          ");
			
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		  
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0&&j!=0||i==n-1&&j!=n-1||i==n/2&&j!=0&&j!=n-1||j==0&&i!=0&&i<=2||j==n-1&&i>=4&&i!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			
	                System.out.print("       ");


			for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||(i==n/2&&j==n/2)||i==1&&(j==1||j==5)||i==2&&(j==2||j==4))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0||i==n-1||i+j==n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
			
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||i==j)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if (j==0||i==0||(j==n-1&&i!=2)||(j==n/2&&i!=1&&i!=2)||(i==n/2&&j!=1&&j!=2)||(i==n-1&&j!=4&&j!=5))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.println();
		}
          System.out.println(" ");  
            
        for (int i=1;i<=138;++i)
        {
            System.out.print("*");
        }
        
        for (int i=1;i<=2;++i)
        {
          System.out.println(" ");
        }
        
        
        
        
        
        
		for (int i=0;i<= n-1 ;++i )
		{
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0||i==0||i==n/2)&&j!=n-1||(i==1||i==2)&&j==n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print("  ");
		
		  for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0 ||((i==0||i==n/2)&&j!=n-1)||(j==n-1&&(i!=0)&&i<n/2)||(i!=n/2 && i==j && j!=i*i && j!=2))||j==5&&i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if((i==0||i==n-1)&&(j!=0 &&j!=n-1)||(j==0||j==n-1)&&(i!=0&&i!=n-1))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.print("  ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0||j==n-1)&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
                       System.out.print("  ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0)||((i==0||i==n-1)&& (j!= n-1)) || j==n-1&&i!=0&&i!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    } 
			System.out.print("          ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if (j==0||i==0||(j==n-1&&i!=2)||(j==n/2&&i!=1&&i!=2)||(i==n/2&&j!=1&&j!=2)||(i==n-1&&j!=4&&j!=5))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0||j==5)&&i<=n/2&&i!=0||(i==0||i==4)&&j<=4&&j!=0||i==j&&j>=n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		     for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		     System.out.print("  ");
		      for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		    
		     for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||i==j)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.println();
		    
		  }
			 
	    System.out.println(" ");  
            
        for (int i=1;i<=138;++i)
        {
            System.out.print("*");
        }
        
        for (int i=1;i<=2;++i)
        {
          System.out.println(" ");
        }
        





	
		for (int i=0;i<= n-1 ;++i )
		{
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		 for (int j=0;j<= n-1 ;++j )
		    {
		        if (j==0||j==n-1||i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
                     System.out.print(" ");


			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||i==j)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");

			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0 || i-j==n/2 || i+j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.print("        ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==j&&i<=n/2||i+j==n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if((i==0||i==n-1)&&(j!=0 &&j!=n-1)||(j==0||j==n-1)&&(i!=0&&i!=n-1))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0||j==n-1)&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print("      ");




			
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if (j==0||i==0||(j==n-1&&i!=2)||(j==n/2&&i!=1&&i!=2)||(i==n/2&&j!=1&&j!=2)||(i==n-1&&j!=4&&j!=5))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			
	                System.out.print(" ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0 ||((i==0||i==n/2)&&j!=n-1)||(j==n-1&&(i!=0)&&i<n/2)||(i!=n/2 && i==j && j!=i*i && j!=2))||j==5&&i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print("      ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||i==j)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.print("     ");






			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0&&j!=0||i==n-1&&j!=n-1||i==n/2&&j!=0&&j!=n-1||j==0&&i!=0&&i<=2||j==n-1&&i>=4&&i!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		 
			
	                System.out.print(" ");
	
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
		
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0 ||((i==0||i==n/2)&&j!=n-1)||(j==n-1&&(i!=0)&&i<n/2)||(i!=n/2 && i==j && j!=i*i && j!=2))||j==5&&i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.println();
		
		}	
		 System.out.println(" ");  
            
        for (int i=1;i<=138;++i)
        {
            System.out.print("*");
        }
        
        for (int i=1;i<=2;++i)
        {
          System.out.println(" ");
        }



		
		for (int i=0;i<= n-1 ;++i )
		{
		    for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		 for (int j=0;j<= n-1 ;++j )
		    {
		        if (j==0||j==n-1||i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
                     System.out.print(" ");


			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0||j==n-1||i==j)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");

			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(j==0 || i-j==n/2 || i+j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.print("        ");
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==j&&i<=n/2||i+j==n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");

			for (int j=0;j<= n-1 ;++j )
		    {
		        if((i==0||i==n-1)&&(j!=0 &&j!=n-1)||(j==0||j==n-1)&&(i!=0&&i!=n-1))
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0||j==n-1)&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print("      ");
			
			for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0||i==n-1||i+j==n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
                 System.out.print("  ");
            

			for (int j=0;j<= n-1 ;++j )
		    {
		        if ( j==0 && i!=0||j==n-1&& i!=0 ||i==n/2||i==0&&j!=0&&j!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		    
		     for (int j=0;j<= n-1 ;++j )
		    {
		        if((i==0 || i==n/2 ||i==n-1)&&(j!=n-1)||j==0||j==n-1&&i!=0&&i !=n/2 &&i!=n-1 )
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print(" ");
		    
		     for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		    System.out.print("       ");



			 for (int j=0;j<= n-1 ;++j )
		    {
		        if(i==0&&j!=0||i==n-1&&j!=n-1||i==n/2&&j!=0&&j!=n-1||j==0&&i!=0&&i<=2||j==n-1&&i>=4&&i!=n-1)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
		 
			
	                System.out.print(" ");
	
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if (i==0||i==n-1||j==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			System.out.print(" ");
		
			 for (int j=0;j<= n-1 ;++j )
		    {
		        if((j==0 ||((i==0||i==n/2)&&j!=n-1)||(j==n-1&&(i!=0)&&i<n/2)||(i!=n/2 && i==j && j!=i*i && j!=2))||j==5&&i==n/2)
		        {
		            System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	           
		    }
			 System.out.println();

		}	
		 System.out.println(" ");  
            
        for (int i=1;i<=138;++i)
        {
            System.out.print("*");
        }
        
        for (int i=1;i<=2;++i)
        {
          System.out.println(" ");
        }



	
	}
}
