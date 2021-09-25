package io.dropwizard.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class StringsTest {

  @Test
  void emptyToNull() {
      assertThat(Strings.emptyToNull("A"))
          .isEqualTo("A");
      assertThat(Strings.emptyToNull("")).isNull();
      assertThat(Strings.emptyToNull(null)).isNull();
  }

  @Test
  void isNullOrEmpty() {
      assertThat(Strings.isNullOrEmpty("A")).isFalse();
      assertThat(Strings.isNullOrEmpty("")).isTrue();
      assertThat(Strings.isNullOrEmpty(null)).isTrue();
  }

  @Test
  void nullToEmpty() {
      assertThat(Strings.nullToEmpty("")).isEmpty();
      assertThat(Strings.nullToEmpty(null)).isEmpty();
      assertThat(Strings.nullToEmpty("foo")).isEqualTo("foo");
  }
}
