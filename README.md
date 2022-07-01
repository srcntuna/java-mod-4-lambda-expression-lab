# Lambda Expression Lab

## Instructions

Write a lambda expression that takes an integer and returns the next odd number.
The expression should be `public` and `static`.

```java
import java.util.function.IntUnaryOperator;

public class Main {
		// write the nextOddNum here

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}
```
