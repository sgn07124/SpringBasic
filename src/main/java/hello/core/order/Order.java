package hello.core.order;

public class Order {

    private Long memberId;  // 회원 id
    private String itemName;  // 제품 이름
    private int itemPrice;  // 제품 가격
    private int discountPrice;  // 할인 가격

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {  // 생성자 생성
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    /* 비즈니스 개산 로직 */
    public int calculatePrice() {
        return itemPrice - discountPrice;  // 최종 결과
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
