package lib;

public class PasswordValidator {

     /**
     * ตรวจสอบระดับความยากง่ายของรหัสที่ผู้ใช้งานตั้ง
     * @param password รหัสผ่านที่ผู้ใช้งานป้อนเข้ามา
     * @return ระดับความยากง่ายของรหัส โดยเรียงลำดับจาก(INVALID=ไม่ถูกต้อง,WEAK=ง่าย,MEDIUM=ปานกลาง, STRONG=ยาก)
     */
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if(password==null || password.length()<8)
        return PasswordStrength.INVALID;

        
        
        int minLength = 8;
        boolean letters = false;
        boolean digit = false;
        boolean special = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                 letters= true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                special = true;
            }
        }
        if (password == null || password.isEmpty() || minLength > password.length()){
            return PasswordStrength.INVALID;
        }
        else if (password.length() >= minLength && letters && digit && special) {
            return PasswordStrength.STRONG;
        } else if (password.length() >= minLength && letters  &&  digit) {
            return PasswordStrength.MEDIUM;
        } else if  (password.length() >= minLength && letters  ) {
            return PasswordStrength.WEAK; 
        }
        return null;

    }



            @Override
            public String toString() {
                return "PasswordValidator []";
            }
}

      
    
      
    