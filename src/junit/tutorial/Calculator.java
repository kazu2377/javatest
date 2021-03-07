package junit.tutorial;

public class Calculator {
	/**
     * xとyの乗算結果を返す
     * @param x
     * @param y
     * @return xとyの乗算結果を返す
     */
    public int maltiplication(int x,int y) {
        return x * y;
    }

    /**
     * xとyの除算結果を戻す
     * @param x
     * @param y
     * @return xとyの除算結果を戻す
     */
    public int division(int x,int y) {
        return x / y;
    }

// こちらに直さないとエラーになる
//    public float division(float x,float y) {
//        return x / y;
//    }
}
