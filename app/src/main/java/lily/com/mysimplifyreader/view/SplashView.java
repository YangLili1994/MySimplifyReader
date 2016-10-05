package lily.com.mysimplifyreader.view;

import android.view.animation.Animation;

/**
 * Created by Administrator on 2016/10/4.
 */

public interface SplashView {

    void animateBackgroundImage(Animation animation);

    void initializeViews(String versionName,String copyright,int backgroundResId);

    void navigateToHomePage();
}
