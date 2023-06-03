import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class OfficeQueueSystem {
    private PriorityQueue<Counter> counters;
    private List<Counter> counterList;

    public OfficeQueueSystem(int numberOfCounters) {
        counters = new PriorityQueue<>(numberOfCounters, Comparator.comparingInt(Counter::getQueueLength).thenComparing(Counter::getId));
        counterList = new ArrayList<>(numberOfCounters);
        for (int i = 0; i < numberOfCounters; i++) {
            Counter counter = new Counter(i);
            counters.offer(counter);
            counterList.add(counter);
        }
    }

    public void addClient() {
        Counter shortestQueueCounter = counters.peek();
        shortestQueueCounter.enqueueClient();
        counters.remove(shortestQueueCounter);
        counters.offer(shortestQueueCounter);
    }

    public void serveClient(int counterId) {
        Counter counter = counterList.get(counterId);
        counter.dequeueClient();
    }

    public int getCounterQueueLength(int counterId) {
        Counter counter = counterList.get(counterId);
        return counter.getQueueLength();
    }
}

class Counter implements Comparable<Counter> {
    private int id;
    private int queueLength;

    public Counter(int id) {
        this.id = id;
        this.queueLength = 0;
    }

    public void enqueueClient() {
        queueLength++;
    }

    public void dequeueClient() {
        if (queueLength > 0) {
            queueLength--;
        }
    }

    public int getQueueLength() {
        return queueLength;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Counter other) {
        int result = Integer.compare(this.queueLength, other.queueLength);
        if (result == 0) {
            result = Integer.compare(this.id, other.id);
        }
        return result;
    }
}