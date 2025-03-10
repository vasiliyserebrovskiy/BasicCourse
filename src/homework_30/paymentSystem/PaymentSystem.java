package homework_30.paymentSystem;

public interface PaymentSystem {

    double EUR_TO_USD_RATE = 1.08;
    double USD_TO_EUR_RATE = 0.91;

    boolean withdrawMoney(double amount); // снятие денег

    boolean depositTransfer(double amount); // поступление денег на счет

    void checkBalance(); // проверка баланса

    static boolean transferMoney(PaymentSystem fromAccount, PaymentSystem toAccount, double amount) {

        if (fromAccount != null && toAccount != null && amount > 0) {
            // со счета банка на счет банка
            if (fromAccount instanceof BankAccount && toAccount instanceof BankAccount) {
                if (fromAccount.withdrawMoney(amount)) {
                    toAccount.depositTransfer(amount);
                    System.out.println("Перевод в " + amount + " евро успешно выполнен со счета {" + fromAccount + "} на счет {" + toAccount + "}");
                    return true;
                } else {
                    System.out.println("На счёте {" + fromAccount + "} недостаточно средств для завершения операции!");
                    return false;
                }
            }
            // со счета валета на счет валета
            if (fromAccount instanceof ElectronicWallet && toAccount instanceof ElectronicWallet) {
                if (fromAccount.withdrawMoney(amount)) {
                    toAccount.depositTransfer(amount);
                    System.out.println("Перевод в " + amount + " долларов успешно выполнен со счета {" + fromAccount + "} на счет {" + toAccount + "}");
                    return true;
                } else {
                    System.out.println("На счёте {" + fromAccount + "} недостаточно средств для завершения операции!");
                    return false;
                }
            }

            // с банка на валет
            if (fromAccount instanceof BankAccount && toAccount instanceof ElectronicWallet) {
                if (fromAccount.withdrawMoney(amount)) {
                    toAccount.depositTransfer(convertEurToUsd(amount));
                    System.out.println("Перевод в " + amount + " евро успешно выполнен со счета {" + fromAccount + "} на счет {" + toAccount + "}");
                    return true;
                } else {
                    System.out.println("На счёте {" + fromAccount + "} недостаточно средств для завершения операции!");
                    return false;
                }
            }

            // с валета на банк
            if (fromAccount instanceof ElectronicWallet && toAccount instanceof BankAccount) {
                if (fromAccount.withdrawMoney(amount)) {
                    toAccount.depositTransfer(convertUsdToEur(amount));
                    System.out.println("Перевод в " + amount + " долларов успешно выполнен со счета {" + fromAccount + "} на счет {" + toAccount + "}");
                    return true;
                } else {
                    System.out.println("На счёте {" + fromAccount + "} недостаточно средств для завершения операции!");
                    return false;
                }
            }
        }
        System.out.println("Операция не выполнена! Невалидные параметры!");
        return false;
    }

    // Конвертация валют
    static double convertEurToUsd(double amount) {
        return amount * EUR_TO_USD_RATE;
    }

    static double convertUsdToEur(double amount) {
        return amount * USD_TO_EUR_RATE;
    }


}
