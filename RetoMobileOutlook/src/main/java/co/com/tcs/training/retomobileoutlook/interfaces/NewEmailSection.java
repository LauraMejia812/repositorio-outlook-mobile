package co.com.tcs.training.retomobileoutlook.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NewEmailSection {
    public static final Target CONTACT= Target.the("input contact").locatedBy("//*[@class='android.widget.MultiAutoCompleteTextView' and @instance='0']");
    public static final Target CONTACT_CLICK= Target.the("select contacto").locatedBy("//*[@class='android.widget.EditText' and @instance='1']");
    public static final Target AFFAIR= Target.the("input affair").locatedBy("//*[@class='android.widget.EditText' and @instance='1']");
    public static final Target MESSAGE= Target.the("input message").locatedBy("//*[@class='android.view.View' and @instance='0']");
    public static final Target BUTTON_SEND= Target.the("Select button send").locatedBy("//*[@class='android.widget.TextView' and @instance='2']");
    public static final Target ATTACHED= Target.the("opcion 'adjunto'").locatedBy("//*[@class='android.widget.TextView' and @instance='5']");
    public static final Target SELECT_ATTACHED= Target.the("Select 'adjunto'").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='3']");
    public static final Target POWER_POINT= Target.the("Select 'archivo para enviar'").locatedBy("//*[@class='android.view.ViewGroup' and @instance='3']");
    public static final Target ATTACHED_POWERPOINT= Target.the("Select 'archivo para enviar'").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='7']");
    public static final Target PHOTOS= Target.the("Select 'fotos para enviar imagen'").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='5']");
    public static final Target PHOTOS_SELECT= Target.the("Select 'imagen'").locatedBy("//*[@class='android.widget.ImageView' and @instance='0']");
    public static final Target SELECT_EVENT= Target.the("Select event").locatedBy("//*[@class='android.widget.TextView' and @instance='4']");
    public static final Target EVENT= Target.the("'Convertir el correo en evento'").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='5']");
    public static final Target SEND_EVENT= Target.the("Send event").locatedBy("//*[@class='android.widget.TextView' and @instance='2']");
    public static final Target SIZE_IMAGE= Target.the("Select size imagen").locatedBy("//*[@class='android.widget.LinearLayout' and @instance='5']");

}
