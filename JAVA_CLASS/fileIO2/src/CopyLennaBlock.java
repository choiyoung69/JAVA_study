import java.io.*;

public class CopyLennaBlock {
	public static void main(String[] args) {
		byte[] b = new byte[1024];

		try{
			long startTime = System.currentTimeMillis();
			InputStream lenna = new FileInputStream("lenna.png");
			OutputStream copy_lenna = new FileOutputStream("lenna_copy_block.png");

			while(lenna.read(b) != -1){
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
