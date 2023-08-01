import java.util.Random;

public class OTPGenerator {
    /*
     * This is our
     * OTP(One Time Password)
     * generator
     */
    static char[] OTP(int LengthOfOTP) {
        System.out.println("\t\n<--- Generating OTP --->\t\n");
        System.out.print("You OTP is : ");

        // Using Numerical Values
        String Numbers = "0123456789";

        // Using random method
        Random RandomMethod = new Random();

        char[] OTP = new char[LengthOfOTP];

        for (int i = 0; i < LengthOfOTP; i++) {
            OTP[i] = Numbers.charAt(RandomMethod.nextInt(Numbers.length()));
        }
        return OTP;
    }

    public static void main(String[] args) {
        System.out.println(OTP(4));
        System.out.println();
    }
}
