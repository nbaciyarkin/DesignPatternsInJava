package FacadePattern;

public class PartyFacade {

        MoviePlayFacade moviePlayFacade = new MoviePlayFacade();
        KitchenFacade kitchenFacade = new KitchenFacade();

        public void startParty(){
            System.out.println("Enjoying with friends and family at home...");
            System.out.println("------------------------------------------------");
            moviePlayFacade.startMovie();
            kitchenFacade.prepareFood();
            System.out.println("----------------------------------------------------");
            System.out.println("Enjoy Movie with Meal And Drink");
            System.out.println("----------------------------------------------------");
        }

        public void overParty(){
            System.out.println("Movie Completed.");
            moviePlayFacade.stopMovie();

            kitchenFacade.finishPreparing();
            System.out.println("Done!");
        }


}
