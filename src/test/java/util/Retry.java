package util;


public class Retry {
    // OPTIONAL TEST THAT WORKS TO SAVE TIME DURING TEST 3 TIMES
    private int count = 0;
    private static int maxTry = 3;

//    @Override
//    public boolean retry(ITestResult iTestResult) {
//        if (!iTestResult.isSuccess()) {
//            if (count < maxTry) {
//                count++;
////                iTestResult.setStatus(iTestResult.FAILURE);
////                return true;
////            } else {
////                iTestResult.setStatus(iTestResult.FAILURE);
////            }
////        } else {
////            iTestResult.setStatus(iTestResult.SUCCESS);
////        }
////        return false;
////    }
}
