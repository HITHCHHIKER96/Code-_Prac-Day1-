public class sum_of_digit {
    static int sum_digit(int num){
        int rem = 0;
        while(num != 0){
            int i = num % 10;
            rem += i;
            num = num / 10;
        }
        return rem;
    }
    public static void main(String[] args) {
        System.out.println(sum_digit(564));
    }
}

/*123 = 1 + 2 + 3
i = 1
num = 23
*/