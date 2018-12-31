String longestWord(String text) {

    String[] words = text.split("[^a-zA-Z]");
    String longest = "";
    
    for(String word : words){
        if (word.length() > longest.length()) 
            longest = word;
    }
    return longest;
}
