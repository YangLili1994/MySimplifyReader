package lily.com.mysimplifyreader.interactor;

import android.content.Context;

import java.util.List;

import lily.com.mysimplifyreader.entitiy.BaseEntity;

/**
 * Created by Administrator on 2016/10/5.
 */

public interface CommonContainerInteractor {

    List<BaseEntity> getCommonCategoryList(Context context);
}
