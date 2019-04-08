public class DCP1 {

    public static boolean solution(int[] numbers, int k){

        for(int i = 0;i < numbers.length;i++){
            int a = numbers[i];
            int[] restOfNumbers = numbers;
            restOfNumbers[i] = 0;

            for(int j = 0;j < restOfNumbers.length; j++){
                int b = restOfNumbers[j];

                if(a + b == k)
                    return true;
            }
        }


        return false;
    }
}
