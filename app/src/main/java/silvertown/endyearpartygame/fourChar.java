package silvertown.endyearpartygame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class fourChar {

    //사자성어 120개
    private List<String> fourCharList = new ArrayList<>(Arrays.asList(
            "금의 환향", "오매 불망", "방방 곡곡", "오리 무중", "청출 어람", "이구 동성", "삼고 초려", "우왕 좌왕", "용두 사미", "죽마 고우",
            "작심 삼일", "우이 독경", "사필 귀정", "새옹 지마", "고진 감래", "일취 월장", "춘하 추동", "다다 익선", "장유 유서", "고성 방가",
            "과유 불급", "일석 이조", "개과 천선", "전화 위복", "사면 초가", "역지 사지", "결초 보은", "각골 난망", "대기 만성", "견물 생심",
            "감언 이설", "거두 절미", "근묵 자흑", "동문 서답", "선견 지명", "삼삼 오오", "기고 만장", "비일 비재", "신토 불이", "소탐 대실",
            "안하 무인", "명명 백백", "천고 마비", "어부 지리", "과유 불급", "유유 자적", "토사 구팽", "마이 동풍", "유비 무환", "칠전 팔기",
            "남녀 노소", "우유 부단", "형형 색색", "이심 전심", "십중 팔구", "감지 덕지", "표리 부동", "함흥 차사", "호가 호위", "금상 첨화",
            "설상 가상", "환골 탈태", "낭중 지추", "권모 술수", "경거 망동", "고군 분투", "구사 일생", "금시 초문", "기사 회생", "다다 익선",
            "동문 서답", "동병 상련", "속전 속결", "진퇴 양란", "천차 만별", "문전 성시", "일확 천금", "천재 지변", "유일 무이", "자문 자답",
            "청산 유수", "팔방 미인", "기상 천외", "입신 양명", "일거 양득", "산전 수전", "다사 다난", "백발 백중", "일심 동체", "인사 불성",
            "정정 당당", "자급 자족", "동고 동락", "백전 백승", "부전 자전", "대동 단결", "박학 다식", "물심 양면", "자업 자득", "유구 무언",
            "수어 지교", "군계 일학", "격세 지감", "동분 서주", "노심 초사", "주객 전도", "대동 소이", "화룡 점정", "사상 누각", "후안 무치",
            "오합 지졸", "막상 막하", "조삼 모사", "갑론 을박", "설왕 설래", "안중 유골", "용호 상박", "측은 지심", "속수 무책", "자포 자기"
    ));

    //일상 + 연예인 단어 147개
    private List<String> lifeList = new ArrayList<>(Arrays.asList(
            "호루 라기", "와이 셔츠" ,"핸드 크림" ,"오피 스텔" ,"멜로 영화" ,"호치 키스" ,"드라 이기" ,"전자 렌지","전기 장판" ,"안경 닦이"
            ,"발톱 깎이" ,"후라 이팬" ,"유통 기한" ,"쓰레 기통" ,"내로 남불" ,"자강 두천" ,"알레 르기" ,"오버 워치" ,"중고 나라" ,"제기 차기"
            ,"술래 잡기" ,"헬리 콥터" ,"오토 바이" ,"바이 올린" ,"계좌 번호" ,"알레 르기" ,"페브 리즈" ,"분리 수거" ,"초등 학생" ,"고등 학생"
            ,"공지 사항" ,"카카 오톡" ,"칠순 잔치" ,"코스 프레" ,"다이 어트" ,"국민 연금" ,"국가 대표" ,"귀차 니즘" ,"뉴발 란스" ,"다이 어리"
            ,"데스 노트" ,"르네 상스" ,"엽기 토끼" ,"매니 큐어" ,"멘탈 붕괴" ,"미니 어쳐" ,"바람 둥이" ,"보드 게임" ,"서든 어택" ,"신사 임당"
            ,"아이 디어" ,"알바 천국" ,"와이 파이" ,"우렁 각시" ,"이솝 우화" ,"인기 가요" ,"뮤직 뱅크" ,"중간 고사" ,"기말 고사" ,"커뮤 니티"
            ,"그래 피티" ,"크레 파스" ,"프로 포즈" ,"하모 니카" ,"하이 마트" ,"홈플 러스" ,"할리 우드" ,"할아 버지" ,"허리 케인" ,"허수 아비"
            ,"연지 곤지" ,"바리 스타" ,"대한 민국" ,"급속 충전" ,"취중 진담" ,"미세 먼지" ,"드래 곤볼" ,"타임 머신" ,"강강 술래" ,"직사 광선"
            ,"카사 노바" ,"아프 리카" ,"멜로 디언" ,"홈페 이지" ,"밀폐 용기" ,"인공 지능" ,"인공 위성" ,"봉사 활동" ,"썬글 라스" ,"낚시 조끼"
            ,"스승 의날" ,"어린 이날" ,"올리 브영" ,"피라 미드" ,"우루 과이" ,"동서 남북" ,"모나 리자" ,"비트 코인" ,"업데 이트" ,"테디 베어"
            ,"블랙 핑크" ,"오마 이걸" ,"뉴이 스트" ,"원더 걸스" ,"소녀 시대" ,"동방 신기" ,"강다 니엘" ,"최강 창민" ,"산다 라박" ,"레드 벨벳"
            ,"최다 니엘" ,"아스 트로" ,"레인 보우" ,"트와 이스" ,"아이 즈원" ,"여자 친구" ,"남자 친구" ,"우주 소녀" ,"위키 미키" ,"에프 엑스"
            ,"씨엔 블루" ,"젝스 키스" ,"인피 니트" ,"러블 리즈" ,"에이 핑크" ,"걸스 데이" ,"투애 니원" ,"미스 에이" ,"영웅 재중" ,"시아 준수"
            ,"천상 지희" ,"남녀 공학" ,"오랑 우탄" ,"고슴 도치" ,"아나 콘다" ,"이구 아나" ,"바다 표범" ,"개미 핥기" ,"하이 에나" ,"나무 늘보"
            ,"딱다 구리" ,"황조 롱이" ,"불가 사리" ,"카멜 레온" ,"호랑 나비" ,"카나 리아" ,"웰시 코기"
    ));

    // 음식 100개
    private List<String> foodList = new ArrayList<>(Arrays.asList(
            "비빔 국수", "양념 치킨", "브라 우니", "꼬리 곰탕", "참치 마요", "김치 찌개", "스테 이크", "스파 게티", "안동 찜닭", "마파 두부"
            , "순대 국밥", "3분 카레", "마라 샹궈", "총각 김치", "카스 테라", "달걀 말이", "샌드 위치", "초코 파이", "꿀꽈 배기", "쿠크 다스"
            , "뿌셔 뿌셔", "인디 언밥", "포테 토칩", "차돌 짬뽕", "바나 나킥", "민트 초코", "깐쇼 새우", "호두 과자", "델리 만쥬", "소떡 소떡"
            , "쟁반 짜장", "삼각 김밥", "블루 베리", "타코 야끼", "소갈 비찜", "우렁 쌈밥", "어리 굴젓", "닭볶 음탕", "감자 튀김", "부대 찌개"
            , "고추 잡채", "간장 게장", "양념 게장", "누네 띠네", "제육 볶음", "오향 장육", "닭도 리탕", "크로 와상", "페스 츄리", "잠발 라야"
            , "곱창 전골", "잔치 국수", "새우 튀김", "된장 찌개", "열무 김치", "자유 시간", "샤브 샤브", "파인 애플", "두루 치기", "카놀 라유"
            , "갑오 징어", "딸기 우유", "메추 리알", "무지 개떡", "박하 사탕", "새콤 달콤", "아이 스티", "안성 탕면", "코카 콜라", "송이 버섯"
            , "팽이 버섯", "프링 글스", "마요 네즈", "삼양 라면", "치즈 라면", "참치 김밥", "원조 김밥", "믹스 커피", "숯불 갈비", "요구 르트"
            , "맥도 날드", "롯데 리아", "맘스 터치", "치즈 스틱", "유부 초밥", "튀김 우동", "난자 완스", "시나 몬롤", "애플 파이", "오메 기떡"
            , "애니 타임", "차돌 박이", "표고 버섯", "두부 김치", "무뼈 닭발", "돼지 갈비", "짜파 구리", "퀘사 디아", "토마 호크", "가라 아게"
    ));

    // 영화드라마노래 60개
    private List<String> movieList = new ArrayList<>(Arrays.asList(
            "여고 괴담", "타이 타닉", "라따 뚜이", "범죄 도시", "라이 온킹", "벌써 1년", "위플 래시", "올드 보이", "윤희 에게", "스타 워즈"
            , "해리 포터", "어벤 저스", "겨울 왕국", "주토 피아", "모래 시계", "눈의 여왕", "백설 공주", "신데 렐라", "붉은 노을", "빨간 망토"
            , "선덕 여왕", "아이 리스", "엄지 공주", "에일 리언", "유리 구슬", "인어 공주", "장화 홍련", "피노 키오", "네모 의꿈", "하루 하루"
            , "남행 열차", "소주 한잔", "라라 랜드", "벚꽃 엔딩", "다행 이다", "인형 의꿈", "서울 의달", "거리 에서", "아시 나요", "피땀 눈물"
            , "우아 하게", "설국 열차", "뛰뛰 빵빵", "내꺼 하자", "피노 키오", "헤픈 우연", "들리 나요", "색즉 시공", "아이 언맨", "어린 왕자"
            , "식스 센스", "소림 축구", "영웅 본색", "내부 자들", "지친 하루", "샹들 리에", "블랙 펜서", "롤리 폴리", "맘마 미아", "샤이 보이"
    ));


    public fourChar() {
        Collections.shuffle(fourCharList);
        Collections.shuffle(lifeList);
        Collections.shuffle(foodList);
        Collections.shuffle(foodList);
    }

    public List<String> getFourCharList() {
        return fourCharList;
    }

    public void setFourCharList(List<String> fourCharList) {
        this.fourCharList = fourCharList;
    }

    public List<String> getLifeList() {
        return lifeList;
    }

    public void setLifeList(List<String> lifeList) {
        this.lifeList = lifeList;
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }

    public List<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<String> movieList) {
        this.movieList = movieList;
    }
}
