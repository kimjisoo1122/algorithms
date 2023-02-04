package programers;

import java.util.Arrays;

public class PushStr {
    public static int solution(String A, String B) {

        int result = B.repeat(2).indexOf(A);

//        if (A.equals(B)) return 0;
//
//        char[] inputStrA = A.toCharArray();
//        int lastIdx = inputStrA.length - 1;
//        char[] temp = inputStrA.clone();
//
//        for (int i = 0; i < inputStrA.length - 1; i++) {
//
//            temp[0] = A.toCharArray()[lastIdx - i];
//            System.arraycopy(inputStrA, 0, temp, 1, temp.length - 1);
//            inputStrA = temp.clone();
//            System.out.println("temp = " + Arrays.toString(temp) + " i = " + i);
//            if (String.valueOf(temp).equals(B)) {
//                return i + 1;
//            }
//        }
        return result;
    }

    public static void main(String[] args) {
        int solution = solution("hello", "ohell");
        System.out.println("solution = " + solution);
//        A	B	result
//        "hello"	"lohellohel"	1
//        "apple"	"elppa"	-1
//        "atat"	"tata"	1
//        "abc"	"abc"	0
    }
}

