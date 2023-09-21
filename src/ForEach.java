public class ForEach {
    public static void main(String[] args) {

        // forEach berfungsi untuk melakukan perulangan pada array
        String[] arrayString = {
            "ato", "sugiharto", "ibnu", "gunawan"
        };

        // jika melakukan perulangan array menggunakan perulangan biasa
        // for(var i = 0; i < arrayString.length; i++){ // i mendeskripsikan index
        //     System.out.println(arrayString[i]);
        // }

        //menggunakan cara forEach
        for(var element : arrayString){
            System.out.println(element);
        }
    }
}
