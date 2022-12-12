package silvertown.endyearpartygame;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;

public class QuestionActivity extends AppCompatActivity {

    int stackNum = 0;
    int personStackNum = 0;
    private QuestionList qList = new QuestionList();

    private TextView main_question;
    private TextView txt_person;

    private TextView btn_next;
    private TextView btn_prev;
    private Button btn_home;

    private TextView txt_num;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_view);

        //네비게이션 바 없애기 코드
        int uiOptions = getWindow().getDecorView().getSystemUiVisibility();
        int newUiOptions = uiOptions;
        boolean isImmersiveModeEnabled = ((uiOptions | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) == uiOptions);
        if (isImmersiveModeEnabled) {
            Log.i("Is on?", "Turning immersive mode mode off. ");
        } else {
            Log.i("Is on?", "Turning immersive mode mode on.");
        }
        newUiOptions ^= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
//        newUiOptions ^= View.SYSTEM_UI_FLAG_FULLSCREEN;
        newUiOptions ^= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        getWindow().getDecorView().setSystemUiVisibility(newUiOptions);


        main_question = findViewById(R.id.main_question);

        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);

        btn_home = findViewById(R.id.btn_home);
        txt_person = findViewById(R.id.txt_person);
        txt_num = findViewById(R.id.txt_num);

        //처음화면 텍스트 교체
        main_question.setText(qList.getQuestionList().get(stackNum));
        txt_num.setText(stackNum + "/" + qList.getQuestionList().size());

        Collections.shuffle(qList.getPersonList());
        txt_person.setText(qList.getPersonList().get(personStackNum));




        // 대음! 버튼 다음버튼입니다
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stackNum + 1 == qList.getQuestionList().size()){
                    stackNum = 0;
                    main_question.setText(qList.getQuestionList().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + qList.getQuestionList().size());
                } else {
                    stackNum++;
                    main_question.setText(qList.getQuestionList().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + qList.getQuestionList().size());
                }

                if (personStackNum + 1 == qList.getPersonList().size()) {
                    personStackNum = 0;
                    Collections.shuffle(qList.getPersonList());
                    txt_person.setText(qList.getPersonList().get(personStackNum));
                } else {
                    personStackNum++;
                    txt_person.setText(qList.getPersonList().get(personStackNum));
                }
            }
        });
        // 이전! 버튼입니다
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stackNum != 0) {
                    stackNum--;
                    main_question.setText(qList.getQuestionList().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + qList.getQuestionList().size());
                }

                if (personStackNum != 0) {
                    personStackNum--;
                    txt_person.setText(qList.getPersonList().get(personStackNum));
                }
            }
        });

        //홈버튼
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameChoiceActivity.class);
                startActivity(intent);
            }
        });

    }
}
