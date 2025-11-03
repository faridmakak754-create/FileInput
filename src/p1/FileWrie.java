package p1;

import java.io.*;
import java.util.Scanner;

public class FileWrie {

	public static void main(String[] args) {
	
	
		try {
			Scanner scan =new Scanner (System.in);
			System.out.println("Enter text here");
			FileWriter fw=new FileWriter("text.txt",true);
			while(true) {
				
		
			String data=scan.nextLine();
			
			if(data.equalsIgnoreCase("exit"))
			{
				break;
			}
			fw.write(data +"\n");
			
			}
		
			fw.close();
			scan.close();
			System.out.println("Text save successfull !");
					
		}
	
		catch(Exception e)
		{
			System.out.println("File writer failed");
		}
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("text.txt"));
			System.out.println("Reading from file");
			String line;
		
			while((line=br.readLine()) != null)
			{
				System.out.println(line);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(" read text failed");
			
		}
		
		
	}

}
