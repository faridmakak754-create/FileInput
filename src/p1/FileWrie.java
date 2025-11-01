package p1;

import java.io.*;
import java.util.Scanner;

public class FileWrie {

	public static void main(String[] args) {
	
		try {
			//write
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter some text");
			
			
			FileWriter fw=new FileWriter("fdkhanz.txt",true);
			
			while(true)
			{
				String data =scan.nextLine();
				if(data.equalsIgnoreCase("exit"))
				{
					break;
				}
	
				fw.write(data +"\n");
				
			}
			fw.close();
			scan.close();	
			System.out.println("File create successfull");		
		}
		catch(Exception e)
		{
			System.out.println("File create failed");
			
		}
		
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("fdkhanz.txt"));
			String line;
			System.out.println("Reading from file");
			while((line=br.readLine()) !=null)
					{
						System.out.println(line);
					}	
		}
		
		
		catch(Exception e)
		{
			System.out.println("Read File failed");
		}

		
	}

}
