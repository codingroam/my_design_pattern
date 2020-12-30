package com.company.chain_responsibility;

/**
 * @Auther: wangkai
 * @Date: 2020/12/30/17:17
 * @Description:
 */
public class WashFaceFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PreparationList preparationList, FilterChain filterChain) {
        if(preparationList.getWashFace()){
            System.out.println("洗完脸");
        }
        filterChain.doFilter(preparationList,filterChain);
    }
}
