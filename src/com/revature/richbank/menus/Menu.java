package com.revature.richbank.menus;

import java.io.BufferedReader;

public abstract class Menu {
    protected String name;
    protected  String route;
    protected  BufferedReader terminalReader;

    public Menu(String name, String route, BufferedReader terminalReader){
        super();
        this.name = name;
        this.route = route;
        this.terminalReader = terminalReader;
    }

    public String getName(){
        return name;
    }

    public String getRoute() {}
    public abstract void render() throws Exception;
}