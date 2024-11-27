public class Main {
    public static void main(String[] args) {
        // Начальная сумма на счету клиента
        int initialBalance = 100;

        // Сумма пополнения
        int topUpAmount = 1100;

        // Порог для получения бонусов
        int bonusThreshold = 1000;

        // Расчёт бонусов
        int bonus = 0; // Изначально бонусов нет
        if (topUpAmount > bonusThreshold) {
            bonus = (topUpAmount / 100); // 1 рубль за каждые полные 100 рублей пополнения
        }

        // Итоговый баланс
        int totalBalance = initialBalance + topUpAmount + bonus;

        // Вывод результата
        System.out.println("Итоговый баланс: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}
