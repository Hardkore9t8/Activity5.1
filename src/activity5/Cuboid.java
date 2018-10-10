package activity5;

public class Cuboid <T extends Number> {

  private  T length;
  private  T breadth;
  private  T height;

  public T getLength() {
    return length;
  }

  public void setLength(T length) {
    this.length = length;
  }

  public T getBreadth() {
    return breadth;
  }

  public void setBreadth(T breadth) {
    this.breadth = breadth;
  }

  public T getHeight() {
    return height;
  }

  public void setHeight(T height) {
    this.height = height;
  }
//needs to fix according to instructions
  //class needs an upper bounds to restrict this class to only take numbers
  @Override
  public String toString() {
    return "Cuboid{" +
        "length=" + length +
        ", breadth=" + breadth +
        ", height=" + height +
        '}';
  }
}

