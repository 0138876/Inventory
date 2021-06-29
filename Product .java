/**
 * The type Product.
 */
public class Product
{
    private static int count = 0;
    // Instace field declerations
    private int itemNumber;
    private String productName;
    private int unitsInStock;
    private double unitPrice;
    private boolean active;
    private double inventoryValue;

    public Product()
    {
        this.itemNumber = ++count;
        this.productName = "";
        this.unitsInStock = 0;
        this.unitPrice = 0;
        this.active = true;
    }

    /**
     * Instantiates a new Product.
     *
     * @param productName  the product name
     * @param unitsInStock the units in stock
     * @param unitPrice    the unit price
     */
    public Product(String productName,  double unitPrice, int unitsInStock)
    {
        this.itemNumber = ++count;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.unitPrice = unitPrice;
        this.active = true;
    }



    /**
     * Gets productName.
     *
     * @return Value of productName.
     */
    public String getProductName()
    {
        return productName;
    }

    /**
     * Sets new productName.
     *
     * @param productName New value of productName.
     */
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    /**
     * Gets unitsInStock.
     *
     * @return Value of unitsInStock.
     */
    public int getUnitsInStock()
    {
        return unitsInStock;
    }

    /**
     * Sets new unitsInStock.
     *
     * @param unitsInStock New value of unitsInStock.
     */
    public void setUnitsInStock(int unitsInStock)
    {
        this.unitsInStock = unitsInStock;
    }

    /**
     * Gets itemNumber.
     *
     * @return Value of itemNumber.
     */
    public int getItemNumber()
    {
        return itemNumber;
    }

    /**
     * Sets new itemNumber.
     *
     * @param itemNumber New value of itemNumber.
     */
    public void setItemNumber(int itemNumber)
    {
        this.itemNumber = itemNumber;
    }

    /**
     * Gets unitPrice.
     *
     * @return Value of unitPrice.
     */
    public double getUnitPrice()
    {
        return unitPrice;
    }

    /**
     * Sets new unitPrice.
     *
     * @param unitPrice New value of unitPrice.
     */
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public double getInventoryValue()
    {
        inventoryValue = unitPrice * unitsInStock;
        return inventoryValue;
    }

    /**
     * Gets active.
     *
     * @return Value of active.
     */
    public boolean getActive()
    {
        return active;
    }

    /**
     * Sets new active.
     *
     * @param active New value of active.
     */
    public void setActive(boolean active)
    {
        this.active = active;

    }


    public String toString()
    {
        String productStatus = (active == true)? "Active" : "Discontinued";

        return
                "itemNumber= " + itemNumber + "\n" +
                        "productName = " + productName + "\n" +
                        "unitsInStock = " + unitsInStock + "\n" +
                        "unitPrice = " + unitPrice + "\n" +
                        "Stock Value = " + getInventoryValue() + "\n" +
                        "Product Status = " + productStatus + "\n";

    }


}
