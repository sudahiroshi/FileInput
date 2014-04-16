public class TextFileRead {
	public static void main( String[] args ) {
		try {
			String msg;
			java.io.FileInputStream fis = new java.io.FileInputStream( args[0] );
			java.io.InputStreamReader isr = new java.io.InputStreamReader( fis );
			java.io.BufferedReader br = new java.io.BufferedReader( isr );
			while( ( msg = br.readLine() ) != null ) {
				System.out.println( msg );
			}
			br.close();
			isr.close();
			fis.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
