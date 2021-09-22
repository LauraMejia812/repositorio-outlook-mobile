package co.com.tcs.training.retomobileoutlook.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

    public class Swipe implements Interaction {
        private int x,y,x2,y2;

        public Swipe(int x, int y, int x2, int y2) {
            this.x = x;
            this.y = y;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            new TouchAction((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver())
                    .press(PointOption.point(x,y))
                    .moveTo(PointOption.point(x2, y2))
                    .release()
                    .perform();
        }

        public static Swipe travel(int x, int y, int x2, int y2){
            return new Swipe(x,y,x2,y2);
        }
    }

