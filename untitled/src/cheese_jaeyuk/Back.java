package cheese_jaeyuk;

import java.util.Scanner;

public class Back {

    Scanner sc = new Scanner(System.in);

    int c = 1;
    int m = 1;
    int s = 1;
    int r = 1;
    int t = 1;
    int price = 8000;

    public void cheeseOrder() {

        if (c==1) {

            while (true) {
                System.out.println("1.적게");
                System.out.println("2.보통");
                System.out.println("3.많이");
                break;
            }
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("치즈의 양은 '적게' 입니다.");
                    c++;
                    break;

                case 2:
                    System.out.println("치즈의 양은 '보통' 입니다.");
                    c++;
                    break;

                case 3:
                    System.out.println("치즈의 양은 '많이' 입니다.");
                    c++;
                    break;

            }
        }
        else {
            System.out.println("이미 선택된 옵션입니다!");
        }
    }

    public void meatOrder() {

        if(m==1) {

            while(true) {
                System.out.println("1.기본");
                System.out.println("2.지방 많이");
                System.out.println("3.살코기 많이");
                break;
            }
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("고기는 '기본' 입니다.");
                    m++;
                    break;

                case 2:
                    System.out.println("고기는 '지방 많이' 입니다.");
                    m++;
                    break;

                case 3:
                    System.out.println("고기는 '살코기 많이'입니다.");
                    m++;
                    break;

            }
        }
        else {
            System.out.println("이미 선택된 옵션입니다!");
        }
    }

    public void spicyOrder() {

        if (s==1) {

            while (true) {
                System.out.println("1.순하게");
                System.out.println("2.보통");
                System.out.println("3.맵게");
                break;
            }
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("맵기는 '순하게' 입니다.");
                    s++;
                    break;

                case 2:
                    System.out.println("맵기는 '보통' 입니다.");
                    s++;
                    break;

                case 3:
                    System.out.println("맵기는 '맵게' 입니다.");
                    s++;
                    break;

            }
        }
        else {
            System.out.println("이미 선택된 옵션입니다!");
        }
    }

    public void riceOrder() {

        if (r==1) {

            while (true) {
                System.out.println("1.기본");
                System.out.println("2.곱뺴기(+1000원)");
                break;
            }
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("밥 양은 '기본' 입니다.");
                    r++;
                    break;

                case 2:
                    System.out.println("밥 양은 '곱뺴기' 입니다. 추가요금 1000원이 부가됩니다.");
                    r++;
                    price =+ 1000;
                    break;

            }
        }
        else {
            System.out.println("이미 선택된 옵션입니다!");
        }
    }

    public void topingOrder() {

        if (t==1) {

            while (true) {
                System.out.println("1.추가안함");
                System.out.println("2.콩나물 추가(500원 추가)");
                System.out.println("3.당근 추가(500원 추가");
                System.out.println("4.둘 다 추가(1000원 추가)");
                break;
            }
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("토핑은 '추가 안함' 입니다.");
                    t++;
                    break;

                case 2:
                    System.out.println("토핑은 '콩나물 추가' 입니다.");
                    t++;
                    price += 500;
                    break;

                case 3:
                    System.out.println("토핑은 '당근 추가' 입니다.");
                    t++;
                    price += 500;
                    break;

                case 4:
                    System.out.println("토핑은 '둘 다 추가' 입니다.");
                    t++;
                    price += 1000;
                    break;
            }
        }
        else {
            System.out.println("이미 선택된 옵션입니다!");
        }
    }

    public void lastOrder() {
        if (c==1) {
            System.out.println("치즈 양이 선택되지 않았습니다!");
        }
        else if (m==1) {
            System.out.println("고기가 선택되지 않았습니다!");
        }
        else if (s==1) {
            System.out.println("맵기가 선택되지 않았습니다!");
        }
        else if (r==1) {
            System.out.println("밥 양이 선택되지 않았습니다!");
        }
        else if (t==1) {
            System.out.println("토핑이 선택되지 않았습니다!");
        }
        else {
            System.out.println("모든 옵션이 선택되었습니다 주문을 진행하겠습니다");
            System.out.println("가격은 "+ price + " 원 입니다");
        }
    }
}
