class Car1 {
    private int price;

    Car1(){
        System.out.println("난 메모리에 올라갈때 생성된다.");

    }
    Car1(int num){ //생성자는 함수명과 클래스명이 동일
        this.price = num;
        System.out.println("가격 : " + this.price);
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price ){
        this.price = price;
}
}

/*public class CarMan{
    public static void main(String[] args) {
        Car1 hglee = new Car1(1000);

        System.out.println(hglee.getPrice());
    }*/

