package com.mazhj.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Office extends OfficeComponent{

    private List<OfficeComponent> offices = new ArrayList<>();

    public Office(String name, int level) {
        super(name, level);
    }

    @Override
    public void addChild(OfficeComponent office) {
        offices.add(office);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public void distributeOfficialDocuments() {
        for (int i = 0; i < level; i++) {
            System.out.print("-----");
        }
        System.out.println(super.getName());
        for (OfficeComponent o: offices
             ) {
            o.distributeOfficialDocuments();
        }

    }

}
