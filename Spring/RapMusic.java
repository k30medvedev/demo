package org.example;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private ArrayList list = new ArrayList();

    public void setList(ArrayList list) {
        this.list = list;
    }

    @Override
    public String getSong() {
        return "RapMusic";
    }
}
