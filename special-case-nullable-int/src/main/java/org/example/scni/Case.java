package org.example.scni;

public interface Case {
    Integer getInt();
//  ↑
//  Here, the return type is `java.lang.Integer`, which is `Int!` in Kotlin, not `Int` nor `Int?`.
}
