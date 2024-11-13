package com.security;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DEMO2 {

    public static void main(String[] args) {
        generateCSV("chargeback_data_600.csv", 600);
    }

    private static void generateCSV(String fileName, int numEntries) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Write header
            writer.write("Chargeback Raise Date,Case Number,Acquirer Reference Data - RRN,Primary Account Number," +
                    "Transaction Date,Transaction Amount,Chargeback Reason code,Chargeback Reason code description," +
                    "Chargeback Amount,Target Date,PGI REF NO#\n");

            // Generate entries
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Random random = new Random();

            for (int i = 0; i < numEntries; i++) {
                Date currentDate = new Date();
                currentDate.setTime(currentDate.getTime() + i * 24 * 60 * 60 * 1000L); // Incrementing by one day

                String chargebackRaiseDate = dateFormat.format(currentDate);
                String caseNumber = "NPCI33493002" + i;
                String acquirerReferenceData = "30962010002" + i;
                String primaryAccountNumber = "652850-XXX-XXX-" + String.format("%04d", random.nextInt(10000));
                String transactionDate = dateFormat.format(currentDate);
                int transactionAmount = random.nextInt(5001) + 5000;
                int chargebackReasonCode = random.nextInt(12) + 1065;
                String chargebackReasonDescription = chargebackReasonCode + "-Goods or Services Not Provided / Not Received";
                int chargebackAmount = random.nextInt(812) + 4965;
                String targetDate = dateFormat.format(currentDate);
                String pgiRefNo = "XUR31083000" + i;

                // Write entry to CSV
                String entry = String.format("%s,%s,%s,%s,%s,%d,%d,%s,%d,%s,%s\n",
                        chargebackRaiseDate, caseNumber, acquirerReferenceData, primaryAccountNumber,
                        transactionDate, transactionAmount, chargebackReasonCode, chargebackReasonDescription,
                        chargebackAmount, targetDate, pgiRefNo);

                writer.write(entry);
            }

            System.out.println("CSV file '" + fileName + "' has been generated.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
