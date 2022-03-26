package delegations

//lepsza wersja klasy SaferAccount
class SafeAccountWithPropertyDelegate(val id: Int) {
    var updateCount = 0
    var toPay: Double  by PositiveValueDelegate()
    var debt: Double by PositiveValueDelegate()
}