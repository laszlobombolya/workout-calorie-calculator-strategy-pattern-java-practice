package com.codecool.workout_calorie_calculator.workouts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutCalculatorTest {

    @Test
    public void CalculateMorningYoga_validResponse()
    {
        double expected = 100;
        WorkoutType type = WorkoutType.MORNING_YOGA;
        WorkoutCalculator calculator = new WorkoutCalculator();

        double result = calculator.calculateCalories(type);

        assertEquals(expected, result);

    }

    @Test
    public void CalculateHIIT_validResponse()
    {
        double expected = 159;
        WorkoutType type = WorkoutType.HIIT;
        WorkoutCalculator calculator = new WorkoutCalculator();

        double result = calculator.calculateCalories(type);

        assertEquals(expected, result);
    }

    @Test
    public void CalculateRunning_validResponse()
    {
        double expected = 154;
        WorkoutType type = WorkoutType.RUNNING;
        WorkoutCalculator calculator = new WorkoutCalculator();

        double result = calculator.calculateCalories(type);

        assertEquals(expected, result);
    }

    @Test
    public void CalculateStrengthening_validResponse()
    {
        double expected = 121;
        WorkoutType type = WorkoutType.STRENGTHENING;
        WorkoutCalculator calculator = new WorkoutCalculator();

        double result = calculator.calculateCalories(type);

        assertEquals(expected, result);
    }

}