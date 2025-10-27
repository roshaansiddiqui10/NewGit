import java.util.ArrayList;

public class BinarySearch {
    public static Flight searchFlightById(ArrayList<Flight> flights, String flightId) {
        int low = 0, high = flights.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Flight midFlight = flights.get(mid);

            if (midFlight.getFlightId().equals(flightId)) {
                return midFlight;
            } else if (midFlight.getFlightId().compareTo(flightId) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; // Flight not found
    }
}
