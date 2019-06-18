package com.itheima.test;
/*创建钞票类（Money）
        属性：面值、真假(bolean类型)*/
public class Money {
   private int mz;
   private boolean zj;

    public Money() {
    }

    public Money(int mj, boolean zj) {
        this.mz = mj;
        this.zj = zj;
    }

    public int getMz() {
        return mz;
    }

    public void setMz(int mz) {
        this.mz = mz;
    }

    public boolean isZj() {
        return zj;
    }

    public void setZj(boolean zj) {
        this.zj = zj;
    }
}
