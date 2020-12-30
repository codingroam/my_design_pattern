package com.company.chain_responsibility;

public interface StudyPrepareFilter {
    public void doFilter(PreparationList preparationList,FilterChain filterChain);
}
