package com.codecool.workout_calorie_calculator.workouts;

public class WorkoutCalculator {

    public double calculateCalories(WorkoutType workoutType) {
        double calories = 0;
        switch (workoutType)
        {
            case MORNING_YOGA:
                calories += 90 * 0.2 + 100 * 0.7 + 120 * 0.1;
                break;
            case HIIT:
                calories += 120 * 0.2 + 170 * 0.7 + 160 * 0.1;
                break;
            case RUNNING:
                calories += 120 * 0.3 + 170 * 0.6 + 160 * 0.1;
                break;
            case STRENGTHENING:
                calories += 100 * 0.3 + 130 * 0.5 + 130 * 0.2;
                break;
        }
        return calories;

    }
}
