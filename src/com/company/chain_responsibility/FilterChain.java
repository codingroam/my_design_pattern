package com.company.chain_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangkai
 * @Date: 2020/12/30/17:09
 * @Description:
 */
public class FilterChain implements StudyPrepareFilter {



    private int pos = 0;
    private Study study;
    private List<StudyPrepareFilter> studyPrepareFilterList;

    public FilterChain(Study study){
        this.study = study;
    }

    public void doFilter(StudyPrepareFilter studyPrepareFilter){
        if(studyPrepareFilterList==null){
            studyPrepareFilterList = new ArrayList<>();
        }
        studyPrepareFilterList.add(studyPrepareFilter);

    }

    @Override
    public void doFilter(PreparationList preparationList,FilterChain filterChain) {
        if(pos==studyPrepareFilterList.size()){
            study.study();
        }else{
            studyPrepareFilterList.get(pos++).doFilter(preparationList,filterChain);
        }


    }
}
