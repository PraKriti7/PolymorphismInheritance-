package typecast;

public class CommonCollection extends AbstractCollection implements GenericAlgorithm,AbstractArray,Encrypted  {
	
	
	@Override
	 public Object Add(Object x) throws Exception {
		
		put(x);
		return x;
	}
	

	public void put(Object x) throws Exception {
		// type casting is done here 
		// 
		Fileobject file=(Fileobject) x;
		
		// casting exception
//		 Integer c=(Integer)x;
		
		Object[] putarray = new Object[2];
		putarray[0] = x;
		System.out.println("executed successfully");
	
		
		
		
		
	}

	public Object get(Object x) {
		return null;
	}


	@Override
	public byte[] encode(Fileobject x) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public byte[] decode() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
