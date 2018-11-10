package recog.hafizco.com.recog.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import java.util.List;
import recog.hafizco.com.recog.MyApplication;
import recog.hafizco.com.recog.entity.Confidences;
import recog.hafizco.com.recog.R;

public class MainActivity extends AppCompatActivity {

    private RuntimeExceptionDao<Confidences, Integer> confidences;
    private List<Confidences> list_confidences;
    private Confidences confidence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        confidence=new Confidences("1","2","3","4","5","6","7","8","9","10");

        confidences = MyApplication.getInstance().getDatabaseHelper().getConfidencesDao();

        confidences.create(confidence);//insert to database


    }

}

