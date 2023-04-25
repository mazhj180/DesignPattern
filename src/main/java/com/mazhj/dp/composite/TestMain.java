package com.mazhj.dp.composite;

public class TestMain {
    public static void main(String[] args) {
        OfficeComponent office1parent =  new Office("北京总部",1);

        OfficeComponent office2parent = new Office("湖南分校",2);
        OfficeComponent office2_jw = new Office("教务办公室",2);
        OfficeComponent office2_xz = new Office("行政办公室",2);

        OfficeComponent office3parent_cs = new Office("长沙教学点",3);
        OfficeComponent office3parent_xt = new Office("湘潭教学点",3);
        OfficeComponent office3_jw = new Office("教务办公室",3);
        OfficeComponent office3_xz = new Office("行政办公室",3);

        OfficeComponent office4_cs_jw = new Office("教务办公室",4);
        OfficeComponent office4_cs_xz = new Office("行政办公室",4);
        OfficeComponent office4_xt_jw = new Office("教务办公室",4);
        OfficeComponent office4_xt_xz = new Office("行政办公室",4);

        //第三层添加孩子
        office3parent_cs.addChild(office4_cs_jw);
        office3parent_cs.addChild(office4_cs_xz);
        office3parent_xt.addChild(office4_xt_jw);
        office3parent_xt.addChild(office4_xt_xz);

        //第二层添加孩子
        office2parent.addChild(office3_jw);
        office2parent.addChild(office3parent_cs);
        office2parent.addChild(office3parent_xt);
        office2parent.addChild(office3_xz);

        //第一层添加孩子
        office1parent.addChild(office2_jw);
        office1parent.addChild(office2parent);
        office1parent.addChild(office2_xz);

        //打印结构
        office1parent.distributeOfficialDocuments();



    }
}
