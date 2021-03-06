package host.exp.exponent.generated;

import java.util.ArrayList;
import java.util.List;

import host.exp.exponent.Constants;

public class AppConstants {

  public static final String VERSION_NAME = null;
  public static String INITIAL_URL = null;
  public static final boolean IS_DETACHED = false;
  public static final String SHELL_APP_SCHEME = null;
  public static final String RELEASE_CHANNEL = "default";
  public static boolean SHOW_LOADING_VIEW_IN_SHELL_APP = false;
  public static final List<Constants.EmbeddedResponse> EMBEDDED_RESPONSES;

  static {
    List<Constants.EmbeddedResponse> embeddedResponses = new ArrayList<>();

    // ADD EMBEDDED RESPONSES HERE
    // START EMBEDDED RESPONSES
    // END EMBEDDED RESPONSES
    EMBEDDED_RESPONSES = embeddedResponses;
  }

  // Called from expoview/Constants
  public static Constants.ExpoViewAppConstants get() {
    Constants.ExpoViewAppConstants constants = new Constants.ExpoViewAppConstants();
    constants.VERSION_NAME = VERSION_NAME;
    constants.INITIAL_URL = INITIAL_URL;
    constants.IS_DETACHED = IS_DETACHED;
    constants.SHELL_APP_SCHEME = SHELL_APP_SCHEME;
    constants.RELEASE_CHANNEL = RELEASE_CHANNEL;
    constants.SHOW_LOADING_VIEW_IN_SHELL_APP = SHOW_LOADING_VIEW_IN_SHELL_APP;
    constants.EMBEDDED_RESPONSES = EMBEDDED_RESPONSES;
    return constants;
  }
}
