package io.github.toquery.example.java.model.sealed;

//子类可以被修饰为 sealed,同上
public sealed class Student extends Person permits MiddleSchoolStudent, GraduateStudent {
} //学生
