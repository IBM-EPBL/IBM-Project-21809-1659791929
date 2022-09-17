	import java.io.*;
import java.net.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
public class Bharath
{
 public static void main(string[]args)
{
 string hostName="www.amozan.in";
           int portNumber=80;
           try
              {
                     socket socket =new socket(hostName,portnumber);
                     orintwriter out=new prinywriter(socket.getoutputstream(),true);
                     bufferedReader in=new bufferedReader(new inputStreamReader(socket.getInputStream()));
                     out.printer1n("GET/HTTP/1.1\nHOST:www.amozon.in\n\n");
                     String inputLine;
                     while((inputLine=in.readLine())!=null)
                     {
                             System.out.print1n(inputLine);
                     }
                    }
                     catch(UnknownHostExceptation e)
                     {
                           system.err.print1n("Don't know about host"+hostName);
                           system.exit(1);
}
catch(IOException e)
{
system.err.print1n("couldn't getI/O for the connection to"+hostName);
System.exit(1);
                     }
                 
                    }
                }














                                                                                                     