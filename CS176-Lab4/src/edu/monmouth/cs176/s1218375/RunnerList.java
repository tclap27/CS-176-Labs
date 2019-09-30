package edu.monmouth.cs176.s1218375;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author tomclappsy
 *
 */
public class RunnerList {

	ArrayList<Runners> runnersList = new ArrayList<Runners> ();
	
	RunnerList() {
		readCSVData();
	}
	
	private void readCSVData() {
		String csvFile = "/Users/tomclappsy/Downloads/CS176-Lab4-Runners-Starter/src/runners.csv";
        String line = "";
        String cvsSplitBy = ",";
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] lineElements = line.split(cvsSplitBy);

                
                if (lineCount > 0) {
                	Runners r = new Runners (lineElements[0],
                						   lineElements[1],
                						   lineElements[2],
                						   lineElements[3],
                						   lineElements[4],
                						   lineElements[5],
                						   lineElements[6],
                						   lineElements[7],
                						   lineElements[8],
                						   lineElements[9]
                						  );
                	runnersList.add(r);
                }
                lineCount++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * @return total runners in the list
	 * 
	 */
	public Integer totalRunners() {
		return runnersList.size();
	}
	
	/**
	 * @param ID - ID of the runner to find
	 * @return If found return foundRunner.
	 *         If not null
	 */
	
	public Runners findRunner (String ID) {
		Runners foundRunner = null;
		// enter java statements below
		for(Runners r: runnersList)
		{
			if(r.getID().equals(ID))
			{
				return r;
			}
		}
		
		return foundRunner;
	}
	
	/**
	 * @param ID - ID of runner to find
	 * @return true - if runner is found remove runner, return true
	 * 		   false - if runner is not found
	 */
	public boolean deleteRunner (String ID) {
		boolean result = false;
		// complete statements below
		Runners r = findRunner(ID);
		
			if(r != null)
			{
				runnersList.remove(r);
				System.out.println(r.toString());
				result = true;
			}
		
		return result;
	}
	
	/**
	 * @param size - String parameter to specify tShirt size
	 * @return count of T-shirts for the given size
	 */
	public Integer getTshirtCount (String size) {
		Integer count = 0;
		// complete statements below
		for(Runners r: runnersList)
		{
			if(r.getTShirtSize().equals(size))
			{
				count++;
			}
		}
		return count;
	}
	
	public Integer[] countTShirtSizes(String[] sizes) 
	{
		Integer[] counts;
		
		counts = new Integer[sizes.length];
		Arrays.fill(counts,0);
		
		for(Runners r: runnersList)
		{
			int index = 0;
			while(index<sizes.length)
			{
				if(sizes[index].equals(r.getTShirtSize()))
				{
					counts[index]++;
					break;
				}
				else
				{
					index++;
				}
			}
		}
		return counts;
	}
	
	
}

