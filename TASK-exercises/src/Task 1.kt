fun main(){
    val f1 = Fraction(5F,10F)
    val f2 = Fraction(1F,10F)

    println(f1 == f2)
    println(f1.toString())
    println(f1.multiplication(f2))
    println(f1.division(f2))
    println(f1.addition(f2))
    println(f1.Subtraction(f2))

}

class Fraction(n: Float, d:Float) {
    var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator, $denominator"
    }

    fun multiplication(fraction: Fraction): Float {
        return ((numerator * fraction.numerator) / (denominator * fraction.denominator))
    }

    fun division(fraction: Fraction): Float {
        return ((numerator * fraction.denominator) / (denominator * fraction.numerator))
    }

    fun addition(fraction: Fraction): Float {
        if (denominator == fraction.denominator) {
            return ((numerator + fraction.numerator) / denominator)
        }
        else {
            println("ვერ შევკრიბე")}

        return 0F
    }

    fun Subtraction(fraction: Fraction): Float {
        if (denominator == fraction.denominator){
            return((numerator - fraction.numerator)/denominator)
        }
        else{
            println("ვერ გამოვაკელი")
        }
        return 0F
    }




}



