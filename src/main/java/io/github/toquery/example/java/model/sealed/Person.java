package io.github.toquery.example.java.model.sealed;

/**
 * 人
 */
public sealed class Person permits Teacher, Worker, Student {
}
