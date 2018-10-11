import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty

class HelloWorldConfiguration : Configuration() {
    @NotEmpty
    @get:JsonProperty
    @set:JsonProperty
    lateinit var template: String

    @NotEmpty
    @get:JsonProperty
    @set:JsonProperty
    var defaultName = "Stranger"
}