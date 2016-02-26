import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by sentpim on 26.02.2016.
 */
public class TestComplexMatrix2x2 {
    public static ComplexMatrix2x2 Matrix1;
    public static ComplexMatrix2x2 Matrix2;
    public static ComplexVector2D vector;

    @BeforeClass
    public static void beforeClass() {
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(3.0);
        when(a.getB()).thenReturn(4.0);
        when(a.add(anyObject())).thenCallRealMethod();
        when(a.mult(anyObject())).thenCallRealMethod();
        when(vector.getX()).thenReturn(a);

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(6.0);
        when(b.getB()).thenReturn(7.0);
        when(b.add(anyObject())).thenCallRealMethod();
        when(b.mult(anyObject())).thenCallRealMethod();

        ComplexNumber c = mock(ComplexNumber.class);
        when(c.getA()).thenReturn(5.0);
        when(c.getB()).thenReturn(4.0);
        when(c.add(anyObject())).thenCallRealMethod();
        when(c.mult(anyObject())).thenCallRealMethod();
        when(vector.getY()).thenReturn(c);

        ComplexNumber d = mock(ComplexNumber.class);
        when(d.getA()).thenReturn(4.0);
        when(d.getB()).thenReturn(3.0);
        when(d.add(anyObject())).thenCallRealMethod();
        when(d.mult(anyObject())).thenCallRealMethod();

        Matrix1 = new ComplexMatrix2x2(a,b,c,d);
        Matrix2 = new ComplexMatrix2x2(a,b,c,d);
        vector = mock(ComplexVector2D.class);

    }

    @Test
    public void ElementsShouldHaveParam(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(3.0);
        when(a.getB()).thenReturn(4.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(6.0);
        when(b.getB()).thenReturn(7.0);
        when(b.equals(anyObject())).thenCallRealMethod();

        ComplexNumber c = mock(ComplexNumber.class);
        when(c.getA()).thenReturn(5.0);
        when(c.getB()).thenReturn(4.0);
        when(c.equals(anyObject())).thenCallRealMethod();

        ComplexNumber d = mock(ComplexNumber.class);
        when(d.getA()).thenReturn(4.0);
        when(d.getB()).thenReturn(3.0);
        when(d.equals(anyObject())).thenCallRealMethod();

        ComplexMatrix2x2 result = new ComplexMatrix2x2(a,b,c,d);
        Assert.assertTrue(Matrix1.equals(result));
    }

    @Test
    public void addMethodShouldBeWork(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(6.0);
        when(a.getB()).thenReturn(8.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(11.0);
        when(b.getB()).thenReturn(11.0);
        when(b.equals(anyObject())).thenCallRealMethod();

        ComplexNumber c = mock(ComplexNumber.class);
        when(c.getA()).thenReturn(11.0);
        when(c.getB()).thenReturn(11.0);
        when(c.equals(anyObject())).thenCallRealMethod();

        ComplexNumber d = mock(ComplexNumber.class);
        when(d.getA()).thenReturn(8.0);
        when(d.getB()).thenReturn(6.0);
        when(d.equals(anyObject())).thenCallRealMethod();

        ComplexMatrix2x2 result = new ComplexMatrix2x2(a,b,c,d);
        ComplexMatrix2x2 matrix = Matrix1.add(Matrix2);
        Assert.assertTrue(result.equals(matrix));
    }

    @Test
    public void equalsMethodShouldBeWork(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(3.0);
        when(a.getB()).thenReturn(4.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(6.0);
        when(b.getB()).thenReturn(7.0);
        when(b.equals(anyObject())).thenCallRealMethod();

        ComplexNumber c = mock(ComplexNumber.class);
        when(c.getA()).thenReturn(5.0);
        when(c.getB()).thenReturn(4.0);
        when(c.equals(anyObject())).thenCallRealMethod();

        ComplexNumber d = mock(ComplexNumber.class);
        when(d.getA()).thenReturn(4.0);
        when(d.getB()).thenReturn(3.0);
        when(d.equals(anyObject())).thenCallRealMethod();

        ComplexMatrix2x2 result = new ComplexMatrix2x2(a,d,c,d);
        Assert.assertTrue(result.a[0][0].equals(Matrix1.a[0][0]));
        Assert.assertTrue(result.a[0][1].equals(Matrix1.a[0][1]));
        Assert.assertTrue(result.a[1][0].equals(Matrix1.a[1][0]));
        Assert.assertTrue(result.a[1][1].equals(Matrix1.a[1][1]));
    }

    @Test
    public void multMethodShouldBeWork(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(-20.0);
        when(a.getB()).thenReturn(108.0);
        when(a.equals(anyObject())).thenCallRealMethod();
        when(a.mult(anyObject())).thenCallRealMethod();

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(2.0);
        when(b.getB()).thenReturn(78.0);
        when(b.equals(anyObject())).thenCallRealMethod();
        when(b.mult(anyObject())).thenCallRealMethod();

        ComplexNumber c = mock(ComplexNumber.class);
        when(c.getA()).thenReturn(2.0);
        when(c.getB()).thenReturn(78.0);
        when(c.equals(anyObject())).thenCallRealMethod();
        when(c.mult(anyObject())).thenCallRealMethod();

        ComplexNumber d = mock(ComplexNumber.class);
        when(d.getA()).thenReturn(16.0);
        when(d.getB()).thenReturn(64.0);
        when(d.equals(anyObject())).thenCallRealMethod();
        when(d.mult(anyObject())).thenCallRealMethod();

        ComplexMatrix2x2 result = new ComplexMatrix2x2(a,b,c,d);
        ComplexMatrix2x2 matrix = Matrix1.mult(Matrix2);
        Assert.assertTrue(result.equals(matrix));
    }

    @Test
    public void determinateOfMatrixShouldBeWork(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(-2.0);
        when(a.getB()).thenReturn(-34.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        Assert.assertTrue(Matrix1.det().equals(a));
    }

    @Test
    public void multComplexVectorShouldBeCorrect(){
        ComplexNumber a = mock(ComplexNumber.class);
        when(a.getA()).thenReturn(-5.0);
        when(a.getB()).thenReturn(83.0);
        when(a.equals(anyObject())).thenCallRealMethod();

        ComplexNumber b = mock(ComplexNumber.class);
        when(b.getA()).thenReturn(7.0);
        when(b.getB()).thenReturn(63.0);
        when(b.equals(anyObject())).thenCallRealMethod();

        ComplexVector2D result = mock(ComplexVector2D.class);
        when(result.getX()).thenReturn(a);
        when(result.getY()).thenReturn(a);

        Assert.assertTrue(Matrix1.multVector(vector).equals(result));
    }
}