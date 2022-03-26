package companionobject

class MathHelper {
    companion object {
        fun maxDiv(n : Int): Int {
            if(n == 0) {
                throw IllegalArgumentException("Argument value should be greater than 0")
            }
            var s = n / 2
            while(s >= 1) {
                if(n % s == 0) {
                    return s
                }
                s--;
            }

            return s;
        }
    }
}
