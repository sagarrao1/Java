package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
	public static void main(String[] args) throws Exception
	{
		Save obj=new  Save();
		obj.i=4;
		
		File f=new File("C:\\PracticeJava\\workspace\\Naveen_Java\\src\\chapter12\\obj.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
	
		Save obj1=(Save) ois.readObject(); 
		
		//File

		//Save obj1=obj;		
		System.out.println("value of obj1.i : "+obj1.i);

	}
}

class Save implements Serializable
{
	int i;
}
