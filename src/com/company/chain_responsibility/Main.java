package com.company.chain_responsibility;

/**
 * @Auther: wangkai
 * @Date: 2020/12/30/17:26
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setWashFace(true);
        preparationList.setWashHair(false);
        preparationList.setHaveBreakfast(false);
        Study study = new Study();
        StudyPrepareFilter washFiaceFilter = new WashFaceFilter();
        StudyPrepareFilter washHairFilter = new WashHairFilter();
        StudyPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter();
        FilterChain filterChain = new FilterChain(study);
        filterChain.doFilter(washFiaceFilter);
        filterChain.doFilter(washHairFilter);
        filterChain.doFilter(haveBreakfastFilter);
        filterChain.doFilter(preparationList,filterChain);
    }
}
