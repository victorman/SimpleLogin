package se.frand.app.simplelogin;

import com.parse.Parse;

/**
 * Created by victorfrandsen on 10/14/15.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        Parse.initialize(this,
                getString(R.string.parse_app_id),
                getString(R.string.parse_client_key));
    }
}
