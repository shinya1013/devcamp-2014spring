
import com.sun.jna.Library;
import com.sun.jna.Native;

public class TestMyLib {

	public interface CLib extends Library {
		
		// /usr/lib/libc.dylibの呼び出し 
		final CLib C_LIB = (CLib)Native.loadLibrary("c", CLib.class);
		
		// def
		void printf(String format, Object... args);
	}
	
	public static void main(String[] args) {
		CLib c = CLib.C_LIB;
		c.printf("Hello World\n");
	}
	
}


