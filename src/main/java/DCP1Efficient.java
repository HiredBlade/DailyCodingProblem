import java.util.HashSet;

public class DCP1Efficient {

    public static boolean solution(int[] numbers, int k){

        HashSet<Integer>  numbersHash = new HashSet<>();

        for(int i = 0;i < numbers.length;i++){
            int number = numbers[i];
            numbersHash.add(number);
        }

        for(int i = 0;i < numbers.length;i++){
            int number = numbers[i];
            int remainder = k - number;
            if(numbersHash.contains(remainder))
                return true;
        }

        return false;
    }
}
