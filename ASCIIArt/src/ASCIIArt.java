/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void neck() {
		System.out.println("	    | |");
		System.out.println("	    | |");
	}
	public static void feet() {
		System.out.println("   \"\"\"\"   /_| /_|    /_| /_|" + "   \"\"\"\"");
	}
	public static void leg() {
		System.out.println("	   ||  ||     ||  || |");
	}
	public static void grass() {
		System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
	}
	public static void main(String[] args) {
		System.out.println("	 __.ii,");
		System.out.println("	(__,\" |");
		neck();
		neck();
		neck();
		System.out.println("	    | |------------,");
		System.out.println("	   /               \\\\");
		System.out.println("	   |                |\\");
		System.out.println("	   |,._  |,______\\ |||");
		leg();
		leg();
		System.out.println("	   ||  ||     ||  || M");
		System.out.println(" \"\"\"\"	   ||  ||     ||  ||     \"\"\"");
		feet(); 
		System.out.print(" ");
		grass();
		System.out.print("    ");
		grass();
		System.out.print("   `");
		grass();
	}
}