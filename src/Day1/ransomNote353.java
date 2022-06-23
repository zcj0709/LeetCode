package Day1;

public class ransomNote353 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char a:magazine.toCharArray()) arr[a-'a']++;
        for(char a:ransomNote.toCharArray()) {
            arr[a-'a']--;
            if(arr[a-'a'] <0) return false;
        }
        return true;

    }


    public boolean canConstruct_mySolution(String ransomNote, String magazine) {
        int sizeNote = ransomNote.length();
        int sizeMagazine = magazine.length();
        if (sizeMagazine < sizeNote) return false;
        else if (sizeNote == 0) return true;
        while(ransomNote.length() != 0){
            String tmp = ransomNote.substring(0,1);
            ransomNote = ransomNote.replace(tmp,"");
            magazine = magazine.replace(tmp,"");
            if ((sizeNote - ransomNote.length()) > (sizeMagazine - magazine.length()))
                return false;
            sizeNote = ransomNote.length();
            sizeMagazine = magazine.length();
            if (sizeMagazine < sizeNote) return false;

        }
        return true;
    }
}
