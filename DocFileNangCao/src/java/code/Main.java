package java.code;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Path path = Path.of("data.txt");
		if(path == null) {
			System.out.println("File Ko TOn Tai");
		}
	}

}
