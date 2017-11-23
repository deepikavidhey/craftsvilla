
public class Wave {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			//for(int n=1;n<=2;n++){
				for(int k=1;k<=5;k++)
				{
					if(i+k==6)
						System.out.print("/");
					else
						System.out.print(" ");
				}
				
				for(int j=1;j<=5;j++)
				{
				if(i==j)
					System.out.print("\\");
				else
					System.out.print(" ");
				}
				/*if(i<j)
				System.out.print("3");
				else if(i==j)
				System.out.print("2");			
				else
				System.out.print("1");*/
			
			System.out.println();
		}
		}

	}


