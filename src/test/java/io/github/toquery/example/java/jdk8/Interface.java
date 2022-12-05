package io.github.toquery.example.java.jdk8;

/**
 *
 */
public interface Interface {
    // implements 该接口的类将自动获取该方法
    default void h(){}

    // 在接口定义的属性直接被视为 static
    double Pi = 3.1415;

    // 可以在接口直接定义静态方法
    static void f(){}

}
