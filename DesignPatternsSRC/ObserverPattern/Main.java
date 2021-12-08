package ObserverPattern;

public class Main {


    public static void main(String[] args) {


        FamousPerson Karsu_Dönmez = new FamousPerson("Karsu Dönmez");

        FamousPerson Ferit_Odmann = new FamousPerson("Ferit Odman");

         new Follower("Deniz",Karsu_Dönmez);
         new Follower("Robert",Karsu_Dönmez);
         new Follower("Stevan",Karsu_Dönmez);

         Follower jeff = new Follower("Jeff",Ferit_Odmann);
         new Follower("Sandra",Ferit_Odmann);
         new Follower("Olivia",Ferit_Odmann);

         System.out.println("\n");

         Karsu_Dönmez.setTweet("Which artists will be quests in any room?");

         System.out.println("\n");

         Ferit_Odmann.setTweet("It rarely ıt happens to me but ı was hitin' it hard tonight");

         System.out.println("\n");


        Ferit_Odmann.deAttach(jeff);

         System.out.println("\n");

         Karsu_Dönmez.setTweet("WHAAAAA I am the new FOOD COLUMINST of @andcgram Magazine !!!! ");

    }
}
