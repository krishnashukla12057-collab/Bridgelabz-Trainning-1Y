class  ProfitAndLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit, profitPercent;

        if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            profitPercent = (profit / costPrice) * 100;

            System.out.println("Profit = INR " + profit);
            System.out.println("Profit Percentage = " + profitPercent + "%");
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;

            System.out.println("Loss = INR " + loss);
            System.out.println("Loss Percentage = " + lossPercent + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
