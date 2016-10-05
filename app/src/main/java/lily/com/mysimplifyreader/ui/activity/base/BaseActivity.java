package lily.com.mysimplifyreader.ui.activity.base;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;

import com.github.obsessive.library.base.BaseAppCompatActivity;

import butterknife.ButterKnife;
import lily.com.mysimplifyreader.R;

/**
 * Created by Administrator on 2016/10/4.
 */

public abstract class BaseActivity extends BaseAppCompatActivity{

    //子类中需要用到
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (isApplyKitkatTranslucency()){
            //设置状态栏着色
            setSystemBarTintDrawable(ContextCompat.getDrawable(this,R.drawable.sr_primary));
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        toolbar = ButterKnife.findById(this,R.id.common_toolbar);

        if (null != toolbar){
            //将toolbar和actionbar关联起来  这样在activity中可以监听toolbar的点击事件
            setSupportActionBar(toolbar);
            //决定左上角的图标是否可以点击
            getSupportActionBar().setHomeButtonEnabled(true);
            //给左上角图标的左边加上一个返回的图标
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    protected abstract boolean isApplyKitkatTranslucency();
}
