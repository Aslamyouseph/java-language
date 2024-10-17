package mypack; // this is needed then only the package will work correctly 

public class additionOperation {

    int num1, num2, sum, diff;

    public int add(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        sum = num1 + num2;
        return sum;
    }

    public int subtract() {
        diff = num1 - num2;
        return diff;
    }
}
