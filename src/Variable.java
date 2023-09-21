public class Variable {
    //tempat menyimpan data
    //pada java variable bersifat static type, tidak dapat digabung dengan type data lain
    //tidak dapat di namakan dengan angka keseluruhan dan mengandung white space

    public static void main(String[] args) {
        String name;
        name = "Afifah Nurul Adzkia Sugiharto";

        System.out.println(name);

        //deklari variable bisa menggunakn keyword var, tapi harus disertai value
        var fullName = "Hasna Aqilatunnisa Sugiharto";
        var age = 12;
        System.out.println(fullName);
        System.out.println(age);

        //jika varibale ingin bersifat konstanta (value tidak bisa dirubah lagi) maka gunakan keyword final diikuti type data/var
        final String boyName = "Adipati Askary Sugiharto";
        System.out.println(boyName);
    }

}
