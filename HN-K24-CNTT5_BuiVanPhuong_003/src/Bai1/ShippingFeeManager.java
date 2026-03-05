//xây dựng chương trình phân loại vào 1 chuỗi các danh mục category
//sử dụng Map<String, Integer> để lưu trữ
//Key: Tên danh mục(Ví dụ:"Food", "Tech", "cloth"
//Value số lượng sản phẩm thuộc doanh mục đó
//chương trình cần:
// a. cho phép người dùng nhập chuỗi các danh mục cách nhau bằng dấu phẩy
// b. thống kê số lầm xuất hiện của từng doanh mục đó (ko phân biệt hoa thường)
// c. cho phép người dùng nhập tên 1 danh mục để tìm nhanh
// tên biến sẽ là tiếng anh
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