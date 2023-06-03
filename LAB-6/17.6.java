import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CinemaHall {
    private Map<Integer, Set<Integer>> reservations;

    public CinemaHall() {
        reservations = new HashMap<>();
    }

    public boolean reserveSeat(int row, int seat) {
        Set<Integer> seats = reservations.getOrDefault(row, new HashSet<>());
        if (!seats.contains(seat)) {
            seats.add(seat);
            reservations.put(row, seats);
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelReservation(int row, int seat) {
        Set<Integer> seats = reservations.get(row);
        if (seats != null && seats.contains(seat)) {
            seats.remove(seat);
            if (seats.isEmpty()) {
                reservations.remove(row);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isSeatReserved(int row, int seat) {
        Set<Integer> seats = reservations.get(row);
        return seats != null && seats.contains(seat);
    }
}