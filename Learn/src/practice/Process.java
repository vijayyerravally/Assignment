package practice;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;


public class Process {
	
	private String file;
	
	public Process(String file){
		this.file=file;
	}
	       
	public boolean search() throws IOException{
		String[] theKeywords={"PERSON","PLACE","ANIMAL","COMPUTER","OTHER"};
		
		Map<String,Integer> Count = new HashMap<String,Integer>();
		for (String str : theKeywords)
		{
			Count.put(str, 0);
		}
		
		try {BufferedReader br=new BufferedReader(new FileReader(file));
		{
			String sCurrentLine;
			
			if ((sCurrentLine = br.readLine()) ==null)
			{
				System.out.println("The file is empty. Please provide a valid input file");
			}
			
			else {
			while ((sCurrentLine = br.readLine()) !=null)
			{
				int Categorylength=sCurrentLine.split(" ").length;
				
				String[] Category = sCurrentLine.split(" ");
				if (Categorylength !=1)
				{
					if (Count.containsKey(Category[0]))
					{
						Count.put(Category[0], Count.get(Category[0])+1);
					}
				}
				
			}
			
			
				
		}
			
		}
		}
				catch (FileNotFoundException exception)
				{
					System.out.println("Please provide an input file for processing. Provide the below message to the System Administrator");
					exception.printStackTrace();
					return false;
				}
		System.out.printf("%10s %10s\n","Category", "Count");
		for(String Category : theKeywords){
			System.out.printf("%10s %10s\n",Category,Count.get(Category));
		}
		return true;
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

