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

    @Column
    private String SBU;
    @Column
    private String fieldColleagueID;

    @Column
    private int quantity;
    @Column

    private String depotName;
    @Column
    private String depotID;
    @Column
    private String category;

    @Column
    private String month;
    @Column
    private int year;

    @Column
    private String warehouseName;

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

    public String getSBU() {
        return SBU;
    }

    public void setSBU(String SBU) {
        this.SBU = SBU;
    }

    public String getFieldColleagueID() {
        return fieldColleagueID;
    }

    public void setFieldColleagueID(String fieldColleagueID) {
        this.fieldColleagueID = fieldColleagueID;
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

    public String getDepotID() {
        return depotID;
    }

    public void setDepotID(String depotID) {
        this.depotID = depotID;
    }

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

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

}
