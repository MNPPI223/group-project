package ramenProject;

public class Human {

  private boolean isSitting; // 자리를 잡았는지 안잡았는지를 나타내는 상태
  private boolean isOrder; // 주문이 완료되었는지 안되었는지를 나타내는 상태
  private boolean isHot;
  private int hot; // 라면의 맵기를 나타냄
  private int even; // 라면의 이븐함을 나타냄
  private boolean ramens; // 라면을 다 먹었는지 안먹었는지를 비교합니다.

    public void menuSelection() {

        if(isSitting) {
            System.out.println("자리를 이미 잡았습니다... 욕심쟁이...");
        } else{
            this.isSitting = true;
            System.out.println("자리에 앉았습니다... 물을 한 잔 마십니다...");
        }

    }

    public void orderRamens() {

        if (isOrder) {

            System.out.println("다음 메뉴를 선택해주세요....");
        } else {
            this.isOrder = true;
            System.out.println("메뉴 주문을 시작합니다. 저희 가게는 신라면만 판매합니다.");
            System.out.println("3번을 눌러 맵기를 설정해주십시오");
        }


    }

    public void ramenHots() {
        if (isOrder) {
            System.out.println("라면의 맵기를 설정해주세요! / 최대 10까지 있습니다.");
            this.hot += 1;
            System.out.println("현재 라면의 맵기는 " + this.hot + "단계입니다.");
        } else {
            isHot = true;
            System.out.println("맵기 설정이 완료되었습니다. 다음으로 넘어가주세요");
        }
    }

    public void ramenEvens() {
        if(isHot) {
            System.out.println("라면의 매움 정도를 정하지 못했습니다... 다시 선택해주세요");

        } else {
            System.out.println("라면의 익힌 정도를 설정해주세요! / 최대 5까지 있습니다.");
            this.even += 1;
            System.out.println("현재 라면의 익힘 정도는 " + this.even + "단계입니다.");
        }
    }

    public void eatRamen() {
        if(ramens){
            System.out.println("라멘을 다 드시지 못했어요... 다 먹어요");
        } else {
            System.out.println("다 드셨어요. NAGA 주세요");
        }

    }
}
