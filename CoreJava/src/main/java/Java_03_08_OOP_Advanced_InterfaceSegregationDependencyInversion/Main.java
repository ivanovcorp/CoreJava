/*
 * Main.java
 *
 * created at Sep 14, 2017 by iv.ivanov <iv.ivanov@seeburger.de>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package Java_03_08_OOP_Advanced_InterfaceSegregationDependencyInversion;

/**
 * Java Interface Segregation/Dependency Inversion Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Dependency Inversion Principle(DIP)
         *
         *
         * DIP says that high-level modules should not depend on low-level modules.
         * Both should depend on abstractions.
         * Abstractions should not depend on details. Details should depend on abstractions.
         *
         * Goal: decoupling between modules through abstractions.
         */

        /*
         * The problem button -> Lamp example
         * Button depends on lamp
         *
         *
         * button(high-level / client): poll() -> Lamp(low-level / Server): turnOn() turnOff()
         * client defines interfaces
         *
         * Find the abstraction independent of details
         * button: poll() -> uses -> SwitchableDevice<interface>: turnOn() turnOff()
         * Lamp -> implements -> SwitchableDevice
         */

        /*
         * Dependency Example
         *
         * A dependency is any external component/system:
         * - Framework                      - Configuration
         * - Configuration                  - The new keyword
         * - Third party library            - Static method
         * - Database                       - Global function
         * - File system                    - Random generator
         * - Email                          - System.in / System.out
         * - Web service                    - System resource(e.g. clock)
         */
    }
}