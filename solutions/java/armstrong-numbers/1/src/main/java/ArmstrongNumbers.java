class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int d = (int) Math.log10(numberToCheck) + 1, sum = 0, t = numberToCheck;
        while (t > 0) {
            sum += Math.pow(t % 10, d);
            t /= 10;
        }
        return sum == numberToCheck;
    }
    
}
