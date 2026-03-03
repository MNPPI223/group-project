package cheese_jaeyuk;

public class IngradientDTO {

    int price = 8000; // 기본 가격 = 8000원
    int cheese; // 치즈의 양(1.적게 2.보통 3.많이)
    int meat; // 고기 (1.기본 2.지방 많이 3.살코기 많이)
    int spicy; // 맵기 (1.순하게 2.보통 3.맵게)
    int rice; // (1.기본 2.곱뺴기 + 1000원)
    int toping; // (1.추가안함 2.콩나물 추가 3.당근 추가 4.둘 다 추가)

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public int getRice() {
        return rice;
    }

    public void setRice(int rice) {
        this.rice = rice;
    }

    public int getToping() {
        return toping;
    }

    public void setToping(int toping) {
        this.toping = toping;
    }
}
