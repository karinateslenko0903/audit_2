public class AUDIT_2 {

    public static int setBit(int number, int bitPosition) {
        return number | (1 << bitPosition);
    }

    public static int clearBit(int number, int bitPosition) {
        return number & ~(1 << bitPosition);
    }

    public static void main(String[] args) {
        int number = 10;
        int bitPosition = 1;

        System.out.println("Оригінальне число: " + Integer.toBinaryString(number));
        int newNumberSet = setBit(number, bitPosition);
        System.out.println("Після увімкнення біту: " + Integer.toBinaryString(newNumberSet));
        int newNumberClear = clearBit(number, bitPosition);
        System.out.println("Після вимкнення біту: " + Integer.toBinaryString(newNumberClear));

        int C = 5;
        int b = 9;
        System.out.println("До обміну: a = " + C + ", b = " + b);
        C = C ^ b;
        b = C ^ b;
        C = C ^ b;
        System.out.println("Після обміну: a = " + C + ", b = " + b);

        int n = 10;
        double a = 1;
        double sum = a;

        System.out.println("a_0 = " + a);

        for (int i = 1; i < n; i++) {
            a += (double) i / (i + 1);
            sum += a;
            System.out.println("a_" + i + " = " + a);
        }
        System.out.println("Сума перших 10 членів: " + sum);
    }


}
