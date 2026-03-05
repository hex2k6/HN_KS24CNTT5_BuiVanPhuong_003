package Bai2;


import java.util.*;

public class CategoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi danh mục
        System.out.println("Nhâp chuỗi các danh mục:");
        String input = scanner.nextLine();

        String[] categories = input.toLowerCase().split(",");

        Map<String, Integer> categoryMap = new HashMap<>();

        // Thống kê số lần xuất hiện
        for (String category : categories) {
            category = category.trim();
            categoryMap.put(category, categoryMap.getOrDefault(category, 0) + 1);
        }

        // Hiển thị thống kê
        System.out.println("Thống kê danh mục:");
        for (Map.Entry<String, Integer> entry : categoryMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Tìm theo tên danh mục
        System.out.println("Nhập tên danh mục cần tìm:");
        String searchCategory = scanner.nextLine().toLowerCase().trim();

        if (categoryMap.containsKey(searchCategory)) {
            System.out.println("danh mục '" + searchCategory + "' xuất hiện "
                    + categoryMap.get(searchCategory) + " lần.");
        } else {
            System.out.println("Danh mục'" + searchCategory + "' Không có.");
        }

        scanner.close();
    }
}
