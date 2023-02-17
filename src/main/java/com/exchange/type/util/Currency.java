package com.exchange.type.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum Currency {

    EURUSD(1.07, "EURO-DOLAR"),
    EURJPY(143.03, "EURO-YEN"),
    EURCNY(7.32,"EURO-YUAN"),
    EURMXN(19.79, "EURO-MEXICAN PESO"),
    EURBRL(5.56, "EURO-REAL"),
    EURPEN(4.11, "EURO-SOL"),
    USDEUR(0.94, "DOLAR-EURO"),
    USDJPY(134.20, "DOLAR-YEN"),
    USDCNY(6.86, "DOLAR-YUAN"),
    USDMXN(18.56, "DOLAR-MEXICAN PESO"),
    USDBRL(5.22, "DOLAR-REAL"),
    USDPEN(3.85, "DOLAR-SOL"),
    JPYEUR(0.0070, "YEN-EURO"),
    JPYUSD(0.0074, "YEN-DOLAR"),
    JPYCNY(0.051, "YEN-YUAN"),
    JPYMXN(0.14, "YEN-MEXICAN PESO"),
    JPYBRL(0.039, "YEN-REAL"),
    JPYPEN(0.029, "YEN-SOL"),
    MXNEUR(0.051, "MEXICAN PESO-EURO"),
    MXNUSD(0.054, "MEXICAN PESO-DOLAR"),
    MXNCNY(0.37, "MEXICAN PESO-YUAN"),
    MXNJPY(7.23, "MEXICAN PESO-YEN"),
    MXNBRL(0.28, "MEXICAN PESO-REAL"),
    MXNPEN(0.21, "MEXICAN PESO-SOL"),
    CNYUSD(0.15, "YUAN-DOLAR"),
    CNYEUR(0.14, "YUAN-EURO"),
    CNYJPY(19.57, "YUAN-YEN"),
    CNYBRL(1.31, "YUAN-REAL"),
    CNYMXN(2.71, "YUAN-MEXICAN PESO"),
    CNYPEN(0.56, "YUAN-SOL"),
    BRLUSD(0.19, "REAL-DOLAR"),
    BRLEUR(0.18, "REAL-EURO"),
    BRLJPY(25.72, "REAL-YEN"),
    BRLCNY(1.31, "REAL-YUAN"),
    BRLMXN(3.56, "REAL-MEXICAN PESO"),
    BRLPEN(0.74, "REAL-SOL"),
    PENUSD(1.00, "SOL-DOLAR"),
    PENEUR(0.24, "SOL-EURO"),
    PENJPY(34.83, "SOL-YEN"),
    PENCNY(1.78, "SOL-YUAN"),
    PENBRL(1.35, "SOL-REAL"),
    PENMXN(4.82, "SOL-MEXICAN PESO");

    private final double value;
    private final String description;

    public double getValue() { return value; }

    public String getDescription() { return description; }

}
