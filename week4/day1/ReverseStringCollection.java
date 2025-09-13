package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection {
	public static void main(String[] args) {
        // Declare array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Convert array to List
        List<String> companyList = new ArrayList<>();
        for (String company : companies) {
            companyList.add(company);
        }

        // Sort the list in ascending order
        Collections.sort(companyList);
        System.out.println("Sorted List: " + companyList);

        // Iterate in reverse order
        System.out.println("Reversed List:");
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.println(companyList.get(i));
        }
    }

}
