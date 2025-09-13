package week4.day1;

public class APIClient {

	// First overloaded method - accepts only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Second overloaded method - accepts endpoint, requestBody, and requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);

        if (requestStatus) {
            System.out.println("Request to " + endpoint + " was successful!");
        } else {
            System.out.println("Request to " + endpoint + " failed!");
        }
    }

    // Main method to test overloaded methods
    public static void main(String[] args) {
        // Create object of APIClient
        APIClient client = new APIClient();

        // Call first version of sendRequest
        client.sendRequest("https://api.example.com/getUsers");

        System.out.println("-----");

        // Call second version of sendRequest
        client.sendRequest("https://api.example.com/addUser",
                           "{ \"name\": \"John\", \"age\": 30 }",
                           true);
    }
}
