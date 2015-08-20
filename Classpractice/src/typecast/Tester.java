package typecast;

public class Tester {
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
		
		
		try {
			collection.put(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		collection.put(xx);
		
		
	}

}
