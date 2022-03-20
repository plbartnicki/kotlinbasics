package integrationwithjava

import java.math.BigDecimal

fun main() {
    val num = BigDecimal(123)
    print(num)
    
    Logger.logMessage(LogType.WARNING, "warning message")
}