

import screens.InfoScreen;

import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {
        InfoScreen intro = new InfoScreen();
        intro.display();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            System.out.println("sleep is not working");
        }
        intro.menu();
    }
}
