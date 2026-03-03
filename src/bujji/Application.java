package bujji;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ajime ajime = new Ajime(sc);

        while (true) {
            System.out.println("========== 부대찌개 선택 프로그램 ==========");
            System.out.println("1. 부대찌개 종류 선택");
            System.out.println("2. 맵기 선택");
            System.out.println("3. 염도 선택");
            System.out.println("4. 토핑 선택");
            System.out.println("5. 주문 완료");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");


            int currentStep = 1;
            int no = sc.nextInt();


            switch (no) {
                case 1:
                    if (currentStep != 1) {
                        System.out.println("종류는 선택하고 해야제 이것아");break; }
                    ajime.bdType();
                    currentStep = 2;
                    break;
                case 2:
                    if (currentStep != 2) {
                        System.out.println("그냥 맹탕먹을겨?");break; }
                    ajime.howHot();
                    currentStep = 3;
                    break;
                case 3:
                    if (currentStep != 3) {
                        System.out.println("고혈압있는겨?");break; }
                    ajime.howSalty();
                    currentStep = 4;
                    break;
                case 4:
                    if (currentStep != 4) {
                        System.out.println("그려 나는 돈 안벌고 몇 끼 굶으면 되는겨");break; }
                    ajime.Topping(); // 여기서 "예"로 끝났다고 가정
                    currentStep = 5;
                    break;
                case 5:
                    if (currentStep != 5) {
                        System.out.println("주문 완료를 눌러야지 내가 알제");break; }
                    ajime.FinalSelection();
                    return;
            }



            switch (no) {
                case 1:
                    ajime.bdType();
                    break;
                case 2:
                    ajime.howHot();
                    break;
                case 3:
                    ajime.howSalty();
                    break;
                case 4:
                    ajime.Topping();
                    break;
                case 5:
                    ajime.FinalSelection();
                    return;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("없는 번호입니다.");
                    break;
            }
        }
    }
}
