package mid1.math;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottNumbers = generator.generate();

        System.out.println("로또 번호: ");
        for (int lottNumber : lottNumbers) {
            System.out.println(lottNumber + " ");
        }
    }
}
