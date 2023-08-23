package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.LongPredicate;



public class AbsDiff {

    public static void main(String[] args) {
        long[] arr = {87, 89, 45, 235, 465, 765, 123, 987, 499, 655};
        int n=8;
        int k=1000;
        long[] result = getDigitDiff1AndLessK(arr,n,k);
        Arrays.stream(result).forEach(System.out::println);


        LongPredicate adjacentCheck = (num) -> {
            long val =num;
            long prev=-1,dig=-1;
            while ( val > 0 ) {
                prev=dig;
                dig = val%10;
                System.out.println("val " + val + " dig " + dig + " prev " + prev);
                if( prev!=-1 && Math.abs(dig-prev)!=1)
                    return false;
                val=val/10;
            }
            return true;
        };

        System.out.println(adjacentCheck.test(43));


    }



    static long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {

        LongPredicate adjacentCheck = (num) -> {
            if ( num < 10)
                return false;
            long val =num;
            long prev=-1,dig=-1;
            while ( val > 0 ) {
                prev=dig;
                dig = val%10;
                if( prev!=-1 && Math.abs(dig-prev)!=1)
                    return false;
                val=val/10;
            }
            return true;
        };


        long[] filter = Arrays.stream(arr).filter((val)-> val < k)
                .filter((adjacentCheck)).toArray();

        return filter;
    }

    private static long[] getLongs(ArrayList<Long> result) {
        long[] res=new long[result.size()];
        for (int i = 0; i< result.size(); i++) {
            res[i]= result.get(i);
        }
        return res;
    }

}
