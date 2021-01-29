package com.example.demo.design.template;

// 抽象的模板类
abstract class TemplateMethod {
    //模板方法：总体算法的骨架，总体不能修改
    final public Long typeOperate(){
        Long currentTime = System.currentTimeMillis(); //当前系统的时间（毫秒）
        // 具体操作留给子类完成
        this.doWork();
        Long endTime = System.currentTimeMillis();
        return endTime - currentTime;
    }

    protected abstract void doWork();
}

class StringOperate extends TemplateMethod {

    @Override
    protected void doWork() {
        String str = "";
        for (int i=0 ; i<10000;i++ ) {
            str += i;
        }
    }
}

class IntOperate extends TemplateMethod {
    @Override
    public  void doWork(){
        int num = 0;
        for (int i=0 ; i<10000000;i++ ) {
            num += i;
        }
    }
}


class TemplateMethodDemo {
    public static void main(String[] args) {
        //统计String的10000次操作和int操作相加10000000次的时间差
        System.out.println(new StringOperate().typeOperate());
        System.out.println(new IntOperate().typeOperate());
    }
}