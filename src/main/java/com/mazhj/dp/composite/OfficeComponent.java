package com.mazhj.dp.composite;

public abstract class OfficeComponent {
    public String name;

    public int level;

    public OfficeComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void addChild(OfficeComponent office);


    public abstract void distributeOfficialDocuments();

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
