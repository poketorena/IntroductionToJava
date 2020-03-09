/**
 * 銀行口座クラス。
 */
public class BankAccount {
    /**
     * 口座番号。
     */
    private String accountNumber;
    /**
     * 残高。
     */
    private int balance;

    BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "¥" + this.balance + "（口座番号=" + this.accountNumber + "）";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof BankAccount) {
            return ((BankAccount) o).accountNumber.trim().equals(this.accountNumber.trim());
        } else {
            return false;
        }
    }
}
