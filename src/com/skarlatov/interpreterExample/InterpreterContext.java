package com.skarlatov.interpreterExample;

 class InterpreterContext {
    //this is the context class
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }







}
