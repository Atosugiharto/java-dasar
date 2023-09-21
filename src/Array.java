public class Array {
    public static void main(String[] args) {
        //array: sekumpulan data dengan type data yang sama
        String[] arrayString;
        arrayString = new String[3]; //length array
        arrayString[0] = "Aku";
        arrayString[1] = "Kamu";
        arrayString[2] = "Kita";

        System.out.println("====== cara pertama insialisai array ========");
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        
        // cara lain inisialisasi array
        int[] arrayInt = {
            1, 2, 3
        };
        
        String[] newArrayString = {
            "Ato", "Sugiharto"
        };
        
        System.out.println("======= cara lain inisialisasi array =======");
        System.out.println(arrayInt[0]);
        System.out.println(newArrayString[0]);
        
        // menghitung panjang array
        System.out.println("====== menghitung panjang array ========");
        System.out.println(arrayInt.length);

        //pada java tidak bisa menghapus element array, tetapi membuatnya kosong
        System.out.println("====== mengosongkan element array ========");

        arrayInt[0] = 0;
        newArrayString[0] = null;
        System.out.println(arrayInt[0]);
        System.out.println(newArrayString[0]);

        // array di dalam array
        System.out.println("====== array di dalam array ========");
        String[][] arrayInArray = { //menggunakan 2 kurung siku berpasangan [][]
            {"Tahfid", "Miscung"},
            {"Bopret", "Silvi"}
        };
        System.out.println(arrayInArray[0][0]); //cara panggil array di dalam array
    }
}
