class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }
}

class Flight {
    private String origin;
    private String destination;
    private int passengers;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getPassengers() {
        return passengers;
    }

    public Flight(String origin, String destination, int passengers) throws InvalidFlightException {
        if (origin.equals(destination)) {
            throw new InvalidFlightException("The place of departure and destination must not be the same");
        }

        if (passengers < 1) {
            throw new InvalidFlightException("The number of passengers must be greater than zero");
        }

        this.origin = origin;
        this.destination = destination;
        this.passengers = passengers;
    }
}