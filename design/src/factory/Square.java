package factory;

/**
 * Created by jihun.im on 2017-04-28.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
