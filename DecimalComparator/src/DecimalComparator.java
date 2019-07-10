public class DecimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

            numberOne = Math.round(numberOne * 1000);
                double newNum = numberOne / 1000;
            System.out.println(newNum);

//                Math.round(numberTwo * 1000);
//                numberTwo = numberTwo / 1000;


            if(numberOne == numberTwo) {
                return true;
            }else {
                return false;
            }
        }
}
