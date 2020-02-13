package util;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import entity.InvoiceInitialCSV;
import entity.InvoiceLineDTO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

    static String INVOICE_FILE_PATH = "src/main/resources/invoice.csv";
    static String INVOICE_LINES_FILE_PATH = "src/main/resources/invoiceLines.csv";

    public static List<InvoiceInitialCSV> getInvoiceFromCsv() {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("invoiceId", CsvSchema.ColumnType.STRING)
                .addColumn("customerId", CsvSchema.ColumnType.STRING)
                .addColumn("invoiceNumber", CsvSchema.ColumnType.STRING)
                .addColumn("dateCreated", CsvSchema.ColumnType.STRING)
                .addColumn("dateUpdated", CsvSchema.ColumnType.STRING)
                .addColumn("dueDate", CsvSchema.ColumnType.STRING)
                .addColumn("terms", CsvSchema.ColumnType.STRING)
                .addColumn("poNumber", CsvSchema.ColumnType.STRING)
                .addColumn("amount", CsvSchema.ColumnType.STRING)
                .addColumn("paid", CsvSchema.ColumnType.STRING)
                .addColumn("currency", CsvSchema.ColumnType.STRING)
                .addColumn("exchangeRate", CsvSchema.ColumnType.STRING)
                .addColumn("discount", CsvSchema.ColumnType.STRING)
                .addColumn("taxTotal", CsvSchema.ColumnType.STRING)
                .addColumn("notes", CsvSchema.ColumnType.STRING)
                .addColumn("billingCompanyName", CsvSchema.ColumnType.STRING)
                .addColumn("billingEmail", CsvSchema.ColumnType.STRING)
                .addColumn("billingPhone", CsvSchema.ColumnType.STRING)
                .addColumn("billingAddress1", CsvSchema.ColumnType.STRING)
                .addColumn("billingAddress2", CsvSchema.ColumnType.STRING)
                .addColumn("billingCity", CsvSchema.ColumnType.STRING)
                .addColumn("billingState", CsvSchema.ColumnType.STRING)
                .addColumn("billingZip", CsvSchema.ColumnType.STRING)
                .build().withSkipFirstDataRow(true);
        ObjectReader objectReader = csvMapper.readerWithSchemaFor(InvoiceInitialCSV.class).with(schema);
        List<InvoiceInitialCSV> invoicesList = new ArrayList<>();

        try (Reader reader = new FileReader(INVOICE_FILE_PATH)) {
            MappingIterator<InvoiceInitialCSV> mappingIterator = objectReader.readValues(reader);
            while (mappingIterator.hasNext()) {
                InvoiceInitialCSV current = mappingIterator.next();
                invoicesList.add(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return invoicesList;
    }

    public static List<InvoiceLineDTO> getInvoiceLinesFromCsv() {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("itemId", CsvSchema.ColumnType.STRING)
                .addColumn("invoiceId", CsvSchema.ColumnType.STRING)
                .addColumn("name", CsvSchema.ColumnType.STRING)
                .addColumn("description", CsvSchema.ColumnType.STRING)
                .addColumn("rate", CsvSchema.ColumnType.STRING)
                .addColumn("quantity", CsvSchema.ColumnType.STRING)
                .addColumn("amount", CsvSchema.ColumnType.STRING)
                .build().withSkipFirstDataRow(true);
        ObjectReader objectReader = csvMapper.readerWithSchemaFor(InvoiceLineDTO.class).with(schema);
        List<InvoiceLineDTO> invoiceLineDTOList = new ArrayList<>();

        try (Reader reader = new FileReader(INVOICE_LINES_FILE_PATH)) {
            MappingIterator<InvoiceLineDTO> mappingIterator = objectReader.readValues(reader);
            while (mappingIterator.hasNext()) {
                InvoiceLineDTO current = mappingIterator.next();
                invoiceLineDTOList.add(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return invoiceLineDTOList;
    }
}
