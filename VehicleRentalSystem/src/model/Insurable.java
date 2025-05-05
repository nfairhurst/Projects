package model;

/**
 * Insurable is an interface that defines a method for calculating the insured cost of a vehicle
 *
 * @param days the number of days the vehicle is insured
 * @return  total insursed cost based on days
 */

public interface Insurable {

    double calculateInsuredCost(int days);
}

