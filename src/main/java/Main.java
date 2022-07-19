import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here

    interface NextOddNum{
        Integer applyAsInt(Integer num);
    }
    
    public static void main(String[] args) {

        NextOddNum nextOddNum = (num -> {
            if(num%2 == 0){
                return num +1 ;
            }
            return num+2;
        });

        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }


}
