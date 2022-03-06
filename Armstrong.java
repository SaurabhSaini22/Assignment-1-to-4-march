package Statements_Operators;

public class Armstrong{
    public static void main(String[] args) {
        for(int i=1;i<=500;i++){
            int sum = 0;
            int t = i;
            while(t!=0){
                sum = sum+((t%10)*(t%10)*(t%10));
                t = t/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
