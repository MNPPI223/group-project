package cheese_jaeyuk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Back back = new Back();

        Scanner sc = new Scanner(System.in);

        int no;
        while (true) {
            System.out.println("어서오세요");
            System.out.println("옵션을 선택해주세요");
            System.out.println("1.치즈 양 ");
            System.out.println("2.고기 ");
            System.out.println("3.맵기 ");
            System.out.println("4.밥 양 ");
            System.out.println("5.토핑 추가 ");
            System.out.println("6.주문하기");
            System.out.println("7.종료");

            no = sc.nextInt();

            switch (no) {
                case 1:
                    back.cheeseOrder();
                    break;

                case 2:
                    back.meatOrder();
                    break;

                case 3:
                    back.spicyOrder();
                    break;

                case 4:
                    back.riceOrder();
                    break;

                case 5:
                    back.topingOrder();
                    break;

                case 6:
                    back.lastOrder();
                    break;

                case 7:
                    System.out.println("프로그램을 종료합니다.");

            }


            if (no == 7) {
                break;
            }
        }
    }


}
