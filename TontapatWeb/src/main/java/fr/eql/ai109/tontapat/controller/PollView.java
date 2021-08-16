package fr.eql.ai109.tontapat.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PollView implements Serializable {

	private static final long serialVersionUID = 1L;
	private int number;

    public void increment() {
        number++;
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }
}