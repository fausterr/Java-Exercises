public class zadanie7 {
    /*
    Given the method named getNumberOfMaxParam that takes three integer numbers.
    It should return the position of the first maximum in the order of the method parameters.
    The method should return 1, 2 or 3 respectively.
     */
    //DOBRE
    public static int getNumberOfMaxParam(int a, int b, int c) {
        if(a>=b) {
            if(a>=c) {
                return 1;
            } else {
                return 3;
            }
        } else {
            if(b>=c) {
                return 2;
            } else {
                return 3;
            }
        }
    }
    public static void main(String[] args) {
        final int a = 8;
        final int b = 8;
        final int c = 7;

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
