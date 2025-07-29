package Poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService ps = new PayService();

        while(true) {
            System.out.print("결제 방식을 입력하세요: ");
            String payOption = scanner.next();
            if(payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount = scanner.nextInt();

            ps.processPay(payOption,amount);
        }

    }
}
