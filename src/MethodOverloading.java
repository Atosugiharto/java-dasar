public class MethodOverloading {
    public static void main(String[] args) {
        // method overloading: kemampuan untuk membuat nama method yang sama lebih dari sekali
        // ketentuan: nama parameter tidak boleh ada yang sama

        sayHallo();
        sayHallo("Ato");
        sayHallo("Devi", "Ambarwati");

    }

    static void sayHallo(){
        System.out.println("Hallo");
    }
    
    static void sayHallo(String name){
        System.out.println("Hallo " + name);
    }

    static void sayHallo(String firtsName, String lastName){
        System.out.println("Hallo " + firtsName + " " + lastName);
    }
}
