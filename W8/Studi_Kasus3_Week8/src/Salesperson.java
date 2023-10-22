public class Salesperson implements Comparable<Salesperson>{
    protected String firstName;
    protected String lastName;
    protected int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        int salesComparison = Integer.compare(this.totalSales, other.totalSales);
        if (salesComparison == 0) {
            return this.lastName.compareTo(other.lastName);
        }
        return salesComparison;
    }
}