package com.icourt.charge.rxjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.subjects.AsyncSubject;

/**
 * @author Junkang.Ding dingjunkang@icourt.cc
 * @version 1.0.0
 * @company Beijing iCourt
 * @project Charge
 * @date 2017/10/30
 * @desc null
 */
public class RxJavaLearnTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void name() throws Exception {
//        Single.create().zipWith();
        Observable<Integer> observable = Observable.fromArray(1, 2, 3, 4);
        AsyncSubject<Object> subject = observable.blockingLast();
    }

    @After
    public void tearDown() throws Exception {

    }

}