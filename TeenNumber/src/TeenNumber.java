public class TeenNumber {

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if(isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

}
