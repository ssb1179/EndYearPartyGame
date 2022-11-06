package silvertown.endyearpartygame;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class GameChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_choice);

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

        // 선택된 버튼 배경색 : @drawable/middle_color_frame
        // 선택된 버튼 글자색 : @color/lightColor
        // 선택안된 버튼 배경색 : @drawable/menu_button
        // 선택안된 버튼 글자색 : Color.BLACK)




        //이어말하기 화면
        FrameLayout frame_relay = findViewById(R.id.frame_relay);

        //이어말하기 클릭시 화면 일부 전환
        Button btn_relay = findViewById(R.id.btn_relay);
        btn_relay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame_relay.setVisibility(View.VISIBLE);
                btn_relay.setBackgroundResource(R.drawable.menu_button);
                btn_relay.setTextColor(Color.BLACK);
            }
        });
//@drawable/menu_button


        //초성게임 클릭시 화면 일부 전환
        Button btn_chosung = findViewById(R.id.btn_chosung);
        btn_chosung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame_relay.setVisibility(View.INVISIBLE);
                btn_chosung.setBackgroundResource(R.drawable.middle_color_frame);
                btn_chosung.setTextColor(getResources().getColorStateList(R.color.lightColor));
            }
        });


    }

    public void backColorChange(String btnName) {

        // 파라미터로 들어오는 버튼이름으로 색 변환시키기
    }
}
