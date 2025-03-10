package homework_30.paymentSystem;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (10.03.2025)
 */

/**
 * Task 2
 * Платежные системы
 * Создайте интерфейс PaymentSystem с методами: +
 * withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета +
 * depositTransfer(double amount) (поступление денег на счет); +
 * checkBalance() (остаток на счете). +
 * Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс. +
 * Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте +
 * Убедитесь, что каждый класс корректно выполняет каждую из операций. +
 * ----------------------------------------------------------------------
 * Опционально
 * Добавить в интерфейс метод:
 * ----------------------------------------------------------------------
 * transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
 * Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
 * Банк -> Банк
 * Банк -> Кошелек
 * Кошелек -> Кошелек
 * Кошелек -> Банк
 */

public class PaymentSystemApp {

    public static void main(String[] args) {
        PaymentSystem bankAccount = BankAccount.createAccount("Alex", 0);
        System.out.println("\n==== Bank Account =====\n");
        System.out.println(bankAccount);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(100);
        bankAccount.depositTransfer(500);
        bankAccount.withdrawMoney(500);
        bankAccount.checkBalance();
        bankAccount.depositTransfer(5000);
        System.out.println(bankAccount);
        System.out.println("\n===== Electronic Wallet =====");
        PaymentSystem electronicWallet = ElectronicWallet.createElectronicWallet("Anna", 700);
        System.out.println(electronicWallet);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(100);
        electronicWallet.withdrawMoney(500);
        electronicWallet.depositTransfer(1000);
        System.out.println(electronicWallet);
        System.out.println("===== transferMoney =====");
        System.out.println("===== BankAccount -> BankAccount =====");
        PaymentSystem bankAccount2 = BankAccount.createAccount("Misha", 300);
        System.out.println(bankAccount);
        System.out.println(bankAccount2);
        PaymentSystem.transferMoney(bankAccount, bankAccount2, 500);
        System.out.println(bankAccount);
        System.out.println(bankAccount2);
        System.out.println("===== Electronic Wallet -> Electronic Wallet =====");
        PaymentSystem electronicWallet2 = ElectronicWallet.createElectronicWallet("Tania", 100);
        System.out.println(electronicWallet);
        System.out.println(electronicWallet2);
        PaymentSystem.transferMoney(electronicWallet, electronicWallet2, 200);
        System.out.println(electronicWallet);
        System.out.println(electronicWallet2);
        System.out.println("===== BankAccount -> Electronic Wallet =====");
        System.out.println(bankAccount);
        System.out.println(electronicWallet);
        PaymentSystem.transferMoney(bankAccount, electronicWallet, 100);
        System.out.println(bankAccount);
        System.out.println(electronicWallet);
        System.out.println("===== Electronic Wallet -> BankAccount =====");
        System.out.println(electronicWallet2);
        System.out.println(bankAccount2);
        PaymentSystem.transferMoney(electronicWallet2, bankAccount2, 100);
        System.out.println(electronicWallet2);
        System.out.println(bankAccount2);


    }

}
