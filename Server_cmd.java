import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
class Server
{
	static public void main(String...ar)throws Exception
{     
       ServerSocket ss=new ServerSocket(6000);
        System.out.println("server is ready");
        Socket socket=ss.accept();
        InputStreamReader isr=new InputStreamReader(socket.getInputStream());
        BufferedReader br=new BufferedReader(isr);
        while(true)
        {
            
            

		String data=br.readLine();
		if(data.length()==0)
		{
                break;
		}
                System.out.println(data);
            
        }
    }   
}