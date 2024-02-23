public class Exercises1 {

    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if (n == 0)
            return 1;

        int fact = 1;
        for (int i = n; i > 0; i--){
            fact *= i;
        }
        return fact;
    }

    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        /*
        recursive implementations of Fibonacci sequence

        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
         */

        // non-recursive implementations of Fibonacci sequence
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else{
            long a, b, c;
            a = b = c = 1;
            for (int i = 0; i < n-2; i++){
                c = a+b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] tr = new char[rows][];
        for (int i = 0; i < rows; i++){
            tr[i] = new char[i+1];
            for (int j = 0; j <= i; j++)
                tr[i][j] = '*';
        }
        return tr;
    }


    public static void main(String[] args){}

}