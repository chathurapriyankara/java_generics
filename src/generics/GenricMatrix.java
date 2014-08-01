package generics;

/**
 *
 * @author chathura priyankara
 */
public abstract class GenricMatrix<E extends Number> {

    protected abstract E add(E o1, E o2);

    protected abstract E multiply(E o1, E o2);

    protected abstract E zero();

    /**
     * Add two matrices
     */
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2.length) {
            throw new RuntimeException("The matrices do not have the same size");
        }

        E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];

        for (int i = 0; i < result.length; i++)//rows
        {
            for (int j = 0; j < result[i].length; j++) {//columns
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        }

        return result;
    }

    /**
     * Multiply two matrices
     */
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2.length) {
            throw new RuntimeException("Two matrices dont have compatible size");
        }

        E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];

        for ( ) {
            for ( ) {

            }
        }
    }
}
