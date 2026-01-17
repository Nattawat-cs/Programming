package Javaoop.A5Static;

public class Main {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //          rether than to any specific object.
        //          Commonly used for utility method or shared resources

        Friend friend1 = new Friend("Spongbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numofFriends);  // 4

        Friend.showfriend();                      // You have 4 total friends
    }
}
