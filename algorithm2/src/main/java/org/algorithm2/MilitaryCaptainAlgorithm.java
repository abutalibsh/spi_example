package org.algorithm2;

import org.algorithm.Algorithm;

public class MilitaryCaptainAlgorithm implements Algorithm {
    @Override
    public String decorate(String name) {
        return "Yes Captain " + name + " sir!";
    }
}
