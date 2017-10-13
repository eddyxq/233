package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader 
{
	/*
	 * This method reads a text file into a 2d array
	 * @return maze The 2d array
	 */
	public String [][] readFile() 
	{
		File file = new File("maze.txt");
		Scanner scanner = null;
		try 
		{
			scanner = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		final int rows = 20;
		final int cols = 20;
		String maze[][] = new String[rows][cols];
		for(int row=0; row<rows; row++) 
		{
			for(int col=0; col<cols; col++) 
			{
				maze[row][col] = scanner.next();
			}
		}
		return maze;
	}
	/*
	 * This method translates the letters from the array into map symbols
	 * @param maze The 2d array 
	 * @return maze The 2d array
	 */
	public String[][] translateData(String [][] maze)
	{
		final int rows = maze.length;
		final int cols = maze[0].length;
		for(int row=0; row<rows; row++) 
		{
			for(int col=0; col<cols; col++) 
			{
				String letter = maze[row][col];
				
				switch(letter)
				{
				case "x":
					maze[row][col] = "#";
					break;
				case "y":
					maze[row][col] = " ";
					break;
				case "z":
					maze[row][col] = "X";
					break;
				case "i":
					maze[row][col] = "?";
					break;
				case "e":
					maze[row][col] = "E";
					break;
				}
			}
		}
		return maze;
	}
}
