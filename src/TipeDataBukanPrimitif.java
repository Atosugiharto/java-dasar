public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        //tipe data primitif selalu mempunyai default value: char, boolean, number
        //String bukan tipe data primitif maka mempunyai default value null

        //type data primitif bisa juga dijadikan non primitif.
        //contoh: Byte, Integer, Character, Short, dll..

        //untuk konversi pada type data non promitif ke primitif menggunakan method
        int age = 24;
        Integer ageObject = age;

        int agePrimitif = ageObject.intValue();
        short ageShort = ageObject.shortValue();

        System.out.println(agePrimitif);
    }
}
