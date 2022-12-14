package chapters.chapter_05_Exercises;

public class Exercise5_39 {
    public static void main(String[] args) {
        double commision = 0;
        double sales = 30000;
        double salary = 5000;

        while (commision + salary <= 30_000) {
            commision = 0;
            commision += 5000 * 0.08;
            commision += 5000 * 0.10;
            commision += (sales - 10000) * 0.12;
            sales += 0.01;
        }

        System.out.printf("\n\nYou'll need to make $%1.2f in sales.", sales);
    }
}