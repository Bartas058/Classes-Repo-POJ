import java.util.Arrays;

interface RatingStrategy {
    public double calculateRating(double[] scores);
}

class Product {
    private String name;
    private double[] scores;
    
    public Product(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }
    
    public double rate(RatingStrategy ratingStrategy) {
        return ratingStrategy.calculateRating(scores);
    }
}

class Main {
    public static void main(String[] args) {
        Product product = new Product("Porsche Macan GTS", new double[]{3.3, 4.4, 5.5, 6.6, 8.8});

        RatingStrategy averageRating = new RatingStrategy() {
            @Override
            public double calculateRating(double[] scores) {
                double sum = 0;
                for (double score : scores) {
                    sum += score;
                }
                return sum / scores.length;
            }
        };
        
        RatingStrategy medianRatingStrategy = new RatingStrategy() {
            @Override
            public double calculateRating(double[] scores) {
                Arrays.sort(scores);
                int middle = scores.length / 2;
                if (scores.length % 2 == 0) {
                    return (scores[middle - 1] + scores[middle]) / 2;
                } else {
                    return scores[middle];
                }
            }
        };
        
        double average = product.rate(averageRating);
        double median = product.rate(medianRatingStrategy);

        System.out.println("Average rating: " + average);
        System.out.println("Median rating: " + median);

        if (average > median) {
            System.out.println("Average rating is higher than median rating.");
        } else if (median > average) {
            System.out.println("Median rating is higher than average rating.");
        } else {
            System.out.println("Average and median rating are equal.");
        }
    }
}