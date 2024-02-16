public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("vowels are fun"));
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
    
        for (int i = 0; i<string.length(); i++ ){
            if (IsVowl(string.charAt(i))){
                newString += Upper(string.charAt(i)); 
            }
            else if(!IsVowl(string.charAt(i)))  {
                newString += Lower(string.charAt(i));
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
       String stringNew = "";
       boolean firstWord = true;
       boolean firstChar = true;
       for (int i =0; i<string.length(); i++){
        if(string.charAt(i) == ' '){
            continue;
        }
        if(firstWord){
            stringNew += Lower(string.charAt(i));
            if( (i)< string.length()-1){
                if(string.charAt(i+1) == ' '){
                    firstWord = false;
                }
            }
        }else{
            if (firstChar){
                stringNew += Upper(string.charAt(i));
                firstChar = false;
            }else{
                stringNew += Lower(string.charAt(i));
                if((i)< string.length()-1){
                    if(string.charAt(i+1) == ' '){
                        firstChar = true;
                    }
            }
        }
       }
    }
    return stringNew;
    }
        


        
    public static int[] allIndexOf (String string, char chr) {
        int arrSize = 0;
        int chrCouneter = 0;
        for(int i=0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                arrSize ++;
            }
        }
        int[] arrCounter = new int[arrSize];
        for(int i=0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                arrCounter[chrCouneter] = i;
                chrCouneter++;
            }
        }
        return arrCounter;
    }
    public static boolean IsVowl(char a){
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            return true;
        }else{
            return false;
        }
    }
   
    public static char Upper(char a){
        if(a <= 'z' && a >= 'a'){
            return (char)(a-32); 
        }else{
            return a;
        }
    }
    public static char Lower(char a){
        if(a<='Z' && a >= 'A'){
        return (char)(a+32); 
        }else{
            return a;
        }
      }
      public static void printArray(int[] array){
        for (int i =0; i< array.length; i++){
            if(i == 0){
            System.out.print("{"+ array[i]+",");
            }
            if(i == (array.length-1)){
                System.out.print(array[i]+"}"); 
            }else if (i != 0){
                System.out.print(array[i]+",");
            }
        }
      }
}
