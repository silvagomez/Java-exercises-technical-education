public class Ex119_operators {
    // EXERCISE 19
    /*------------------------------------------------
     * Program that demonstrates what operators do
     *------------------------------------------------*/
    public static void main(String[] args) {

        int x = 24, y = 92;

        System.out.println("Arithmetic operators");
        System.out.println("x=" + x + " | y=" + y);
        System.out.println("x+y = " + (x + y));
        System.out.println("x-y = " + (x - y));
        System.out.println("x*y = " + (x * y));
        System.out.println("x/y = " + (x / y));
        System.out.println("x%y = " + (x % y));
        x++;
        System.out.println("x++ = " + x);
        System.out.println("--y = " + --y);

        System.out.println("########################");
        System.out.println("Assignment operators");
        System.out.println("x = " + (x=24));
        System.out.println("y = " + (y=9));
        System.out.println("x += y is the same as x = x + 9");
        System.out.println("x -= y is the same as x = x - 9");
        System.out.println("x *= y is the same as x = x * 9");
        System.out.println("x /= y is the same as x = x / 9");
        System.out.println("x %= y is the same as x = x % 9");
        System.out.println("x &= y is the same as x = x & 9");
        System.out.println("x |= y is the same as x = x | 9");
        System.out.println("x ^= y is the same as x = x ^ 9");
        System.out.println("x >>= y is the same as x = x >> 9");
        System.out.println("x <<= y is the same as x = x << 9");

        System.out.println("########################");
        System.out.println("Comparison operators");
        System.out.println("x == y (Equal to)");
        System.out.println("x != y (Not equal)");
        System.out.println("x > y (Greater than)");
        System.out.println("x < y (Less than)");
        System.out.println("x >= y (Greater than or equal to)");
        System.out.println("x <= y (Less than or equal to)");

        System.out.println("########################");
        System.out.println("Logical Operators");
        System.out.println("&& (AND)");
        System.out.println("|| (OR)");
        System.out.print("! (NOT)");
    }
}
