import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductWriter
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String idString;
        String prodName;
        String prodDesc;
        double prodCost;
        String prodCostST;
        String stringProduct;
        boolean doContinue;
        ArrayList<String> ProductList = new ArrayList<>();

        do
        {
            idString = SafeInput.getNonZeroLenString(in, "Enter Id");
            prodName = SafeInput.getNonZeroLenString(in, "Input product name");
            prodDesc = SafeInput.getNonZeroLenString(in, "Input description");
            prodCost = SafeInput.getDouble(in, "Input cost");

            prodCostST = Double.toString(prodCost);

            stringProduct = String.join(", ", idString, prodName, prodDesc, prodCostST);

            ProductList.add(stringProduct);

            doContinue = SafeInput.getYNConfirm(in, "Do you want to continue");

            System.out.println(ProductList);
            System.out.println(doContinue);

        } while (doContinue);

        String fileName;
        fileName = SafeInput.getNonZeroLenString(in, "What do you want the file to be called");
        FileWriter writer = new FileWriter(fileName + ".txt");

        for (String i : ProductList)
        {
            writer.write(i);
            writer.write("\n");
        }
        writer.close();
    }
}