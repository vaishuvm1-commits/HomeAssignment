package week3.day2;

public class ApiClient {


    public void sendRequest(String endpoint) {
        System.out.println("The endpoint is: " + endpoint);
    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("The endpoint is: " + endpoint +
                           "\nRequest Body: " + requestBody +
                           "\nStatus: " + requestStatus);
        if (requestStatus) {
            System.out.println("The user was found in the database");
        } else {
            System.out.println("The user was not found in the database");
        }
    }

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        apiClient.sendRequest("https://api.example.com/users/check");
        apiClient.sendRequest("https://api.example.com/users/check", "{\"mailid\": \"testleaf@example.com\"}", true);
    }
}
