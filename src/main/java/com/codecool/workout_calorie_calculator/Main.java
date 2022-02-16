package com.codecool.workout_calorie_calculator;

import com.codecool.workout_calorie_calculator.workouts.WorkoutCalculator;
import com.codecool.workout_calorie_calculator.workouts.WorkoutType;

public class Main {
    public static void main(String[] args) {
        WorkoutCalculator calculator = new WorkoutCalculator();
        WorkoutType workoutType = WorkoutType.MORNING_YOGA;
        var calories = calculator.calculateCalories(workoutType);
    }
}
