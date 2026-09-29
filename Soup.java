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
// This program will produce certain letters from a word that spell out specific words which can remove a first vowel from a letter,
    //adds a word to the pool of letters known as "letters"
    //precondition: letters contain characters found in word
    public void add(String word){
        letters+= word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precondtion: returns random character from the letter
    public char randomLetter(){
       char randomLetter = letters.charAt((int)(Math.random()*letters.length()));
       return randomLetter;
        
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precondition: will 
    public String companyCentered(){
        String firstHalf = letters.substring(0, letters.length()/2);
        String secondHalf = letters.substring(letters.length()/2);
        return firstHalf+ company + secondHalf;
        //return  letters.substring(0,5);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // precondition: letters variable is non null and is a valid string, there's at least one vowel present
    //precondition: letters no longer contains the first vowel found
    public void removeFirstVowel(){
    
       letters = letters.replaceFirst("[aeiouAEIOU]","");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        //pick some spot such that there are at least "num" characters after it
        int index = (int)(Math.random()*(letters.length()-num));
        //String (Math.random()-(letters.length());


         letters = letters.substring(0, index)+ (letters.substring(index+num));
    
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        //String letters = letters.replace("word","");
        // Searches from before the word until its found to start of the word you found and its length
        letters = letters.substring(0, letters.indexOf(word))+letters.substring(letters.indexOf(word)+word.length());
       
    }
}
