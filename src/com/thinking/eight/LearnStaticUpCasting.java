package com.thinking.eight;

public class LearnStaticUpCasting {
    public static void main(String[] args) {
        StaticSuper staticSupe =new StaticSub();
        System.out.println(staticSupe.getDynamic());
    }
}

class StaticSuper{
    public static String getStatic(){
        return "super getStatic";
    }
    public String getDynamic(){
        return "super getDynamic";
    }
}

class StaticSub extends StaticSuper{
    @Override
    public String getDynamic() {
        return "sub getDynamic";
    }

    public static String getStatic(){
        return "sub getStatic";
    }
}