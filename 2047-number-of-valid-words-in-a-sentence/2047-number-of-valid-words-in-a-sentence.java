class Solution {
    public int countValidWords(String sentence) {
        String words[] = sentence.trim().split("\\s+");
        int validWords = 0;

        for (String word : words){
            if (check(word)){
                validWords++;
            }
        }
        return validWords;
        
    }
    public boolean check(String s){
        int count = 0;

        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                return false;
            }
            if (s.charAt(i) == '-'){
                count++;

                if (count > 1){
                    return false;
                }
                if (i == 0 || i== s.length() - 1){
                    return false;
                }
                if (!Character.isLowerCase(s.charAt(i-1)) ||
                    !Character.isLowerCase(s.charAt(i+1))){
                        return false;
                    }

            }
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == ','){
                if (i != s.length() - 1){
                    return false;
                }
            }
        }
        return true;
    }
}