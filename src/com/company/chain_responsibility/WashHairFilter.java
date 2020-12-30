package com.company.chain_responsibility;

/**
 * @Auther: wangkai
 * @Date: 2020/12/30/17:15
 * @Description:
 */
public class WashHairFilter implements StudyPrepareFilter {
    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.getWashHair()){
            System.out.println("洗完头发");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
