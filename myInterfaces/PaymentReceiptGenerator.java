package myInterfaces;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class PaymentReceiptGenerator {
    public PaymentReceiptGenerator(String name1, String name2) {
        try {
            // Create the invoice file
            File invoiceFile = new File(name1 + ".doc");
            invoiceFile.createNewFile();

            // Write the invoice header
            writeLineToFile(invoiceFile, "        ___  ");
            writeLineToFile(invoiceFile, "      //   \\\\ ");
            writeLineToFile(invoiceFile, "     //     \\\\ ");
            writeLineToFile(invoiceFile, "    // A   R \\\\ ");
            writeLineToFile(invoiceFile, "   //         \\\\ ");
            writeLineToFile(invoiceFile, "  //           \\\\ ");
            writeLineToFile(invoiceFile, " //             \\\\ ");

            writeLineToFile(invoiceFile, "Ride Sharing Payment Invoice");
            writeLineToFile(invoiceFile, "------------------------------");

            // Write the invoice details
            writeLineToFile(invoiceFile, "Invoice Number: 1234");
            writeLineToFile(invoiceFile, "Date: " + getCurrentDate());
            writeLineToFile(invoiceFile, "Passenger Name: " + name1);
            writeLineToFile(invoiceFile, "Payment Amount: Per Kilometer is 10 BDT");

            // Print a success message
            JOptionPane.showMessageDialog(null, "Payment was Successful", "Payment",
                    JOptionPane.INFORMATION_MESSAGE);
            // System.out.println("Invoice created successfully!");
			
        } catch (Exception e) {
            // System.out.println("An error occurred while creating the payment receipt.");
            JOptionPane.showMessageDialog(null, "Error Occurred!", "Payment Error",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        return dateFormat.format(new Date());
    }

    private static void writeLineToFile(File file, String line) throws Exception {
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write(line.getBytes());
        fos.write(System.getProperty("line.separator").getBytes());
        fos.close();
    }
}
