package lily.com.mysimplifyreader.ui.fragment;

import com.github.obsessive.library.base.BaseLazyFragment;

import lily.com.mysimplifyreader.view.BaseView;

/**
 * Created by Administrator on 2016/10/5.
 */

public abstract class BaseFragment extends BaseLazyFragment implements BaseView{


    @Override
    public void showError(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showException(String msg) {
        toggleShowError(true, msg, null);
    }

    @Override
    public void showNetError() {
        toggleNetworkError(true, null);
    }

    @Override
    public void showLoading(String msg) {
        toggleShowLoading(true, null);
    }

    @Override
    public void hideLoading() {
        toggleShowLoading(false, null);
    }

}
