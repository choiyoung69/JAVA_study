import java.io.*;

public class CopyLennaByte {
	public static void main(String[] args) {
		int b;

		try{
			long startTime = System.currentTimeMillis();
			InputStream lenna = new FileInputStream("lenna.png");
			OutputStream copy_lenna = new FileOutputStream("lenna_copy.png");

			while((b = lenna.read()) != -1){
				copy_lenna.write(b);
			}
			lenna.close();
			copy_lenna.close();
			long endTime = System.currentTimeMillis();
			System.out.println("Time: " + (endTime - startTime) + "ms");
		}
		catch (Exception e ){
			e.printStackTrace();
		}

	}
}
