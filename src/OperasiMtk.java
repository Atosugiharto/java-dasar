public class OperasiMtk {
    public static void main(String[] args) {
        // operasi dasar mtk
        System.out.println("===== operasi dasar mtk =====");
        int a = 100;
        int b = 10;

        System.out.println(a + b); //penjumlahan
        System.out.println(a - b); //pengurangan
        System.out.println(a * b); //perkalian
        System.out.println(a / b); //pembagian
        System.out.println(a % b); //hasil bagi

        // augmented assigment (operasi ke dirinya sendiri)
        System.out.println("===== augmented assigment =====");
        a += 10; //sama dengan a = a + 10
        System.out.println(a);

        //unary operator (ditempatkan di depan variabel)
        System.out.println("===== unary operator =====");
        // ++ (a = a + 1)
        // -- (a = a - 1)
        // + (menjadikan value positif)
        // - (menjadikan value negatif)
        // ! (boolean kebalikan)
        int c = 100;
        System.out.println(c--);
        System.out.println(c++);

        // operator perbandingan (menghasilkan boolean true/false)
        System.out.println("===== operator perbandingan =====");
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

    }
}
