public class App {
    public static void main(String[] args) throws Exception {

        // widening casting
        short price = 1000;

        int longcasting = price;

        System.out.println(longcasting);
        double DoubleCasting = price;
        float FloatCasting = price;
        System.out.println(DoubleCasting);
        System.out.println(FloatCasting);

        // end

        double weigth = 56.0;

        int ncasting = (int) weigth;
        System.out.println(ncasting);


        int maxScore = 500;
        int userScore = 438;

        float percentage = (float) maxScore / userScore * 100.0f;
        System.out.println(percentage);
    }
}
