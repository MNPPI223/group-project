package bujji;

import java.util.Scanner;

public class Ajime {
    private Scanner sc;
    private BuJji buJji = new BuJji();

    public Ajime(Scanner sc) {
        this.sc = sc;
    }

    public void bdType() {
        System.out.println("\n[1단계] 부대찌개 종류를 선택하세요.");
        System.out.println("1. 오리지널");
        System.out.println("2. 치즈");
        System.out.println("3. 햄폭탄");

        int no = sc.nextInt();
        if (!buJji.chooseType(no)) {
            System.out.println("손가락에 살쪘나 번호도 못누르냐;;. 오리지널이나 처먹어부러");
        }
        Selection();
    }

    public void howHot() {
        System.out.println("\n[2단계] 맵기를 선택하세요.");
        System.out.println("1. 불지옥맛");
        System.out.println("2. 씹지옥맛");
        System.out.println("3. 염라대왕 맛");
        System.out.println("4. 소화기관 종합 암 맛");

        int no = sc.nextInt();
        if (!buJji.chooseHotLevel(no)) {
            System.out.println("워메 먹기도전에 덜덜 떨어부러서 번호를 잘 못누르것어? 그냥 씹지옥맛이나 묵어라");
        }
        Selection();
    }

    public void howSalty() {
        System.out.println("\n[3단계] 염도를 선택하세요.");
        System.out.println("1. 겁나 짠맛");
        System.out.println("2. 사해 바다 맛");
        System.out.println("3. 성인병 다 오는 맛");

        int no = sc.nextInt();
        if (!buJji.chooseSaltyLevel(no)) {
            System.out.println("번호도 못누르는거 보니께 딱 사해바다맛이 적당할것이여");
        }
        Selection();
    }

    public void Topping() {
        System.out.println("\n[4단계] 토핑을 선택하세요. (여러 번 선택 가능)");

        while (true) {
            System.out.println("토핑 메뉴");
            System.out.println("1. 연가시 사리");
            System.out.println("2. 밀웜 사리");
            System.out.println("3. 썩은 치즈");
            System.out.println("4. 장수풍뎅이 애벌래");
            System.out.println("5. 독버섯");
            System.out.println("6. 개구리알");

            int no = sc.nextInt();
            if (!buJji.addTopping(no)) {
                System.out.println("또 잘못눌렀는겨?? 그냥 처 먹지를 말러부러 그냥");
            }

            Selection();
            System.out.println("다 골랐는교?");
            System.out.println("1. 예");
            System.out.println("2. 아니오 (토핑 더 추가)");

            int done = sc.nextInt();
            if (done == 1) {
                break;
            }
            if (done != 2) {
                System.out.println("잘못 눌렀나가벼? 언능 더 고르셔.");
            }
        }
    }

    public void FinalSelection() {
        System.out.println("\n다 끝나부렀으 쬐까만 기다려잉.");
        Selection();
    }

    private void Selection() {
        System.out.println("----- 현재 선택 -----");
        System.out.println("종류: " + buJji.getType());
        System.out.println("맵기: " + buJji.getHotLevel());
        System.out.println("염도: " + buJji.getSaltyLevel());
        System.out.println("토핑: " + buJji.getToppingsText());
        System.out.println("--------------------");
    }
}