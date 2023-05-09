interface ExamGrader {
    public default double calculatePercentage(int score, int maxScore) {
        return ((double) score / maxScore) * 100;
    }

    public default String convertToLetterGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

class SimpleExamGrader implements ExamGrader {
    // Default class
}