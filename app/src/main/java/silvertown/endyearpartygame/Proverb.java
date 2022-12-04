package silvertown.endyearpartygame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Proverb {

    private List<String> proverb_list = new ArrayList<>(Arrays.asList(
            "미운자식 / 떡하나 더 준다", "콩심은데 / 콩나고 팥심은데 팥난다", "발 없는 말이 / 천리 간다", "구슬이 서 말이라도 / 꿰어야 보배", "같은 값이면 / 다홍치마",
            "윗물이 / 맑아야 아랫물이 맑다", "쇠뿔도 / 단김에 빼라", "배보다 / 배꼽이 더 크다", "귀에 걸면 귀걸이 / 코에 걸면 코걸이", "개똥도 약에 쓰려면 / 없다",
            "등잔밑이 / 어둡다", "쥐구멍에도 / 볕 들 날 있다", "번갯불에 / 콩 볶아 먹는다", "금강산도 / 식후경", "개팔자가 / 상팔자",
            "고래싸움/ 에 새우등 터진다", "달면 삼키고 / 쓰면 뱉는다", "호랑이한테 물려가도 / 정신만 차리면 산다", "까마귀 날자 / 배 떨어진다", "구관이 / 명관이다",
            "목마른 사람이 / 우물판다", "사공이 많으면 / 배가 산으로 간다", "병주고 / 약준다", "꿩 먹고 / 알먹는다", "굿이나 보고 / 떡이나 먹자",
            "닭 쫓던 개 / 지붕 쳐다본다", "가는말이 고와야 / 오는 말이 곱다", "불난데 / 부채질", "마파람에 / 게 눈 감추듯", "귀신 씻나락 / 까먹는 소리",
            "낮말은 / 새가 듣고 밤말은 쥐가 듣는다", "가랑비에 / 옷 젖는 줄 모른다", "비온 뒤 / 땅이 굳는다", "못 먹는감 / 찔러나 본다", "꼬리가 길면 / 밟힌다",
            "작은 / 고추가 맵다", "갈 수록 / 태산이다", "빈 수레가 / 요란하다", "믿는 도끼에 / 발등 찍힌다", "냉수 먹고 / 이쑤시기",
            "평생소원이 / 누룽지", "낫 놓고 / 기억 자도 모른다", "세살 버릇 / 여든까지 간다", "백지장도 / 맞들면 낫다", "도토리 / 키재기",
            "열 길 물속은 알아도 / 한길 사람속은 모른다", "내 코가 / 석자다", "소 잃고 / 외양간 고친다", "아니 땐 굴뚝에 / 연기 날까", "돼지 목에 / 진주 목걸이",
            "호랑이도 / 제말하면 온다", "누워서 / 침뱉기", "시장이 / 반찬이다", "언 발에 / 오줌 누기", "땅 짚고 / 헤엄치기",
            "사촌이 땅을 사면 / 배가 아프다", "눈 가리고 / 아웅한다", "얌전한 고양이가 / 부뚜막에 먼저 올라간다", "오르지 못할 나무는 / 쳐다보지도 마라", "때리는 시어머니보다 / 말리는 시누이가 더 밉다",
            "식은죽 / 먹기", "계란으로 / 바위치기", "울며 겨자 / 먹기", "자다가 봉창 / 두드리기", "말은 제주도로 / 사람은 서울로",
            "누워서 떡 / 먹기", "다 된 밥에 / 재뿌린다", "원숭이도 나무에서 / 떨어질 때가 있다", "재주는 곰이 넘고 / 돈은 주인이 받는다", "말 한마디로 / 천냥 빚도 갚는다",
            "아닌 밤중에 / 홍두깨", "방귀 뀐 놈이 / 성낸다", "개천에서 / 용난다", "짚신도 / 제 짝이 있다", "매도 먼저 / 맞는놈이 낫다",
            "개구리 올챙이 / 적 생각 못 한다", "말이 씨 / 가 된다", "고생끝에 / 낙이온다", "하룻강아지 / 범 무서운 줄 모른다", "목구멍이 / 포도청",
            "똥 묻은 개가 / 겨묻은 개 나무란다", "마른하늘에 / 날벼락", "고슴도치도 / 지새끼가 제일 예쁘다", "호미로 막을것을 / 가래로 막는다", "물에 물탄듯 / 술에 술 탄듯",
            "빈대 잡으려고 / 초가삼간 태운다", "말로 주고 / 되로 받는다", "고양이 목에 / 방울 달기", "가재는 / 게 편", "물에 빠진놈 건져 놓으니까 / 봇짐 내놓으라 한다",
            "가는날이 / 장날이다", "바늘가는데 / 실 간다", "공든 탑이 / 무너지랴", "간에 /기별도 안간다", "번데기 앞에서 / 주름잡기",
            "우물 안 / 개구리", "바늘 도둑이 / 소 도둑 된다", "구더기 무서워서 / 장 못 담그랴", "강 건너 / 불구경", "빛좋은 / 개살구"
    ));



    public Proverb () {
        for (int i = 0; i < proverb_list.size(); i++) {
            proverb_list.set(i, proverb_list.get(i).replace("/ ", "/\n"));
        }

        Collections.shuffle(proverb_list);
    }

    public List<String> getProverb_list() {
        return proverb_list;
    }

    public void setProverb_list(List<String> proverb_list) {
        this.proverb_list = proverb_list;
    }
}
