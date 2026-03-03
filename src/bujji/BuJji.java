package bujji;

import java.util.ArrayList;
import java.util.List;

public class BuJji {
    private String type = "미선택";
    private String hotLevel = "미선택";
    private String saltyLevel = "미선택";
    private final List<String> toppings = new ArrayList<>();

    public boolean chooseType(int no) {
        switch (no) {
            case 1:
                type = "오리지널";
                return true;
            case 2:
                type = "치즈";
                return true;
            case 3:
                type = "햄폭탄";
                return true;
            default:
                type = "오리지널";
                return false;
        }
    }

    public boolean chooseHotLevel(int no) {
        switch (no) {
            case 1:
                hotLevel = "불지옥맛";
                return true;
            case 2:
                hotLevel = "씹지옥맛";
                return true;
            case 3:
                hotLevel = "염라대왕 맛";
                return true;
            case 4:
                hotLevel = "소화기관 종합 암 맛";
                return true;
            default:
                hotLevel = "씹지옥맛";
                return false;
        }
    }

    public boolean chooseSaltyLevel(int no) {
        switch (no) {
            case 1:
                saltyLevel = "겁나 짠맛";
                return true;
            case 2:
                saltyLevel = "사해 바다 맛";
                return true;
            case 3:
                saltyLevel = "성인병 다 오는 맛";
                return true;
            default:
                saltyLevel = "사해 바다 맛";
                return false;
        }
    }

    public boolean addTopping(int no) {
        switch (no) {
            case 1:
                toppings.add("연가시 사리");
                return true;
            case 2:
                toppings.add("밀웜 사리");
                return true;
            case 3:
                toppings.add("썩은 치즈");
                return true;
            case 4:
                toppings.add("장수풍뎅이 애벌래");
                return true;
            case 5:
                toppings.add("독버섯");
                return true;
            case 6:
                toppings.add("개구리알");
                return true;
            default:
                return false;
        }
    }

    public String getType() {
        return type;
    }

    public String getHotLevel() {
        return hotLevel;
    }

    public String getSaltyLevel() {
        return saltyLevel;
    }

    public String getToppingsText() {
        if (toppings.isEmpty()) {
            return "없음";
        }
        return String.join(", ", toppings);
    }
}