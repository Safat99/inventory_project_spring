package com.example.inventory_project.entity;

import javax.persistence.*;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private long budgetID;
    @Column
    private String sapCode;

    @Column
    private String productName;
    @Column
    private int productionUnit;

    @Column
    private int packageSize;

    @Enumerated(EnumType.STRING)
    @Column
    private SBU sbu;
    @Column
    private String fieldColleagueID;

    @Column
    private String fieldColleagueName;
    @Column
    private int quantity;
    @Column
    private String depotName;
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "depot_id")
//    private Depot depot;
    @Column
    private String DepotID;

    @Column
    private String category;

    @Column
    private String month;
    @Column
    private int year;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ssu_id")
//    private SSU ssu_id;

    @Column
    private String ssu_id;
    @Column(columnDefinition = "boolean default false")
    private boolean isDepotReceived;
    @Column(columnDefinition = "boolean default true")
    private boolean isInSSU;

    public long getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(long budgetID) {
        this.budgetID = budgetID;
    }

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductionUnit() {
        return productionUnit;
    }

    public void setProductionUnit(int productionUnit) {
        this.productionUnit = productionUnit;
    }

    public int getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

    public SBU getSbu() {
        return sbu;
    }

    public void setSbu(SBU sbu) {
        this.sbu = sbu;
    }

    public String getFieldColleagueID() {
        return fieldColleagueID;
    }

    public void setFieldColleagueID(String fieldColleagueID) {
        this.fieldColleagueID = fieldColleagueID;
    }

    public String getFieldColleagueName() {
        return fieldColleagueName;
    }

    public void setFieldColleagueName(String fieldColleagueName) {
        this.fieldColleagueName = fieldColleagueName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

//    public Depot getDepot() {
//        return depot;
//    }
//
//    public void setDepot(Depot depot) {
//        this.depot = depot;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public SSU getSsu() {
//        return ssu;
//    }
//
//    public void setSsu(SSU ssu) {
//        this.ssu = ssu;
//    }

    public String getSsu_id() {
        return ssu_id;
    }

    public void setSsu_id(String ssu_id) {
        this.ssu_id = ssu_id;
    }

    public boolean isDepotReceived() {
        return isDepotReceived;
    }

    public void setDepotReceived(boolean depotReceived) {
        isDepotReceived = depotReceived;
    }

    public boolean isInSSU() {
        return isInSSU;
    }

    public void setInSSU(boolean inSSU) {
        isInSSU = inSSU;
    }

    public String getDepotID() {
        return DepotID;
    }

    public void setDepotID(String depotID) {
        DepotID = depotID;
    }


}
