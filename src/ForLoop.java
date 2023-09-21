public class ForLoop {
    public static void main(String[] args) {
        // infinity loop, jika perulangan tidak berikan kondisi maka akan melakukan perluanan tanpa hendi
        // for(;;){
        //     System.out.println("Hallo world!");
        // }

        // pada for loop didalam kurung terdapat initial statement, kondisi, dan  post statement

        for(var counter = 1; counter <= 10 ; counter++){
            System.out.println("Perulangan ke-" + counter);
        }
    }
}
