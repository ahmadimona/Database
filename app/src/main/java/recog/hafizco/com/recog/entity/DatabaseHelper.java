package recog.hafizco.com.recog.entity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "recog.db";
    private static final int DATABASE_VERSION = 1;

    private RuntimeExceptionDao<Confidences, Integer> confidencesDao = null;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {

            Log.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, Confidences.class);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i2) {
        try {

            TableUtils.dropTable(connectionSource, Confidences.class, true);
            onCreate(sqLiteDatabase,connectionSource);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public RuntimeExceptionDao<Confidences, Integer> getConfidencesDao() {
        if(confidencesDao == null){
            confidencesDao = getRuntimeExceptionDao(Confidences.class);
        }
        return confidencesDao;

    }

    @Override
    public void close() {
        super.close();
        confidencesDao = null;
    }

    public void cleanAllCards(){

        getConfidencesDao().delete(getConfidencesDao().queryForAll());
    }

}