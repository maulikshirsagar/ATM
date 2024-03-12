import java.io.*;
import java.net.*;
public class Client{
	public static void main(String []args){
		try{
			Socket s=new Socket("192.168.0.76",6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Amit");
			dout.flush();
			dout.close();
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}