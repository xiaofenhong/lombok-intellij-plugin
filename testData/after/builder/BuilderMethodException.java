// Generated by delombok at Sat Jun 11 16:42:02 CEST 2016

class Exception {
}

public class BuilderMethodException {
  private static void foo(int i) throws Exception {
    System.out.println("sss");
  }

  public static void main(String[] args) {
    try {
      builder().i(2).build();
    } catch (Exception ignore) {
    }
  }


  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static class VoidBuilder {
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private int i;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    VoidBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public VoidBuilder i(final int i) {
      this.i = i;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public void build() throws Exception {
      BuilderMethodException.foo(i);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "BuilderMethodException.VoidBuilder(i=" + this.i + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static VoidBuilder builder() {
    return new VoidBuilder();
  }
}
