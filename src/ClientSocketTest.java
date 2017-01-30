import java.io.*;
import java.net.*;
/**
 * Created by chestnov.v on 30.01.2017.
 */
public class ClientSocketTest {
    public static void main(String[] args) throws IOException
    {
        Socket s = new Socket("localhost",8890);

        BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("d:\\report.txt"));
        BufferedOutputStream  bos = new BufferedOutputStream(s.getOutputStream());

        byte[] byteArray = new byte[8192];
        int in;
        while ((in = bis.read(byteArray))!=-1)
        {
            bos.write(byteArray,0,in);
        }
        bis.close();
        bos.close();
    }
}
