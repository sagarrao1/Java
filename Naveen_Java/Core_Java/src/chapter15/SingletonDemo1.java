package chapter15;

public class SingletonDemo1 {
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {			
			public void run() {
				Abc obj1=Abc.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {			
			public void run() {
				Abc obj2=Abc.getInstance();
			}
		});
		
		t1.start();		
		  //try { t1.sleep(10); } catch (Exception e) {  }		 
		t2.start();
	}
}

class Abc{
	static Abc obj;
	private Abc() {
		System.out.println("Instance created");
	}

	public static /* synchronized */ Abc  getInstance() {
		if(obj==null) {
			
			synchronized(Abc.class)
			{
				if(obj==null)
				obj=new Abc();
			}
		}		
		return obj;
	}	
}
