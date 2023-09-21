public class MethodReturnValue {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // System.out.println("method sum: " + sum(a, b));
        
        System.out.println("=== method operation + ===");
        System.out.println(operation(a, "+", b));
        
        System.out.println("=== method operation - ===");
        System.out.println(operation(a, "-", b));
    }

    //untuk dapat menghasilkan return value maka keyword void pada method diganti dengan type data yang ingin di hasilkan dari method tersebut
    //menggunakan keyword return diikuti dengan data yang dikembalikannya
    //di java hanya bisa mengembalikan 1 data
    static int sum(int value1, int value2){
        int total = value1 + value2;

        return total;
    }

    // dapat melakukan beberapa return jika dalam percabangan
    static int operation(int value1, String operasi, int value2){
        switch(operasi){
            case "+" : return value1 + value2;
            case "-" : return value1 - value2;
            case "*" : return value1 * value2;
            case "/" : return value1 / value2;
            default : return 0;
        }
    }
}
