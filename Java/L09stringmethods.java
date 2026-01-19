public class L09stringmethods {
    public static void main(String[] args) {

        String name = "Bro code";

        int length = name.length();
        char letter = name.charAt(0); // B
        int index = name.indexOf("o"); // 2
        int lastIndex = name.lastIndexOf("o"); // 5

        //name = name.toUpperCase(); BRO CODE
        //name = name.toLowerCase(); bro code
        //name = name.trim();
        //name = name.replace("o", "a");


        System.out.println(length);
        //Systm.out.println(name.isEmpty()); // ถ้าในตัวแปลไม่มีอักษรจะคือค่า true แต่ถ้ามีจะคืนค่า false

        //Ex.1
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        //Ex.2
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }
        
        //Ex.3
        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }



    }
}