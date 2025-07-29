package Poly.ex.pay0;

public abstract class PayStore {
    public static PayInterface setPay( String option) {
        PayInterface pi;
        if(option.equals("kakao")) {
            pi = new KakaoPay();
        } else if(option.equals("naver")) {
            pi = new NaverPay();
        } else if(option.equals("new")) {
            pi = new NewPay();
        }else {
            pi = new DefaultPay();
        }

        return pi;
    }
}
