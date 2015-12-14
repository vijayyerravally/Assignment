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
		//Store the legally allowed Categories/keywords
		String[] theKeywords={"PERSON","PLACE","ANIMAL","COMPUTER","OTHER"};
		
		// Using a Hash Map to keep track of the key-pair values
		Map<String,Integer> Count = new HashMap<String,Integer>();
		//To process only the values in the 'theKeywords' array
		for (String str : theKeywords)
		{
			//Initializing the counter to 0
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
				//process line by line till end of the file
			while ((sCurrentLine = br.readLine()) !=null)
			{
				//Getting number of words in the line, using space as a delimiter
				int Categorylength=sCurrentLine.split(" ").length;
				
				String[] Category = sCurrentLine.split(" ");
				//since we do not have to count lines where category does not have a value
				//checking for lines that more than one word, meaning lines having category and its value
				if (Categorylength !=1)
				{
					if (Count.containsKey(Category[0]))
					{
						//getting the Category which is first word in the line and keeping 
						//track of its count
						Count.put(Category[0], Count.get(Category[0])+1);
					}
				}
				
			}
			
			
				
		}
			
		}
		}
				catch (FileNotFoundException exception)
				{
					//Throwing an error on to the console if file is not available
					System.out.println("Please provide an input file for processing. Provide the below message to the System Administrator");
					exception.printStackTrace();
					return false;
				}
		//Printing the header line		
		System.out.printf("%10s %10s\n","Category", "Count");
		for(String Category : theKeywords){
			//Printing the Category and the final Count
			System.out.printf("%10s %10s\n",Category,Count.get(Category));
		}
		return true;
	}

	}

