public class IfStatement {
    public static void main(String[] args) {
        // if statement: percabangan -> untuk mengeksekusi suatu action ketika sebuah kondisi terpenuhi (bernili true)
        var nilai = 60;
        var absen = 90;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        }else {
            System.out.println("Mohon Maaf Anda Belum Lulus!");
        }


    }
}
