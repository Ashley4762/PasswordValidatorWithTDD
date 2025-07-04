package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        }

        // Test Case 1: รหัสผ่านที่สั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");{
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed Short password is INVALID:");
        } else { 
            System.out.println("Test Case 1 FAILED:Expected INVALID but got "+ result1);
        }
        // Test Case 2: รหัสผ่านที่เป็นตัวอักษรอย่างเดียว WEAK
        PasswordStrength result2 = PasswordValidator.validate("reoerrte");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed letters only  is WEAK:");
        } else { 
            System.out.println("Test Case 2 FAILED:Expected WEAK but got "+ result2);
        }
    
            // Test Case 2: รหัสผ่านที่มีเเค่ตัวอักษรเเละตัวเลข MEDIUM
        PasswordStrength result3 = PasswordValidator.validate("nunew21");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed letters + digits is MEDIUM:");
        } else {
            System.out.println("Test Case 3 FAILED:Expected MEDIUM but got "+ result3);
        }
             // Test Case 3: รหัสผ่านที่มีทั้งตัวอัุกษรตัวเลขเเละสัญลักษณ์
        PasswordStrength result4 = PasswordValidator.validate("nunew21dqw@");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed letters + digits + special is STRONG:");
        } else {
            System.out.println("Test Case 4 FAILED:Expected STRONG but got "+ result4);
        }
       
            System.out.println("--------------------------------");
}
}