import java.io.*;
public class BinaryFileRead {
	public static void main( String[] args ) {
		FileInputStream fis = null;
		InputStream bis = null;
		int character;
		try {
			fis = new FileInputStream( args[0] );
			bis = new BufferedInputStream( fis );
			while( ( character = bis.read() ) != -1 ){
				System.out.println( character );
			}
		} catch( Exception e ) {
			System.out.println( "Error!" );
		} finally {
			try {
				if( bis != null )	bis.close();
				if( fis != null )	fis.close();
			} catch( Exception e ){}
		}
	}
}
