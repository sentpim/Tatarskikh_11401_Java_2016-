import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by sentpim on 26.02.2016.
 */
public class TestMatrix2x2 {
    private static final double EPS = 1e-9;
    public static Matrix2x2 Matrix1;
    public static Matrix2x2 Matrix2;
    public static Matrix2x2 Matrix3;

    @BeforeClass
    public static void beforeClass() {
        Matrix1 = new Matrix2x2(1, 2, 3, 4);
        Matrix2 = new Matrix2x2(2, 3, 4, 1);
        Matrix3 = new Matrix2x2(1, 2, 3, 4);
    }

    @Test
    public void firstParameterOfMatrixShouldBe() {
        Assert.assertEquals(1, Matrix1.getA(0, 0), EPS);
    }

    @Test
    public void secondParameterOfMatrixShouldBe() {
        Assert.assertEquals(2, Matrix1.getA(0, 1), EPS);
    }

    @Test
    public void thirdParameterOfMatrixShouldBe() {
        Assert.assertEquals(3, Matrix1.getA(1, 0), EPS);
    }

    @Test
    public void forthParameterOfMatrixShouldBe() {
        Assert.assertEquals(4, Matrix1.getA(1, 1), EPS);
    }

    @Test
    public void addMethodShouldBeWork() {
        Assert.assertEquals(new Matrix2x2(3, 5, 7, 5), Matrix1.add(Matrix2));
    }

    @Test
    public void add2MethodShouldBeWork() {
        Matrix3.add2(Matrix1);
        Assert.assertEquals(new Matrix2x2(2, 4, 6, 8), Matrix3);
    }

    @Test
    public void subMethodShouldBeWork() {
        Assert.assertEquals(new Matrix2x2(-1, -1, -1, 3), Matrix1.sub(Matrix2));
    }

    @Test
    public void sub2MethodShouldBeWork() {
        Matrix3.sub2(Matrix2);
        Assert.assertEquals(new Matrix2x2(-1, -1, -1, 3), Matrix3);
    }

    @Test
    public void multOnNumberMatrixShouldBeWork() {
        Assert.assertEquals(new Matrix2x2(2, 4, 6, 8), Matrix1.multNumber(2));
    }

    @Test
    public void multOnNumber2MatrixShouldBeWork() {
        Matrix3.multNumber2(2);
        Assert.assertEquals(new Matrix2x2(2, 4, 6, 8), Matrix3);
    }

    @Test
    public void multMethodShouldBeWork() {
        Assert.assertEquals(new Matrix2x2(10, 5, 22, 13), Matrix1.mult(Matrix2));
    }

    @Test
    public void mult2MethodShouldBeWork() {
        Matrix3.mult2(Matrix2);
        Assert.assertEquals(new Matrix2x2(10, 5, 22, 13), Matrix3);
    }

    @Test
    public void determinateOfMatrixShouldBeRigth() {
        Assert.assertEquals(-2, Matrix1.det(), EPS);
    }

    @Test
    public void transporateMatrixShouldBeRight() {
        Matrix3.transpon();
        Assert.assertEquals(new Matrix2x2(1, 3, 2, 4), Matrix3);
    }

    @Test
    public void inverseMatrixShouldBeRigth() {
        Assert.assertEquals(new Matrix2x2(-2, 1, 1.5, -0.5), Matrix1.inverseMatrix());
    }

    @Test
    public void multMatrixWithVector2DShouldBeRigth() {
        Assert.assertEquals(new Vector2D(5, 11), Matrix3.multVector(new Vector2D(1, 2)));
    }

    @Test
    public void equivalentDiagonalShouldBeRigth() {
        Matrix2x2 result = new Matrix2x2(1, 0, 0, -2);
        Matrix2x2 matrix = Matrix1.equivalentDiagonal();
        Assert.assertEquals(result, matrix);
    }

    @Test
    public void equalsMatrixShouldBeEquals(){
        if (!Matrix1.equals(Matrix3))
            Assert.fail();
    }
}