import java.util.Scanner ;
public class LeetCode1281{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int res = subtractProductAndSum(n);
        System.out.println(res);}

        
    
static int subtractProductAndSum(int n) {
    int num = 0;
    int mul = 1;
    int add = 0;
    for (int i  = 1 ; n>0;i++){
            num = n%10;
            mul = mul *num ;
            add = add + num ;
            n = n/10;
            
        }
        int ret = mul - add;
        return ret;
    }
}