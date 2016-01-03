package services

import com.foo.model.key
import org.mockito.Mockito._

trait FooService {
  def get(id: key.FooId): Int
}