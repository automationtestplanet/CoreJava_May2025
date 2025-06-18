package assignments.madhusudhan;

public class Assignment1 {

	//Write a reusable method to display Each word first letter capital in a sentence
	// Ex: heLLo tHis iS jaVA
	// o/p: Hello This Is Java
	public static String capitalizeWords(String input) 
    {
        if (input == null || input.isEmpty()) 
        {
            return input;
        }

        // split the input string into words using whitespace
        String[] words = input.split("\\s");

        // create a StringBuilder
        StringBuilder result = new StringBuilder();

        for (String word : words) 
        {
            // capitalize the first letter of each word and append the rest of the word
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" "); // Add a space between words
        }

        // remove the trailing space and return the capitalized string
        return result.toString().trim();
    }
	
	public static void main(String[] args) {
		String inputString = "welcome to geeksforgeeks";
        String capitalizedString = capitalizeWords(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Capitalized String: " + capitalizedString);

	}

}

