package chapter11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args)  throws Exception
	{
		File f= new File("C:\\PracticeJava\\workspace\\Naveen_Java\\src\\chapter11\\Demo1.txt");
		FileOutputStream fos= new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Sagar File Demo");
		
		
		FileInputStream fis =new FileInputStream(f);
		DataInputStream dis =new DataInputStream(fis);
		String str=dis.readUTF();
		
		System.out.println("file content is : "+str);
		

	}

}
