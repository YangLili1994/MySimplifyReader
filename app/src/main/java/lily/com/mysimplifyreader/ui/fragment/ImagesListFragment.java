package lily.com.mysimplifyreader.ui.fragment;

import android.view.View;

import com.github.obsessive.library.eventbus.EventCenter;

import lily.com.mysimplifyreader.R;

/**
 * Created by Administrator on 2016/10/5.
 */

public class ImagesListFragment extends BaseFragment {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_images_list;
    }

    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
