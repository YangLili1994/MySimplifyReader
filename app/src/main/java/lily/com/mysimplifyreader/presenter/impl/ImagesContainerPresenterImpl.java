package lily.com.mysimplifyreader.presenter.impl;

import android.content.Context;

import lily.com.mysimplifyreader.interactor.CommonContainerInteractor;
import lily.com.mysimplifyreader.interactor.impl.CommonContainerInteractorImpl;
import lily.com.mysimplifyreader.presenter.Presenter;
import lily.com.mysimplifyreader.view.CommonContainerView;

/**
 * Created by Administrator on 2016/10/5.
 */

public class ImagesContainerPresenterImpl implements Presenter {

    private Context context;
    private CommonContainerInteractor commonContainerInteractor;
    private CommonContainerView commonContainerView;

    public ImagesContainerPresenterImpl(Context context, CommonContainerView commonContainerView) {
        if (null == commonContainerView){
            throw new IllegalArgumentException("Constructor's parameters must not be Null");
        }
        this.context = context;
        this.commonContainerView = commonContainerView;
        commonContainerInteractor = new CommonContainerInteractorImpl();
    }

    @Override
    public void initialized() {
        commonContainerView.initializePagerViews(commonContainerInteractor.getCommonCategoryList(context));
    }
}
