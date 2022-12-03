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
import silvertown.endyearpartygame.R;
import silvertown.endyearpartygame.fourChar;

public class FourFoodActivity extends AppCompatActivity {

    int stackNum = 0;
    private fourChar fc_list = new fourChar();

    private TextView main_fourFood;
    private TextView btn_next;
    private TextView btn_prev;
    private Button btn_home;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_food_view);

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


        main_fourFood = findViewById(R.id.main_fourFood);

        btn_next = findViewById(R.id.btn_next);
        btn_prev = findViewById(R.id.btn_prev);

        btn_home = findViewById(R.id.btn_home);

        main_fourFood.setText(fc_list.getFoodList().get(stackNum));

        // 대음! 버튼 다음버튼입니다
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stackNum++;
                main_fourFood.setText(fc_list.getFoodList().get(stackNum));

                if (stackNum == fc_list.getFoodList().size()) {
                    stackNum = 0;
                }
            }
        });
        // 이전! 버튼입니다
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stackNum != 0) {
                    stackNum--;
                    main_fourFood.setText(fc_list.getFoodList().get(stackNum));
                }
            }
        });

        // 홈버튼
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GameChoiceActivity.class);
                startActivity(intent);
            }
        });

    }
}