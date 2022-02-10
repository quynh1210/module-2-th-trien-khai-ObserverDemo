package com.codegym;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public OctObserver(Subject sub) {

    }

    public void update(){
        System.out.println(" "+ Integer.toOctalString(subject.getState()));
    }
}
