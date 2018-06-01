public class Main {

    private int answer = 0;
    private int a = 0;
    private int b = 0;

    private void start() {

        int maxProd = 0;

        for (int opA = 100; opA < 1000; opA++) {
            for (int opB = 100; opB < 1000; opB++) {

                int prod = opA * opB;

                if (isPalindrome(prod) && (prod>maxProd)) {
                    maxProd = prod;
                    this.a = opA;
                    this.b  = opB;
                }
            }

            this.answer = maxProd;
        }
    }

    private boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        String reversed = reverseString(strNum);
        if (strNum.equals(reversed)) return true;
        return false;
    }

    private String reverseString(String word){
        StringBuilder reversed = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--){
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }

    public static void main (String[] args) {
        Main x = new Main();
        x.start();
        System.out.println(Integer.toString(x.a) + " * " + Integer.toString(x.b) + " = " + Integer.toString(x.answer));
    }
}

