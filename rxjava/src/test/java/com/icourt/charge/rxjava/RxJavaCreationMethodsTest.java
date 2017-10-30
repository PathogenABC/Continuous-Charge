package com.icourt.charge.rxjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Junkang.Ding dingjunkang@icourt.cc
 * @version 1.0.0
 * @company Beijing iCourt
 * @project Charge
 * @date 2017/10/30
 * @desc null
 */
public class RxJavaCreationMethodsTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void create() throws Exception {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                if (new Random().nextBoolean()) {
                    emitter.onNext("hello rxjava");
                    emitter.onComplete();
                } else {
                    int i = 100 / 0;
                    System.out.println(i);
                }
            }
        }).subscribeOn(Schedulers.computation())
                .observeOn(Schedulers.computation()).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("result = " + s);
            }
        });
    }

    @After
    public void tearDown() throws Exception {

    }

}