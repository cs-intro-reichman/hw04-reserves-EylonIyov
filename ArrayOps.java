public class ArrayOps {
    public static void main(String[] args) {
        int [] Tester = { 1, 2, 3};
        int [] Tester2 = {-1,-2,-3,-4};
        System.out.println(secondMaxValue(Tester2));

    }
    
    public static int findMissingInt (int [] array) {
        int minValue = GetMin(array);
        int arrSum = ArraySum(array);
        int realSum = 0;
       for (int i = minValue; i<=array.length; i++){
            realSum+= i;
       }
        if (realSum == arrSum){
            return 0;
        }else{
            return Math.abs(realSum-arrSum);
        }
    }

    public static int secondMaxValue(int [] array) {
        int max, secondMax = array[0];
        max = GetMax(array);
        for (int i =1; i<(array.length); i++){
            if ((array[i] > array[i-1]) && (array[i] != max)){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       if(Included(array1,array2) && Included(array2,array1) ){
        return true;
       }else{
        return false;
       }
    }

    public static boolean isSorted(int [] array) {
        if(array[0] > array [array.length-1]){
            for (int i = 1; i<array.length ; i++){
                if (array[i-1] < array[i]){
                    return false;
                }
            }
            return true;
        }
        if(array[0] < array [array.length-1]){
            for (int i = 1; i<array.length ; i++){
                if (array[i-1] > array[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
        }


    
    public static int ArraySum(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    
    }
    public static int GetMin(int [] array){
        int minVal = array[0];
        for (int i =1; i<(array.length); i++){
            if (array[i] < array[i-1]){
                minVal = array[i];
            }
        }
        return minVal;  
    }
    public static int GetMax(int [] array){
        int maxVal = array[0];
        for (int i =1; i<(array.length); i++){
            if (array[i] > array[i-1]){
               maxVal = array[i];
            }
        }
        return maxVal;
    }
    public static boolean Included (int [] array1,int [] array2){
        boolean flag = false;
        for (int i = 0; i< array1.length; i++){
            for(int j = 0; j< array2.length; j++){
                if(array1[i] == array2[j]){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if (flag == false) {
                return false;
            }
            
    }
        return flag;
    }
}