package com.qaproject.drivers;

public enum BrowserType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    IE("ie");
    private final String value;

    BrowserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BrowserType fromString(String value) {
        for (BrowserType browserType : BrowserType.values()) {
            if (browserType.getValue().equalsIgnoreCase(value)) {
                return browserType;
            }
        }
        throw new IllegalArgumentException("Invalid browser type: " + value);
    }
}