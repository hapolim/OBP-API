package code.api.util

object StrongCustomerAuthentication extends Enumeration {
  type SCA = Value
  val SMS = Value
  val EMAIL = Value
  val DUMMY = Value
  val UNDEFINED = Value
}

object PemCertificateRole extends Enumeration {
  type ROLE = Value
  val PSP_AS = Value
  val PSP_IC = Value
  val PSP_AI = Value
  val PSP_PI = Value
}