package lily.com.mysimplifyreader.presenter.impl;

import android.content.Context;

import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.view.HomeView;

/**
 * Created by Administrator on 2016/10/5.
 */

public class HomePresenterImpl implements Presenter {

    private Context context = null;
    private HomeView homeView = null;

    public HomePresenterImpl(Context context, HomeView homeView) {

        if (null == homeView) {
            throw new IllegalArgumentException("Constructor's parameters must not be Null");
        }

        this.context = context;
        this.homeView = homeView;
    }

    @Override
    public void initialized() {
        homeView.initializeViews();
    }
}
