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

    private Button btn_relay;
    private Button btn_chosung;
    private Button btn_speed;
    private Button btn_question;

    private Button btn_relay_fourChar;
    private Button btn_relay_star;
    private Button btn_relay_food;
    private Button btn_relay_animal;
    private Button btn_relay_life;
    private Button btn_relay_movie;
    private Button btn_relay_saying;
    private Button btn_relay_famous;

    private FrameLayout frame_relay;
    private FrameLayout frame_chosung;
    private FrameLayout frame_speed;
    private FrameLayout frame_question;

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


        //필드에서 생성해버리면 오류생김 그래서 밑에서 객체 생성
        btn_relay = findViewById(R.id.btn_relay);
        btn_chosung = findViewById(R.id.btn_chosung);
        btn_speed = findViewById(R.id.btn_speed);
        btn_question = findViewById(R.id.btn_question);

        btn_relay_fourChar = findViewById(R.id.btn_relay_fourChar);
        btn_relay_star = findViewById(R.id.btn_relay_star);
        btn_relay_food = findViewById(R.id.btn_relay_food);
        btn_relay_animal = findViewById(R.id.btn_relay_animal);
        btn_relay_life = findViewById(R.id.btn_relay_life);
        btn_relay_movie = findViewById(R.id.btn_relay_movie);
        btn_relay_saying = findViewById(R.id.btn_relay_saying);
        btn_relay_famous = findViewById(R.id.btn_relay_famous);


        frame_relay = findViewById(R.id.frame_relay);
        frame_chosung = findViewById(R.id.frame_chosung);
        frame_speed = findViewById(R.id.frame_speed);
        frame_question = findViewById(R.id.frame_question);


        //이어말하기 클릭
        btn_relay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backColorChange(btn_relay, frame_relay);
            }
        });

        //초성게임 클릭
        btn_chosung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backColorChange(btn_chosung, frame_chosung);
            }
        });

        //스피드퀴즈 클릭
        btn_speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backColorChange(btn_speed, frame_speed);
            }
        });

        //문제를 맞춰라 클릭
        btn_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backColorChange(btn_question, frame_question);
            }
        });


        // 이어말하기 게임 리스너
        btn_relay_fourChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_fourChar);
            }
        });
        btn_relay_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_star);
            }
        });

        btn_relay_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_food);
            }
        });
        btn_relay_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_animal);
            }
        });
        btn_relay_life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_life);
            }
        });
        btn_relay_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_movie);
            }
        });
        btn_relay_saying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_saying);
            }
        });
        btn_relay_famous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relayBtnBackground(btn_relay_famous);
            }
        });


    }

    // 선택된 버튼 배경색 : @drawable/middle_color_frame
    // 선택된 버튼 글자색 : @color/lightColor
    // 선택안된 버튼 배경색 : @drawable/menu_button
    // 선택안된 버튼 글자색 : Color.BLACK)
    // INVISIBLE이 공간은 남아있고 안보이는거
    // 파라미터로 들어오는 버튼이름으로 색 변환시키는 메소드. 전부다 선택안된 상태로 만들고 맨 밑에서 선택시키기
    // 게임 선택 버튼 색 전환
    public void backColorChange(Button btnName, FrameLayout frameName) {
        frame_relay.setVisibility(View.INVISIBLE);
        btn_relay.setBackgroundResource(R.drawable.menu_button);
        btn_relay.setTextColor(getResources().getColorStateList(R.color.black));

        frame_chosung.setVisibility(View.INVISIBLE);
        btn_chosung.setBackgroundResource(R.drawable.menu_button);
        btn_chosung.setTextColor(getResources().getColorStateList(R.color.black));

        frame_speed.setVisibility(View.INVISIBLE);
        btn_speed.setBackgroundResource(R.drawable.menu_button);
        btn_speed.setTextColor(getResources().getColorStateList(R.color.black));

        frame_question.setVisibility(View.INVISIBLE);
        btn_question.setBackgroundResource(R.drawable.menu_button);
        btn_question.setTextColor(getResources().getColorStateList(R.color.black));

        frameName.setVisibility(View.VISIBLE);
        btnName.setBackgroundResource(R.drawable.middle_color_frame);
        btnName.setTextColor(getResources().getColorStateList(R.color.lightColor));
    }


    // 이어말하기안의 게임 색 전환
    public void relayBtnBackground(Button btnName) {
        btn_relay_fourChar.setBackgroundResource(R.drawable.menu_button);
        btn_relay_fourChar.setTextColor(getResources().getColorStateList(R.color.black));

        btn_relay_star.setBackgroundResource(R.drawable.menu_button);
        btn_relay_star.setTextColor(getResources().getColorStateList(R.color.black));

        btn_relay_food.setBackgroundResource(R.drawable.menu_button);
        btn_relay_food.setTextColor(getResources().getColorStateList(R.color.black));

        btn_relay_animal.setBackgroundResource(R.drawable.menu_button);
        btn_relay_animal.setTextColor(getResources().getColorStateList(R.color.black));

        btn_relay_life.setBackgroundResource(R.drawable.menu_button);
        btn_relay_life.setTextColor(getResources().getColorStateList(R.color.black));

        btn_relay_movie.setBackgroundResource(R.drawable.menu_button);
        btn_relay_movie.setTextColor(getResources().getColorStateList(R.color.black));


        btn_relay_famous.setBackgroundResource(R.drawable.seconde_color_frame);
        btn_relay_famous.setTextColor(getResources().getColorStateList(R.color.lightColor));

        btn_relay_saying.setBackgroundResource(R.drawable.seconde_color_frame);
        btn_relay_saying.setTextColor(getResources().getColorStateList(R.color.lightColor));

        if (btnName == btn_relay_fourChar || btnName == btn_relay_star || btnName == btn_relay_food
                || btnName == btn_relay_animal || btnName == btn_relay_life || btnName == btn_relay_movie) {
            btnName.setBackgroundResource(R.drawable.middle_color_frame);
            btnName.setTextColor(getResources().getColorStateList(R.color.lightColor));

        } else {
            btnName.setBackgroundResource(R.drawable.middle_color_frame);
            btnName.setTextColor(getResources().getColorStateList(R.color.lightColor));
        }
    }

}
