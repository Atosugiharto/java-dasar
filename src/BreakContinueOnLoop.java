public class BreakContinueOnLoop {
    public static void main(String[] args) {
        // var counter = 1;

        // break untuk menghentikan seluruh perulangan
        // while(true){
        //     System.out.println("Perulangan " + counter);
        //     counter++;

        //     if(counter > 10){
        //         break;
        //     }
        // }

        // System.out.println("Perulangan berhenti");

        // continue untuk melewati perulangan sesuai kondisi
        for(var counter = 1; counter <= 20; counter++){
            if(counter % 2 == 0){
                continue;
            }

            System.out.println("Perulangan ganjil - " + counter);
        }
    }
}
