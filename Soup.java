public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing. (Actual work below)
// Pascal Somborn
// 09/25/26
// This program will produce certain letters from a given word that spell out specific words which can remove a first vowel from a letter, remove random letter, add a word, center with company, and remove a word entirely
    //adds a word to the pool of letters known as "letters"
    //precondition: There must be a word given
    public void add(String word){
        letters+= word;
    //postcondition: Word adds stored string into letters
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precondtion: Must be a given character to randomly choose a character
    public char randomLetter(){
       char randomLetter = letters.charAt((int)(Math.random()*letters.length()));
       return randomLetter;
        //postcondition: returns a random letter from char variable
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precondition: there must be a company and letter given in order to center company
    public String companyCentered(){
        String firstHalf = letters.substring(0, letters.length()/2);
        String secondHalf = letters.substring(letters.length()/2);
        return firstHalf+ company + secondHalf;
        //postcondition: returns first half of letter variable length plus given company name plus second half of letter variable length 
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // precondition: letters variable is non null and is a valid string, there's at least one vowel present
    public void removeFirstVowel(){
    // Replaces any letter containing a vowel with a blank string
       letters = letters.replaceFirst("[aeiouAEIOU]","");
       //postcondtion: returns letters variable with removed vowels if any were found, if not, code was ignored
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //precondition: There must be a given number to randomly remove that same amount characters randomly
    public void removeSome(int num){
        //pick some spot such that there are at least "num" characters after it
        // creates new variable, that uses int, which contains math.random multiplied by letters length minus the given number by user
        int index = (int)(Math.random()*(letters.length()-num));
        //String (Math.random()-(letters.length());

        // letters will add everything that remainsbefore and after encountering index 
         letters = letters.substring(0, index)+ (letters.substring(index+num));
    //postcondition: returns letters variable by adding 1st half and 2nd half of letters variable together after index variable removes random character(s)
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition: There must be a string given to search and remove character
    public void removeWord(String word){
        //String letters = letters.replace("word","");
        // Searches from before the word until its found to start of the word you found and its length
        letters = letters.substring(0, letters.indexOf(word)) + (letters.substring(letters.indexOf(word)+word.length()));
       //postcondition: returns letters variable by adding 1st half and 2nd half of letters variable together after the given word in paramaters is found and removes those character(s) inside the letter variable.
    }
}
