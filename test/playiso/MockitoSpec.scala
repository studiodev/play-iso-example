package playiso

import org.scalatest._
import org.scalatestplus.play._
import org.scalatest.mock._
import play.api.mvc._
import play.api.test._, Helpers._

import services.FooService

import org.mockito.Mockito._
import org.mockito.Matchers

class MockitoSpec extends PlaySpec with MockitoSugar {

  "foo" should {

    val service: FooService = mock[FooService]
    when(service.get(Matchers.any())).thenReturn(1)

    "xx" mustBe "xx"
  }
}

/*

Same with raw version :

import org.mockito.Mockito._
import org.mockito.Matchers

class MockitoSpec extends PlaySpec  {

  "foo" should {

    val service: FooService = org.mockito.Mockito.mock(classOf[FooService])
    when(service.get(Matchers.any())).thenReturn(1)

    "xx" mustBe "xx"
  }
}
*/