class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = Math.hypot(xOfDart, yOfDart);
        return d > 10 ? 0 : d > 5 ? 1 : d > 1 ? 5 : 10;
    }
}
