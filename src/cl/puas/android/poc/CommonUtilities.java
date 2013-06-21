package cl.puas.android.poc;

import android.content.Context;
import android.content.Intent;

/**
 * Created with IntelliJ IDEA.
 * User: sergio
 * Date: 13-06-13
 * Time: 09:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonUtilities {

    // give your server registration url here
    static final String SERVER_URL = "http://<server>/register.php";

    // Google project id
    static final String SENDER_ID = "";

    /**
     * Tag used on log messages.
     */
    static final String TAG = "Android GCM";

    static final String DISPLAY_MESSAGE_ACTION = "cl.puas.android.poc.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    /**
     * Notifies UI to display a message.
     * <p/>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }

}
