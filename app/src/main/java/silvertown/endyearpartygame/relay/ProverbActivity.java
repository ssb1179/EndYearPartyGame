package silvertown.endyearpartygame.relay;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import silvertown.endyearpartygame.GameChoiceActivity;
import silvertown.endyearpartygame.Proverb;
import silvertown.endyearpartygame.R;
import silvertown.endyearpartygame.fourChar;

public class ProverbActivity extends AppCompatActivity {

    int stackNum = 0;
    private Proverb list = new Proverb();

    private TextView main_proverb;
    private TextView btn_next;
    private TextView btn_prev;
    private Button btn_home;

    private TextView txt_num;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proverb_view);

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


        main_proverb = findViewById(R.id.main_proverb);

        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);

        btn_home = findViewById(R.id.btn_home);
        txt_num = findViewById(R.id.txt_num);

        main_proverb.setText(list.getProverb_list().get(stackNum));
        txt_num.setText(stackNum + "/" + list.getProverb_list().size());

        // 대음! 버튼 다음버튼입니다
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stackNum + 1 == list.getProverb_list().size()){
                    stackNum = 0;
                    main_proverb.setText(list.getProverb_list().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + list.getProverb_list().size());
                } else {
                    stackNum++;
                    main_proverb.setText(list.getProverb_list().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + list.getProverb_list().size());
                }
            }
        });
        // 이전! 버튼입니다
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stackNum != 0) {
                    stackNum--;
                    main_proverb.setText(list.getProverb_list().get(stackNum));
                    txt_num.setText(stackNum+1 + "/" + list.getProverb_list().size());
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
