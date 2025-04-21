package com.isp.musficur;

public class Inventory_Records {
    private String equipmentType;
    private String quantity;

    public Inventory_Records(String equipmentType, String quantity) {
        this.equipmentType = equipmentType;
        this.quantity = quantity;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory_Records{" +
                "equipmentType='" + equipmentType + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
