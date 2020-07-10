import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class Client
{
	static public void main(String...ar)throws Exception
	{
Scanner sc=new Scanner(System.in);
System.out.println("server is ready");
System.out.println("enter ip address");
String iPAddress=sc.next();
	 Socket socket=new Socket(iPAddress,6000);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        PrintStream ps=new PrintStream(socket.getOutputStream());
        while(true)
        {
		String data=br.readLine();
            if(data==null)
            {
                break;
            }    ps.println(data);
            
        }
    }                                        

}