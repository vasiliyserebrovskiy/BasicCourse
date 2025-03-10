package homework_30.paymentSystem;

import java.util.Random;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */
public class ElectronicWallet implements PaymentSystem {
    private String personName; // Имя человека на кого открыт аккаунт
    private int accountNumber; // номер счета
    private double accountBalance; // сумма на счете (тут в долларах)

    private ElectronicWallet(String personName, double initialPayment) {
        this.personName = personName;
        this.accountNumber = generateAccountNumber();
        this.accountBalance = initialPayment;
    }

    public static ElectronicWallet createElectronicWallet(String personName, double initialPayment) {
        if (personName == null || personName.isEmpty()) {
            return null;
        } else if (initialPayment < 0) {
            return null;
        } else {
            return new ElectronicWallet(personName, initialPayment);
        }
    }

    private int generateAccountNumber() {
        Random random = new Random();
        return 10000000 + random.nextInt(9000000); // 8-значный номер
        //TODO: номер должен быть уникальным.
    }


    @Override
    public boolean withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Указана некорректная сумма!");
            return false;
        }
        if (accountBalance - amount < 0) {
            System.out.println("У вас недостаточно средств для снятия " + amount + " долларов!");
            return false;
        }
        //System.out.println("Вы успешно сняли " + amount + " долларов.");
        accountBalance -= amount;
        return true;
    }

    @Override
    public boolean depositTransfer(double amount) {
        if (amount > 0) {
            //System.out.println("Вы успешно пополнили свой счет на " + amount + " долларов.");
            accountBalance += amount;
            return true;
        }
        System.out.println("Указана некорректная сумма!");
        return false;
    }

    @Override
    public void checkBalance() {
        System.out.println("Остаток на вашем счете: " + accountBalance + " долларов");
    }

    @Override
    public String toString() {
        return String.format("Имя клиента: %s, Номер счета: %d, Баланс счета: %.2f долларов", personName, accountNumber, accountBalance);
    }

    public String getPersonName() {
        return personName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
