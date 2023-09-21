public class OperasiPerbandingan {
    public static void main(String[] args) {
        System.out.println("===== operasi dasar perbandingan =====");
        // && (dan)
        // || (atau)
        // ! (kebalikan)

        int nilaiAbsen = 75;
        int nilaiUjian = 80;

        boolean lulusAbsen = nilaiAbsen >= 75;
        boolean lulusUjian = nilaiUjian >= 75;

        var lulus = lulusAbsen && lulusUjian;
        System.out.println(lulus);
    }
}
