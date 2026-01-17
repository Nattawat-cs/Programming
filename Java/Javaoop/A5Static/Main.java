package Javaoop.A5Static;

public class Main {
    public static void main(String[] args){

        Friend friend1 = new Friend("Spongbob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(Friend.numofFriends);  // 4

        Friend.showfriend();                      // You have 4 total friends
    }
}
