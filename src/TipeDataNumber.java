public class TipeDataNumber {

    public static void main(String[] args) {
        //tipe data number jika tidak diberi value maka defaultnya adalah 0
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000;
        long iniLong = 1_000_000_000; //untuk memudahkan membaca value bisa disertai underscore '_'

        // type data desimal/pecahan
        float iniFloat = 1.10F; //untuk mengetahui float diakhiri dengan karakter f/F
        double iniDouble = 1.10;

        // aturan konversi
        // otomatis: byte -> short -> int -> long -> float -> double
        // manual: double -> float -> long -> int -> short -> byte

        // contoh konversi manual
        byte byteBaru = (byte) iniInt;
    }
    
}
