public class MethodVariableArgument {
    public static void main(String[] args) {

        sayCongrats("Ato", 80, 70);
        sayCongrats("Aldo", 70, 70);
    }

    static void sayCongrats(String name, int... values){ //... bermaksud jika pada pengisian parameter akan digunakan array
        int total = 0;
        for(int value: values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + " Anda Lulus!");
        } else {
            System.out.println("Maaf " + name + " Anda Belum Lulus!");
        }
    }
}
