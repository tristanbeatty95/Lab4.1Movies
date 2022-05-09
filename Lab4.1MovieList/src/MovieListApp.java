import java.util.ArrayList;
import java.util.Scanner;

public class MovieListApp {

	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<>();
		
		list.add(new Movie("Titanic", "drama"));
		list.add(new Movie("The Notebook", "romance"));
		list.add(new Movie("House of Gucci", "drama"));
		list.add(new Movie("Thirteen", "drama"));
		list.add(new Movie("West Side Story", "romance"));
		list.add(new Movie("Scream", "horror"));
		list.add(new Movie("The Hills Have Eyes", "horror"));
		list.add(new Movie("Cloudy With a Chance of Meatballs", "horror"));
		list.add(new Movie("Grease", "musical"));
		list.add(new Movie("Rent", "musical"));
		
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Which genre are you interested in seeing?");
		String userInput = scan.nextLine();
		for(Movie movies : list) {
			if(movies.getCategory().equalsIgnoreCase(userInput)) {
				System.out.println(movies.getTitle().toString());
			} 
			}
		System.out.println("Would you like to see another genre? y/n");
		String cont = scan.nextLine();
		if(cont.equalsIgnoreCase("y") || !cont.equals("n")) {
			System.out.println("We have plenty more movies to choose from.");
			continue;
		} else if(cont.equals("n")) {
			System.out.println("Exiting program");
			break;
		}
		} while(true);
		
		scan.close();
		
		
	}

}
