/*
 * file berisi penggunaan recursive method
 */

public class RecursiveMethod {
    public static void main(String[] args) {
        // System.out.println(factorialLoop(5));

        System.out.println(recursiveFactorial(5));
    }

    // factorial menggunakan perulangan biasa
    /**
     * method membuat factorial menggunakan recursive method
     * @param value = angka yang akan difactorialkan
     * @return = menampilkan hasil
     */
    
    static int factorialLoop(int value){
        var result = 1;

        for(var counter = 1; counter <= value; counter++){
            result *= counter;
        }

        return result;
    }

    //factorial menggunakan recursive method
    //perlu berhati-hati dalam menggunakan recursive method, jika terlalu dalam penumpukan stack maka akan terjadi error stackOverFlow
    static int recursiveFactorial(int value){
        if(value == 1){
            return 1;
        } else {
            return value * recursiveFactorial(value - 1);
        }
    }
}
