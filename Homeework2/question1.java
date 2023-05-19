//A.Furkan ADAR
//200316012
import java.util.LinkedList;

public class question1{
    public static void main(String[] args) {
        LinkedList<Integer> waterPrices = new LinkedList<>();
        waterPrices.add(4); // Pazartesi
        waterPrices.add(5); // Salı
        waterPrices.add(5); // Çarşamba
        waterPrices.add(2); // Perşembe
        waterPrices.add(4); // Cuma
        waterPrices.add(6); // Cumartesi
        waterPrices.add(1); // Pazar

        int maxProfit = findMaxProfit(waterPrices);
        System.out.println("Kâr: " + maxProfit);
    }

    private static int findMaxProfit(LinkedList<Integer> prices) {
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 0; i < prices.size(); i++) {//su fiyatlarının alım günleri dolaşır
            int currentPrice = prices.get(i);
            for (int j = i + 1; j < prices.size(); j++) {//alım yapılan günün ertesi gününden başlayarak fiyatları dolaşır
                int nextPrice = prices.get(j);
                int currentProfit = nextPrice - currentPrice;
                if (currentProfit > maxProfit) {//mevcut kar en yüksekse güncelle
                    maxProfit = currentProfit;
                    buyDay = i; // Alım günü
                    sellDay = j; // Satış günü
                }
            }
        }

        if (maxProfit == 0) {
            System.out.println("Alım Satım Yok");
        } else {
            System.out.println(getDayOfWeek(buyDay)+ " günü al ");
            System.out.println(getDayOfWeek(sellDay)+ " günü sat ");
        }

        return maxProfit;
    }

    private static String getDayOfWeek(int dayIndex) {
        String[] daysOfWeek = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        return daysOfWeek[dayIndex];
    }
}

