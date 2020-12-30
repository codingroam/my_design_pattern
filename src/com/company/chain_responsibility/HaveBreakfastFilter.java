package com.company.chain_responsibility;

/**
 * @Auther: wangkai
 * @Date: 2020/12/30/17:19
 * @Description:
 */
public class HaveBreakfastFilter implements StudyPrepareFilter {
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.getHaveBreakfast()){
            System.out.println("吃完早饭");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
