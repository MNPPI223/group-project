package ramenProject;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* comment. 신라면 만들기 프로젝트 문서화
            주제 : 신라면을 주문하고 만드는 과정을 적어보자
            1. 식당에 손놈이 들어온다.
            2. 점원이 주문을 받는다.
            3. 신라면 메뉴를 보여준다
            4. 맵기를 설정한다. 만약 여기서 메뉴를 선정하지 않으면 맵기를 선정할 수 없다.
            5. 라면의 이븐함을 선정한다. 이때 맵기를 선정하지 않으면, 이븐함을 선정할 수 없다.
            6. 프로그램을 종료한다.
     */

        // Application 에서 Human Ramen 한테 명령어를 보내는거야
        Ramen human = new Ramen();

        // 스캐너를 통해서 입력받자
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("============== 신라면 먹기 프로그램 ==============");
            System.out.println("1. 식당에 들어가서 자리 잡기");
            System.out.println("2. 라면을 주문하기");
            System.out.println("3. 라면의 맵기 정하기");
            System.out.println("4. 라면의 이븐함 정하기");
            System.out.println("5. 라면 다 먹기");
            System.out.println("9. 식당에서 나가기 ");
            System.out.println("메뉴를 선택해주세요! : ");

            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    human.menuPick();
                    break;
                case 2 :
                    human.orderRamen();
                    break;
                case 3 :
                    human.ramenHot();
                    break;
                case 4 :
                    human.ramenEven();
                    break;
                case 5 :
                    human.eatRamen();
                    break;
                case 9 :
                    System.out.println("잘먹었습니다. 나갑니다");
                    break;
                default:
                    System.out.println("잘못 선택했습니다... 다시 골라보세요");
                    break;
            }
            if (num == 9){
                break;
            }

        }


    }






}
