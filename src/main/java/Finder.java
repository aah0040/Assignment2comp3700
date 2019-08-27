//aah0040
//Alex Holt
//import jdk.internal.jline.internal.TestAccessible;
public class Finder {

    public static Integer findMax(int[] intArray){
        if (intArray == null  ||  intArray.length == 0) {
            return null;
        }
        Integer maximum = intArray[0];
        for (int i = 1; i <intArray.length; i++){
            if (intArray[i] > maximum)
                maximum = intArray[i];
        }
        return maximum;
    }

    public static Integer findMin(int[] intArray){
        if (intArray == null  ||  intArray.length == 0){
            return null;
        }
        Integer minimum = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if(intArray[i] < minimum)
                minimum = intArray[i];
        }
        return minimum;
    }



}