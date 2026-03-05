package Bai1;

import java.util.*;

public class ShippingFeeManager {
    public static void main(String[] args) {
        // Danh sách phí vận chuyển
        List<Double> shippingFees = Arrays.asList(30.5, 45.0, 50.0, 75.5, 30.5, 100.0, 60.0);

        // Tìm mức phí thấp nhất và cao nhất
        double minFee = Collections.min(shippingFees);
        double maxFee = Collections.max(shippingFees);

        // Tính tổng doanh thu và phí trung bình
        double totalRevenue = 0;
        for (double fee : shippingFees) {
            totalRevenue += fee;
        }
        double averageFee = totalRevenue / shippingFees.size();

        // Danh sách phí
        Set<Double> uniqueFeeSet = new HashSet<>(shippingFees);
        List<Double> uniqueFees = new ArrayList<>(uniqueFeeSet);
        uniqueFees.sort(Collections.reverseOrder());

        // Đếm số đơn hàng hỏa tốc
        int expressCount = 0;
        for (double fee : shippingFees) {
            if (fee >= 50.0) {
                expressCount++;
            }
        }

        // Hiển thị kết quả
        System.out.println("Min: " + minFee);
        System.out.println("Max: " + maxFee);
        System.out.println("Total express: " + totalRevenue);
        System.out.println("Average: " + averageFee);
        System.out.println("Unique (Desc): " + uniqueFees);
        System.out.println("Express: " + expressCount);
    }

}
