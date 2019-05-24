package chapter11;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenerator {

	public static void main(String[] args)  throws Exception
	{
		String details="Sagar Java QR learning.......";
		
		ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();
		File f=new File("C:\\PracticeJava\\workspace\\Naveen_Java\\src\\chapter11\\Sagar_channel.jpg");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		fos.write(out.toByteArray());
		fos.flush();
	}

}
