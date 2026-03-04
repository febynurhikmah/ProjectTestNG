import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test(priority = 0)
    public void testPenjumlahan() {
        float Hasil = calculator.penjumlahan(10, 5);
        System.out.println(Hasil);
        Assert.assertEquals(Hasil, 15);
    }
    @Test(priority = 1)
    public void testPengurangan() {
        float Hasil = calculator.pengurangan(10, 5);
        System.out.println(Hasil);
        Assert.assertEquals(Hasil, 5);
    }
    @Test(priority = 2)
    public void testPerkalian() {
        float Hasil = calculator.perkalian(10, 5);
        System.out.println(Hasil);
        Assert.assertEquals(Hasil, 50);
    }
    @Test(priority = 3)
    public void testPembagian() {
        float Hasil = calculator.pembagian(10, 5);
        System.out.println(Hasil);
        Assert.assertEquals(Hasil, 2);
    }
}
