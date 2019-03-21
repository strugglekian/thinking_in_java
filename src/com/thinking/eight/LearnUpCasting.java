package com.thinking.eight;

public class LearnUpCasting {
    public static void main(String[] args) {
        Super sup = new Super();
        System.out.println("sup.field="+sup.field+";sup.getField="+sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field="+sub.field+";sub.getField="+sub.getField()+";sub.getSuperField="+sub.getSuperField());
    }
}


class Super{
    public int field =0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}