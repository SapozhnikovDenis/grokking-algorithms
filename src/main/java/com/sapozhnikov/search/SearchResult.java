package com.sapozhnikov.search;

public class SearchResult {
    private final int iteration;
    private final int findNumber;

    public SearchResult(int iteration, int findNumber) {
        this.iteration = iteration;
        this.findNumber = findNumber;
    }

    public int getIteration() {
        return iteration;
    }

    public int getFindNumber() {
        return findNumber;
    }
}
