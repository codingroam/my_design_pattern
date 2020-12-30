package com.company.chain_responsibility;

public class PreparationList {


    /**
    
    * @Description: 是否洗脸
    
    * @Author: wangkai
    
    * @Date: 2020/12/30  16:38
    
    */
    private Boolean washFace;
  
    /**
    
    * @Description:
    
    * @Author: wangkai
    
    * @Date: 2020/12/30  16:39
    
    */

    private Boolean washHair;
    /**/
    private Boolean haveBreakfast;

    public Boolean getWashFace() {
        return washFace;
    }

    public void setWashFace(Boolean washFace) {
        this.washFace = washFace;
    }

    public Boolean getWashHair() {
        return washHair;
    }

    public void setWashHair(Boolean washHair) {
        this.washHair = washHair;
    }

    public Boolean getHaveBreakfast() {
        return haveBreakfast;
    }

    public void setHaveBreakfast(Boolean haveBreakfast) {
        this.haveBreakfast = haveBreakfast;
    }
}
