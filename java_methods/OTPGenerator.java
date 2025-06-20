package Java_Methods;

import java.util.Arrays;

public class OTPGenerator {

    // Generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); // 100000 to 999999
    }

    // Generate and store 10 OTPs
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Check if all generated OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateMultipleOTPs(10);

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        System.out.println("\nAre all OTPs unique? " + (areOTPsUnique(otps) ? "Yes" : "No"));
    }
}
