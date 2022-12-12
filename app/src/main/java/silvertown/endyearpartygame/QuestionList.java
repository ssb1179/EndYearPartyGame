package silvertown.endyearpartygame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionList {

    private List<String> questionList = new ArrayList<>(Arrays.asList(
            "제일 머리가 \n단단할거 같은사람", "맨 손으로 박기볼레를 \n잡을 것 같은사람", "장난전화 개 뻔뻔하게 \n할 수 있을 것 같은 사람", "남장이 잘\n 어울릴 것 같은사람", "옷이나 물건 환불하러갈 때\n 같이 가고싶은사람",
            "사이비 말을 한 시간동안\n 들어줄 것 같은사람", "상견례 프리패스상", " 새벽에 몰래 김치찌개에\n 있는 돼지고기\n 잘 꺼내먹을 것 같은사람", "무인도에 같이 가고\n 싶은사람", "약속없으면 일주일동안\n 안씻을 것 같은사람",
            "전생에 나라를\n 팔았을 것 같은사람", "얼굴 근육이 가장\n 유연할 것 같은사람", "반년동안 연락없어도 \n잘 살고 있을 것 같은사람",  "여행 제일 같이 \n가고싶은사람(이유필수)", "아이돌 하면 \n잘 할 것 같은사람",
            "공포영화에서 제일 빨리\n 죽을거 같은사람", "사이코역이 제일 잘 어울리는사람", "가장 사기를 잘 \n당할 것 같은사람", "사기를 잘 칠 것 같은사람", "태극기부대 할아버지랑\n 맞다이 까도 \n기 안죽을 것 같은 사람",
            "작두 잘 탈 것 같은 사람", "벼락부자가 되면 \n호스트바 갈 것 같은 사람", "평생 굶어죽진\n 않을 것 같은 사람", "가장 정신연령\n 높아 보이는 사람", "혼자 무인도에 떨어져도 \n생존할 것 같은 사람",
            "남자였다면 고추 제일\n 컸을 것 같은 사람", "한발로 오래서있기\n 잘할것같은 사람", "무표정으로 과자 잘먹을것같은사람", "트름소리 클것같은사람", "만약 도둑질 해야 될때 \n제일 잘할거같은 사람",
            "싸움 제일 잘할거 같은 사람", "보고 있으면 미친놈이가\n 하게 되는 사람", "회사에 불 나면\n 제일 좋아할 사람", "내 집 마련 제일\n 빨리 할 것 같은 사람", "붕어빵 잘\n 만들 것같은 사람",
            "외출금지 자가격리 \n제일 못 할 것 같은 사람", "휴대폰 키자마자 \n유튜브 들어갈것같은 사람",  "아이스크림 대용량으로 \n사놓고 먹을것같은 사람", "갑자기 아이돌을 \n남편으로\n 데려올거 같은사람", "언젠가 크툴루 세계에\n 끌려가도 납득 될 거\n 같은사람",
            "평소에는 잘 안보이는데\n 겜하면 맨날 볼 수\n 있을것 같은사람", "공포영화에서 마지막까지\n 살아남을것 같은사람", "폐가체험 갔을때\n 동료 버리고\n 도망갈거 같은 사람", "폐가 체험 가서\n 빙의 돼가지고\n 동료 공격할거같은 사람", "장례식때\n 부활할것 같은사람"

            ));

    private List<String> personList = new ArrayList<>(Arrays.asList("김미나", "김미정", "박수현", "박희정", "서영서", "유지인", "홍지현"));


    public QuestionList() {
        Collections.shuffle(questionList);

    }

    public List<String> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<String> questionList) {
        this.questionList = questionList;
    }

    public List<String> getPersonList() {
        return personList;
    }

    public void setPersonList(List<String> personList) {
        this.personList = personList;
    }
}
