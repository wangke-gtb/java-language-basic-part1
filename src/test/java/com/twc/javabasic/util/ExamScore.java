package com.twc.javabasic.util;

public class ExamScore {
    private final double testCases;
    private final double requirement;
    private final double codeFormat;
    private final double codeDetails;

    public ExamScore(double testCases, double requirement, double codeFormat, double codeDetails) {
        this.testCases = testCases;
        this.requirement = requirement;
        this.codeFormat = codeFormat;
        this.codeDetails = codeDetails;
    }

    public double getFinalScore() {
        return (testCases * 0.4 + requirement * 0.6 + codeFormat * 0.4 + codeDetails * 0.6) / 2;
    }

    public double getTestCases() {
        return testCases;
    }

    public double getRequirement() {
        return requirement;
    }

    public double getCodeFormat() {
        return codeFormat;
    }

    public double getCodeDetails() {
        return codeDetails;
    }
}
