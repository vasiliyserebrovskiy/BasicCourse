package homework_30.paymentSystem;

import java.util.Random;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class BankAccount implements PaymentSystem {
    private String personName; // Имя человека на кого открыт аккаунт
    private int accountNumber; // номер счета
    private double accountBalance; // сумма на счете (тут в евро)

    private BankAccount(String personName, double initialPayment) {
        this.personName = personName;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = initialPayment;
    }

    public static BankAccount createAccount(String personName, double initialPayment) {
        if (personName == null || personName.isEmpty()) {
            return null;
        } else if (initialPayment < 0) {
            return null;
        } else {
            return new BankAccount(personName, initialPayment);
        }
    }

    private int generateAccountNumber() {
        Random random = new Random();
        return 1000000000 + random.nextInt(900000000); // 10-значный номер
        //TODO: номер должен быть уникальным.
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Указана некорректная сумма!");
            return false;
        }
        if (accountBalance - amount < 0) {
            System.out.println("У вас недостаточно средств для снятия " + amount + " евро!");
            return false;
        }
        //System.out.println("Вы успешно сняли " + amount + " евро.");
        accountBalance -= amount;
        return true;
    }

    @Override
    public boolean depositTransfer(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            //System.out.println("Вы успешно пополнили свой счет на " + amount + " евро.");
            return true;
        }
        System.out.println("Указана некорректная сумма!");
        return false;
    }

    @Override
    public void checkBalance() {
        System.out.println("Остаток на вашем счете: " + accountBalance + " евро");
    }

    @Override
    public String toString() {
        return String.format("Имя клиента: %s, Номер счета: %d, Баланс счета: %.2f евро", personName, accountNumber, accountBalance);
    }

    public String getPersonName() {
        return personName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
