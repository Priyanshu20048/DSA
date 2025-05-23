// count even no of digits 
class Even_Digits{
    public static void main(String[] args){
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNum(nums));


    }
    static int findNum(int[] nums){
        int count = 0;
        for (int num:nums){
            if(even(num) ){
                count++;
            }
        }
        return count;
    }
    // function to check wheter a number contains even digits or not 
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits%2==0){
            return true ;
        }
        return false ; 
        // shortcut :- dont use if else just write 
        // return numberOfDigits %2 ==0; // it will automatically give either true or false 
    }
    // count number of digits in a number 
    static int digits (int num){
        // if numbers are negative 
        if (num <0){
            num = num*-1;
        }
        // if no is 0 itself 
        if (num==0){
           return 1;
        }

        int count =0;
        while (num >0){
            count++;
            num =num /10; // num/=10
        }
        return count;
    }

    //optimised way to count digits of number
    // static int digits2(int num) {
    //     // for negatives 
    //     if (num <0){
    //         num = num*-1;
    //     }
    //     return (int)(Math.log10(num)) +1;
    // }
}