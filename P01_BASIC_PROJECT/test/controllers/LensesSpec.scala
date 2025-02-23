package controllers

import monocle.Lens
import monocle.macros.GenLens
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.test.Injecting

class LensesSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "Lens" should {
    "change child object" in {

      case class Address(line1: String, line2: String, postalIndex: String)
      case class Company(name: String, address: Address)

      val genericCompany = Company("noname", Address("no name street", "apt1", "NE1 1EN"))

      val addressLens = GenLens[Company](_.address)
      val postalIndexLens = GenLens[Address](_.postalIndex)

      val genericCompanyNew = (addressLens composeLens postalIndexLens).set("NE1 5DL")(genericCompany)

      println("---------add:"+genericCompanyNew)
    }
  }
}
