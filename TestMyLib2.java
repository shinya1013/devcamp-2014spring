import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class TestMyLib2 {
   public interface CLibrary extends Library {
       CLibrary INSTANCE = (CLibrary) Native.loadLibrary("mydylib", CLibrary.class);
       int myadd(int a, int b);
   }

   public static void main(String[] args) {
       CLibrary mylib = CLibrary.INSTANCE;
       System.out.println(mylib.myadd(20,22));
   }
}

