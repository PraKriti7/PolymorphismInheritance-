package classes;

public class exception {
	
	void M1(int a,int b) {
		try{
			
			
			
			int i = a;
			int y = b;
			
			if(a==1 && b==0){
				throw new Exception();
			}
			
			
			
			int d = a/b; 
			
			if(a==1 && b==0){
				throw new Exception();
			}
			
			
			}
		
		catch (Exception Ex){
			System.out.println("exception is catched ");
	
			
		}
		
			finally{
				System.out.println("finally");
				
				return;
				
		}
	}

	}
