package recog.hafizco.com.recog;

import android.app.Application;
import android.content.Context;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import recog.hafizco.com.recog.entity.Confidences;
import recog.hafizco.com.recog.entity.DatabaseHelper;

public class MyApplication extends Application {

    private static MyApplication mInstance;
    private RuntimeExceptionDao<Confidences, Integer> confidences;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        confidences = MyApplication.getDatabaseHelper().getConfidencesDao();

    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

    public static Context getContext() {
        return mInstance.getApplicationContext();
    }

    public static DatabaseHelper getDatabaseHelper() {
        return (DatabaseHelper) OpenHelperManager.getHelper(getContext(), DatabaseHelper.class);
    }

}