package com.company.Duck;

import com.company.TurkeyAdapter;
import com.company.WildTurkey;

public class Client {

    public static void main(String[] args) {

	  MallardDuck mallardDuck = new MallardDuck();

	  WildTurkey wildTurkey = new WildTurkey();
	  Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

      System.out.println("The mallardDuck say...");
      mallardDuck.fly();
      mallardDuck.quack();

      System.out.println("The turkeyAdapter");
      turkeyAdapter.fly();
      turkeyAdapter.quack();


    }
}
