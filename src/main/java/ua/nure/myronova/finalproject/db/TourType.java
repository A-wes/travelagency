package ua.nure.myronova.finalproject.db;

public enum TourType {

    EXCURSION("excursion"),

    RECREATION("recreation"),

    SHOPPING("shopping");

    private String typeName;

    TourType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
