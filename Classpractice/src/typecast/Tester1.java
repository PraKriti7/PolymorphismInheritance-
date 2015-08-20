package typecast;

public class Tester1 {
	public static void main(String[] args) {
		String Filename="a.txt";
		String Filetype="texttype";
		int Filesize=1000;
		byte []filecontent=new byte[100];
		String Directoryname="C://Client1";
		
		
		Fileobject file=new Fileobject(Filename,Filetype,Filesize,filecontent,Directoryname);
		CommonCollection collection=new CommonCollection();
		int one=1;
		Integer xx=new Integer(one);
		
		
//		collection.put(file);
		try {
			collection.put(xx);
		} catch (Exception e) {
			
			
			System.out.println("i am catched for error ");
		}
		
		
	}

}
