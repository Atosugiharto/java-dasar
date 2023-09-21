public class SwitchStatement {
    public static void main(String[] args) {
        // switch: percabangan dengan kondisi sederhana == (sama dengan)
        var nilai = 'E';

        // switch (nilai) {
        //     case 'A':
        //         System.out.println("Anda Lulus Dengan Sangat Baik!");
        //         break;
        //     case 'B':
        //         System.out.println("Anda Lulus Dengan Baik");
        //         break;
        //     default:
        //         System.out.println("Mohon Maaf Anda Belum Lulus!");
        //         break;
        // }

        // switch lambda: tidak memerlukan keyword break
        switch (nilai) {
            case 'A' -> System.out.println("Nilai Anda A");
            case 'B', 'C' -> System.out.println("Nilai Anda Cukup Baik");
            default -> System.out.println("Nilai Anda E");
        }

        // keyword yield: untuk membantu mengembalikan nilai (java v 15 keatas)
        String ucapan = switch (nilai) {
            case 'A' : yield "Nilai anda sangat baik";
            case 'B' : yield "Nilai anda cukup baik";
            default : yield "Nilai anda belum mencukupi";
        };

        System.out.println(ucapan);
    }
}
