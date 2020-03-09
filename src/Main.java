public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("4649", 1592);
        BankAccount bankAccount2 = new BankAccount(" 4649", 1592);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);

        if (bankAccount1.equals(bankAccount2)) {
            System.out.println("同じだよ。");
        } else {
            System.out.println("違うよ。");
        }
    }
}
